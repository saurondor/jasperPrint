/**
 * 
 */
package com.tiempometa.printer;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.print.PrintService;

import net.sf.jasperreports.engine.JRException;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tiempometa.printer.label.LabelReport;
import com.tiempometa.printer.label.LabelRow;
import com.tiempometa.printer.result.ResultReport;
import com.tiempometa.printer.result.ResultRow;
import com.tiempometa.printer.result.ResultSplit;

/**
 * @author Gerardo Tasistro
 *
 */
public class PrinterTest {

	private static final Logger logger = Logger.getLogger(PrinterTest.class);

	private String reportTemplate = "C:\\Users\\Gerardo Tasistro\\Documents\\tiempometa\\development\\general.jasper";
	private String labelTemplate = "C:\\Users\\Gerardo Tasistro\\Documents\\tiempometa\\development\\etiqueta3x1.jasper";
	private String eventTitle = "10K Tiempo Meta";
	private String reportTitle = "Listado General";
	private String eventSubtitle = "10K";
	private String eventLocation = "México DF";
	private String eventDate = "Fecha 12-12-12";
	private String printDate = "Fecha 23-23-23";
	private String eventWebPage = "";
	private String imageTopLeft = "C:\\Users\\Gerardo Tasistro\\Desktop\\redgreenrefacor.png";
	private String imageTopRight = "C:\\Users\\Gerardo Tasistro\\Desktop\\redgreenrefacor.png";
	private String imageBottomLeft = "C:\\Users\\Gerardo Tasistro\\Desktop\\redgreenrefacor.png";
	private String imageBottomRight = "C:\\Users\\Gerardo Tasistro\\Desktop\\redgreenrefacor.png";
	private String categoryName = "Libre Varonil";

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

	/**
	 * Test method for {@link com.tiempometa.printer.Printer#getPrintServices()}.
	 */
	@Test
	public void testGetPrintServices() {
		PrintService[] services = Printer.getPrintServices();
		assertNotSame(services.length, 0);
	}

	/**
	 * Test method for
	 * {@link com.tiempometa.printer.Printer#printToImage(com.tiempometa.printer.Report, java.lang.Float)}.
	 */
	@Test
	public void testPrintToImage() {
//		List<ResultRow> rows = new ArrayList<ResultRow>();
//		List<ResultSplit> splits = new ArrayList<ResultSplit>();
//		ResultRow row = new ResultRow("22", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic",
//				"Libre Varonil", "1:23:23", "+04:34", "1:26:23", "+06:34", 1, 10, 2, 4, 5, 5, new Date(), "TiempoMeta",
//				"Mexico", splits);
//		rows.add(row);
//		ResultReport report = new ResultReport(reportTemplate, eventTitle, reportTitle, eventSubtitle, eventLocation,
//				eventDate, printDate, eventWebPage, imageTopLeft, imageTopRight, imageBottomLeft, imageBottomRight,
//				categoryName, rows);
//		try {
//			Printer.printToImage(report, 1f);
//			Printer.printToImage(report, 1f);
//		} catch (JRException e) {
//			e.printStackTrace();
//			fail(e.getMessage());
//		}
	}

	/**
	 * Test method for
	 * {@link com.tiempometa.printer.Printer#printToPrinter(com.tiempometa.printer.Report, boolean)}.
	 */
	@Test
	public void testPrintToPrinterReportBoolean() {
//		List<ResultRow> rows = new ArrayList<ResultRow>();
//		List<ResultSplit> splits = new ArrayList<ResultSplit>();
//		ResultRow row = new ResultRow("22", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic",
//				"Libre Varonil", "1:23:23", "+04:34", "1:26:23", "+06:34", 1, 10, 2, 4, 5, 5, new Date(), "TiempoMeta",
//				"Mexico", splits);
//		rows.add(row);
//		ResultReport report = new ResultReport(reportTemplate, eventTitle, reportTitle, eventSubtitle, eventLocation,
//				eventDate, printDate, eventWebPage, imageTopLeft, imageTopRight, imageBottomLeft, imageBottomRight,
//				categoryName, rows);
//		try {
//			Printer.printToPrinter(report, false);
//			Printer.printToPrinter(report, true);
//		} catch (JRException e) {
//			e.printStackTrace();
//			fail(e.getMessage());
//		}
	}

