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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tiempometa.printer.result.ResultReport;
import com.tiempometa.printer.result.ResultRow;
import com.tiempometa.printer.result.ResultSplit;

/**
 * @author Gerardo Tasistro
 *
 */
public class PrinterTest {

	
	private String reportTemplate = "C:\\Users\\Gerardo Tasistro\\Documents\\tiempometa\\development\\general.jasper";	
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
		assertNotEquals(services.length, 0);
	}

	/**
	 * Test method for {@link com.tiempometa.printer.Printer#printToImage(com.tiempometa.printer.Report, java.lang.Float)}.
	 */
	@Test
	public void testPrintToImage() {
		List<ResultRow> rows = new ArrayList<ResultRow>();
		List<ResultSplit> splits = new ArrayList<ResultSplit>();
		ResultRow row = new ResultRow("22", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic", "Libre Varonil", "1:23:23", "+04:34", "1:26:23", "+06:34", 1, 10, 2, 4, 5, 5, new Date(), "TiempoMeta", "Mexico", splits);
		rows.add(row);
		ResultReport report = new ResultReport(reportTemplate, eventTitle, reportTitle, eventSubtitle, eventLocation, eventDate, printDate, eventWebPage, imageTopLeft, imageTopRight, imageBottomLeft, imageBottomRight, categoryName, rows);
		try {
			Printer.printToImage(report, 1f);
			Printer.printToImage(report, 1f);
		} catch (JRException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	/**
	 * Test method for {@link com.tiempometa.printer.Printer#printToPrinter(com.tiempometa.printer.Report, boolean)}.
	 */
	@Test
	public void testPrintToPrinterReportBoolean() {
		List<ResultRow> rows = new ArrayList<ResultRow>();
		List<ResultSplit> splits = new ArrayList<ResultSplit>();
		ResultRow row = new ResultRow("22", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic", "Libre Varonil", "1:23:23", "+04:34", "1:26:23", "+06:34", 1, 10, 2, 4, 5, 5, new Date(), "TiempoMeta", "Mexico", splits);
		rows.add(row);
		ResultReport report = new ResultReport(reportTemplate, eventTitle, reportTitle, eventSubtitle, eventLocation, eventDate, printDate, eventWebPage, imageTopLeft, imageTopRight, imageBottomLeft, imageBottomRight, categoryName, rows);
		try {
			Printer.printToPrinter(report, false);
			Printer.printToPrinter(report, true);
		} catch (JRException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	/**
	 * Test method for {@link com.tiempometa.printer.Printer#printToPrinter(com.tiempometa.printer.Report, javax.print.PrintService, boolean)}.
	 */
	@Test
	public void testPrintToPrinterReportPrintServiceBoolean() {
		PrintService[] services = Printer.getPrintServices();
		List<ResultRow> rows = new ArrayList<ResultRow>();
		List<ResultSplit> splits = new ArrayList<ResultSplit>();
		ResultRow row = new ResultRow("22", "Gerardo", "Tasistro", "Giubetic", "Gerardo Esteban Tasistro Giubetic", "Libre Varonil", "1:23:23", "+04:34", "1:26:23", "+06:34", 1, 10, 2, 4, 5, 5, new Date(), "TiempoMeta", "Mexico", splits);
		rows.add(row);
		ResultReport report = new ResultReport(reportTemplate, eventTitle, reportTitle, eventSubtitle, eventLocation, eventDate, printDate, eventWebPage, imageTopLeft, imageTopRight, imageBottomLeft, imageBottomRight, categoryName, rows);
		try {
			Printer.printToPrinter(report, services[0], false);
			Printer.printToPrinter(report, services[0], true);
		} catch (JRException e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
