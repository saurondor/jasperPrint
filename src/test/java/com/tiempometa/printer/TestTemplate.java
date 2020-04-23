/**
 * 
 */
package com.tiempometa.printer;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.print.PrintService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tiempometa.printer.result.ResultReport;
import com.tiempometa.printer.result.ResultRow;
import com.tiempometa.printer.result.ResultSplit;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author gtasi
 *
 */
public class TestTemplate {
	private static final String TEMPLATE = "C:\\Users\\gtasi\\JaspersoftWorkspace\\MyReports\\results_listing.jrxml";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTemplate() {
		FileInputStream inputStream;
		try {
			File inputFile = new File(TEMPLATE);
			if (!inputFile.exists()) {
				fail("Template file does not exist");
			}
			inputStream = new FileInputStream(inputFile);
//			inputStream.
			List<ResultRow> rows = new ArrayList<ResultRow>();
			ResultRow row = new ResultRow();
			row.setFullName("TEST NAME");
			ResultSplit split = new ResultSplit();
			List<ResultSplit> splits = new ArrayList<ResultSplit>();
			split.setName("5K");
			split.setTime("12:18:45.34");
			split.setSpeed("04:23 min/km");
			splits.add(split);
			split = new ResultSplit();
			split.setName("10K");
			split.setTime("11:17:45.89");
			split.setSpeed("04:13 min/km");
			splits.add(split);
			row.setSplits(splits);
			rows.add(row);
			ResultReport report = new ResultReport(TEMPLATE, rows);
			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
			JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(),
					report.getDataSource());
			JasperViewer.viewReport(print);
			Thread.sleep(20000);
//			JRPrintServiceExporter exporter = new JRPrintServiceExporter();
//			PrintService printService = getPrintService();
//			exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
//			exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET,
//					printService.getAttributes());
//			exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
//			exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, true);
//			exporter.exportReport();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private PrintService getPrintService() {

		PrintService[] services = Printer.getPrintServices();
		for (PrintService printService : services) {
			if (printService.getName().toUpperCase().contains("PDF")) {
				return printService;
			}
		}
		return null;
	}

}