	/**
	 * Test method for
	 * {@link com.tiempometa.printer.Printer#printToPrinter(com.tiempometa.printer.Report, javax.print.PrintService, boolean)}.
	 */
	@Test
	public void testPrintToPrinterReportPrintServiceBoolean() {
//		PrintService[] services = Printer.getPrintServices();
//		List<ResultRow> rows = new ArrayList<ResultRow>();
//		List<ResultSplit> splits = new ArrayList<ResultSplit>();
//		ResultRow row = new ResultRow("22", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic",
//				"Libre Varonil", "1:23:23", "+04:34", "1:26:23", "+06:34", 1, 10, 2, 4, 5, 5, new Date(), "TiempoMeta",
//				"Mexico", splits);
//		rows.add(row);
//		ResultReport report = new ResultReport(reportTemplate, eventTitle, reportTitle, eventSubtitle, eventLocation,
//				eventDate, printDate, eventWebPage, imageTopLeft, imageTopRight, imageBottomLeft, imageBottomRight,
//				categoryName, rows);
//		try {
//			Printer.printToPrinter(report, services[0], false);
//			Printer.printToPrinter(report, services[0], true);
//		} catch (JRException e) {
//			e.printStackTrace();
//			fail(e.getMessage());
//		}
	}

	@Test
	public void testLabelToPrinterReportPrintServiceBoolean() {
//		logger.info("Print label test");
//		List<LabelRow> rows = new ArrayList<LabelRow>();
//		LabelRow row = new LabelRow("2344", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic",
//				"gtasistro@gmail.com", 39, "M", new Date(), "Libre Varonil", "LV", "I923423422",
//				"003434-323432-234234-234324-223422", "P232334345", "$234.00", "Medio Maraton Atlas Colomos", "10K", "",
//				"Rojo", null, "", null, null, new Date(), "Tiempo Meta", "Texcoco", null);
//		rows.add(row);
//		row = new LabelRow("2345", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic",
//				"gtasistro@gmail.com", 39, "M", new Date(), "Libre Varonil", "LV", "I923423422",
//				"003434-323432-234234-234324-223422", "P232334345", "$234.00", "Medio Maraton Atlas Colomos", "10K", "",
//				"Rojo", null, "", null, null, new Date(), "Tiempo Meta", "Texcoco", null);
//		rows.add(row);
//		row = new LabelRow("2346", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic",
//				"gtasistro@gmail.com", 39, "M", new Date(), "Libre Varonil", "LV", "I923423422",
//				"003434-323432-234234-234324-223422", "P232334345", "$234.00", "Medio Maraton Atlas Colomos", "10K", "",
//				"Rojo", null, "", null, null, new Date(), "Tiempo Meta", "Texcoco", null);
//		rows.add(row);
//		row = new LabelRow("2347", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic",
//				"gtasistro@gmail.com", 39, "M", new Date(), "Libre Varonil", "LV", "I923423422",
//				"003434-323432-234234-234324-223422", "P232334345", "$234.00", "Medio Maraton Atlas Colomos", "10K", "",
//				"Rojo", null, "", null, null, new Date(), "Tiempo Meta", "Texcoco", null);
//		rows.add(row);
//		PrintService printer = null;
//		PrintService[] services = Printer.getPrintServices();
//		for (int i = 0; i < services.length; i++) {
//			logger.info(services[i].getName());
//			if (services[i].getName().contains("ZDesigner")) {
//				printer = services[i];
//			}
//		}
//		LabelReport report = new LabelReport(labelTemplate, rows);
//		try {
//			Printer.printToPrinter(report, printer, false);
//			Printer.printToPrinter(report, printer, true);
//		} catch (JRException e) {
//			e.printStackTrace();
//			fail(e.getMessage());
//		}
	}

}
