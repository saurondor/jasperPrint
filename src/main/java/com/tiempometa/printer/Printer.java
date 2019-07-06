/**
 * 
 */
package com.tiempometa.printer;

import java.awt.Image;
import java.util.Map;

import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.Finishings;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.Sides;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author Gerardo Tasistro
 * 
 */
public class Printer {

	public static PrintService[] getPrintServices() {
		// DocFlavor psFlavor = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
		DocFlavor psFlavor = DocFlavor.READER.TEXT_PLAIN;
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		// aset.add(new Copies(2));
		aset.add(MediaSizeName.NA_LETTER);
		// aset.add(Sides.TWO_SIDED_LONG_EDGE);
		// aset.add(Finishings.STAPLE);
		PrintService[] pservices = PrintServiceLookup.lookupPrintServices(null, null);
		return pservices;
	}

	public static void printPreview(Report report) throws JRException {
		JasperPrint jasperPrint = JasperFillManager.fillReport(report.getTemplate(), report.getParamMap(),
				report.getDataSource());
		JasperViewer.viewReport(jasperPrint, false);
	}

	public static Image printToImage(Report report, Float zoom) throws JRException {
		JasperPrint print = JasperFillManager.fillReport(report.getTemplate(), report.getParamMap(),
				report.getDataSource());
		Image image = JasperPrintManager.printPageToImage(print, 0, zoom);
		return image;
	}

	public static void printToPrinter(Report report, boolean withDialogue) throws JRException {
		JasperPrint print = JasperFillManager.fillReport(report.getTemplate(), report.getParamMap(),
				report.getDataSource());
		JasperPrintManager.printReport(print, withDialogue);
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

	public static final void main(String[] args) {
		PrintService services[] = Printer.getPrintServices();
		for (int i = 0; i < services.length; i++) {
			PrintService string = services[i];
			System.out.println(string);
		}
	}
}
