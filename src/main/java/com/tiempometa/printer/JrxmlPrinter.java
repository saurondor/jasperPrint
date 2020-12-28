/**
 * 
 */
package com.tiempometa.printer;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.view.JasperViewer;

/**
 * Compiles and prints input stream
 * 
 * @author Gerardo Tasistro
 * 
 */
public class JrxmlPrinter {

	public static PrintService[] getPrintServices() {
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		aset.add(MediaSizeName.NA_LETTER);
		PrintService[] pservices = PrintServiceLookup.lookupPrintServices(null, null);
		return pservices;
	}

	public static void printPreview(Report report) throws JRException, FileNotFoundException {
		JasperReport jasperReport = JasperCompileManager.compileReport(new FileInputStream(report.getTemplate()));
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, report.getParamMap(),
				report.getDataSource());
		JasperViewer.viewReport(jasperPrint, false);
	}

	public static void printPreview(Report report, InputStream inputStream) throws JRException {
		JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, report.getParamMap(),
				report.getDataSource());
		JasperViewer.viewReport(jasperPrint, false);
	}

	public static Image printToImage(Report report, Float zoom) throws JRException, FileNotFoundException {
		JasperReport jasperReport = JasperCompileManager.compileReport(new FileInputStream(report.getTemplate()));
		JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(), report.getDataSource());
		Image image = JasperPrintManager.printPageToImage(print, 0, zoom);
		return image;
	}

	public static Image printToImage(Report report, Float zoom, InputStream inputStream) throws JRException {
		JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
		JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(), report.getDataSource());
		Image image = JasperPrintManager.printPageToImage(print, 0, zoom);
		return image;
	}

	public static void printToPrinter(Report report, boolean withDialogue, InputStream inputStream) throws JRException {
		JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
		JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(), report.getDataSource());
		JasperPrintManager.printReport(print, withDialogue);
	}

	public static void printToPrinter(Report report, boolean withDialogue) throws JRException, FileNotFoundException {
//		JasperReport jasperReport = JasperCompileManager.compileReport(new FileInputStream(report.getTemplate()));
		JasperReport jasperReport = JasperCompileManager.compileReport(report.getReportInputStream());
		JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(), report.getDataSource());
		JasperPrintManager.printReport(print, withDialogue);
	}

	public static void printToPrinter(Report report, PrintService printService, boolean withDialogue)
			throws JRException {
		try {
			printToPrinter(report, printService, withDialogue, report.getReportInputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void printToPrinter(Report report, PrintService printService, boolean withDialogue,
			InputStream inputStream) throws JRException {
		JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
		JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(), report.getDataSource());
		JRPrintServiceExporter exporter = new JRPrintServiceExporter();
		exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
		exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET,
				printService.getAttributes());
		exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
		exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, withDialogue);
		exporter.exportReport();
	}

//	public static void printToPrinter(Report report, PrintService printService, boolean withDialogue)
//			throws JRException, FileNotFoundException {
//		JasperReport jasperReport = JasperCompileManager.compileReport(new FileInputStream(report.getTemplate()));
//		JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(), report.getDataSource());
//		JRPrintServiceExporter exporter = new JRPrintServiceExporter();
//		exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
//		// exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET,
//		// printRequestAttributeSet);
//		exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET,
//				printService.getAttributes());
//		exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
//		exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, withDialogue);
//		exporter.exportReport();
//	}
}
