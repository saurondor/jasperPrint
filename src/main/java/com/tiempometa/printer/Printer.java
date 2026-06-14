/*
 * Copyright (c) 2019 Gerardo Esteban Tasistro Giubetic
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */
package com.tiempometa.printer;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Handles printing of a {@link Report} and provides helper methods.
 * 
 * @author Gerardo Esteban Tasistro Giubetic
 * 
 */
public class Printer {

	/**
	 * Returns a list of available printer services (printers available).
	 * 
	 * @return
	 */
	public static PrintService[] getPrintServices() {
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		aset.add(MediaSizeName.NA_LETTER);
		PrintService[] pservices = PrintServiceLookup.lookupPrintServices(null, null);
		return pservices;
	}

	/**
	 * Opens a preview window with the provided {@link Report}. The print template
	 * Jasper file is take from the Report setting.
	 * 
	 * @param report Report settings
	 * @throws JRException
	 */
	public static void printPreview(Report report) throws JRException {
		JasperPrint jasperPrint = JasperFillManager.fillReport(report.getTemplate(), report.getParamMap(),
				report.getDataSource());
		JasperViewer.viewReport(jasperPrint, false);
	}

	/**
	 * Opens a preview window with the provided {@link Report}. The print template
	 * Jasper file is take from the provided input stream.
	 * 
	 * @param report      Report settings
	 * @param inputStream Stream to Jasper template
	 * @throws JRException
	 */
	public static void printPreview(Report report, InputStream inputStream) throws JRException {
		JasperPrint jasperPrint = JasperFillManager.fillReport(inputStream, report.getParamMap(),
				report.getDataSource());
		JasperViewer.viewReport(jasperPrint, false);
	}

	/**
	 * Generates an image from the provided {@link Report} with the provided zoom
	 * level.
	 * 
	 * @param report Report settings
	 * @param zoom   Image zoom level
	 * @return
	 * @throws JRException
	 */
	public static Image printToImage(Report report, Float zoom) throws JRException {
		JasperPrint print = JasperFillManager.fillReport(report.getTemplate(), report.getParamMap(),
				report.getDataSource());
		Image image = JasperPrintManager.printPageToImage(print, 0, zoom);
		return image;
	}

	/**
	 * Generates an image from the provided {@link Report} with the provided zoom
	 * level.
	 * 
	 * @param report      Report settings
	 * @param zoom        Image zoom level
	 * @param inputStream Stream to Jasper template
	 * @return
	 * @throws JRException
	 */
	public static Image printToImage(Report report, Float zoom, InputStream inputStream) throws JRException {
		JasperPrint print = JasperFillManager.fillReport(inputStream, report.getParamMap(), report.getDataSource());
		Image image = JasperPrintManager.printPageToImage(print, 0, zoom);
		return image;
	}

	/**
	 * Prints report with a printer dialogue window.
	 * 
	 * @param report       Report settings
	 * @param withDialogue Flag indicating if a printer dialogue should be opene
	 *                     prior to printing
	 * @param inputStream  Input stream to Jasper template
	 * @throws JRException
	 */
	public static void printToPrinter(Report report, boolean withDialogue, InputStream inputStream) throws JRException {
		JasperPrint print = JasperFillManager.fillReport(inputStream, report.getParamMap(), report.getDataSource());
		JasperPrintManager.printReport(print, withDialogue);
	}

	/**
	 * Prints report with a printer dialogue window. Uses template settings from
	 * report.
	 * 
	 * @param report       Report settings
	 * @param withDialogue Flag indicating if a printer dialogue should be opene
	 *                     prior to printing
	 * @throws JRException
	 */
	public static void printToPrinter(Report report, boolean withDialogue) throws JRException {
		JasperPrint print = JasperFillManager.fillReport(report.getTemplate(), report.getParamMap(),
				report.getDataSource());
		JasperPrintManager.printReport(print, withDialogue);
	}

	/**
	 * Prints report to specified printer service (printer) with printer dialogue if
	 * withDialogue TRUE.
	 * 
	 * @param report       Report settings
	 * @param printService Printer to print to
	 * @param withDialogue Flag indicating if a printer dialogue should be opene
	 *                     prior to printing
	 * @param inputStream  Input stream to Jasper template
	 * @throws JRException
	 */
	public static void printToPrinter(Report report, PrintService printService, boolean withDialogue,
			InputStream inputStream) throws JRException {
		JasperPrint print = JasperFillManager.fillReport(inputStream, report.getParamMap(), report.getDataSource());
		JRPrintServiceExporter exporter = new JRPrintServiceExporter();
		exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
		exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET,
				printService.getAttributes());
		exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
		exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, withDialogue);
		exporter.exportReport();
	}

	/**
	 * Prints report to specified printer service (printer) with printer dialogue if
	 * withDialogue TRUE. Uses template settings from report.
	 * 
	 * @param report       Report settings
	 * @param printService Printer to print to
	 * @param withDialogue Flag indicating if a printer dialogue should be opene
	 *                     prior to printing
	 * @throws JRException
	 */
	/**
	 * Renders all pages of a report to a list of images.
	 * Returns an empty list if the report has no data.
	 *
	 * @param report the report to render
	 * @param zoom   scale factor (1.0 = native page size)
	 */
	public static List<Image> renderAllPages(Report report, float zoom) throws JRException {
		try {
			InputStream is = report.getReportInputStream();
			return renderAllPages(report, zoom, is);
		} catch (FileNotFoundException e) {
			throw new JRException("Report template not found: " + e.getMessage(), e);
		}
	}

	/**
	 * Renders all pages of a report to a list of images using a provided stream.
	 */
	public static List<Image> renderAllPages(Report report, float zoom, InputStream inputStream)
			throws JRException {
		JasperPrint print = JasperFillManager.fillReport(
				inputStream, report.getParamMap(), report.getDataSource());
		if (print.getPages() == null || print.getPages().isEmpty()) {
			return Collections.emptyList();
		}
		List<Image> pages = new ArrayList<>(print.getPages().size());
		for (int i = 0; i < print.getPages().size(); i++) {
			pages.add(JasperPrintManager.printPageToImage(print, i, zoom));
		}
		return pages;
	}

	public static void printToPrinter(Report report, PrintService printService, boolean withDialogue)
			throws JRException {
		JasperPrint print = JasperFillManager.fillReport(report.getTemplate(), report.getParamMap(),
				report.getDataSource());
		JRPrintServiceExporter exporter = new JRPrintServiceExporter();
		exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
		// exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET,
		// printRequestAttributeSet);
		exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET,
				printService.getAttributes());
		exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
		exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, withDialogue);
		exporter.exportReport();
	}
}
