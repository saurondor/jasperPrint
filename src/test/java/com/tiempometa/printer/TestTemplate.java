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
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tiempometa.printer.result.ResultReport;
import com.tiempometa.printer.result.TeamResultReport;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author gtasi
 *
 */
public class TestTemplate {
	private static final String SPLITS_TEMPLATE = "C:\\Users\\gtasi\\JaspersoftWorkspace\\MyReports\\results_listing_splits.jrxml";
	private static final String SIMPLE_TEMPLATE = "C:\\Users\\gtasi\\JaspersoftWorkspace\\MyReports\\results_listing_simple.jrxml";
	private static final String TEAMS_TEMPLATE = "C:\\Users\\gtasi\\JaspersoftWorkspace\\MyReports\\results_listing_teams.jrxml";

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
	public void testTeamTemplate() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test_team_print_report.xml");
		FileInputStream inputStream;
		try {
			File inputFile = new File(TEAMS_TEMPLATE);
			if (!inputFile.exists()) {
				fail("Template file does not exist");
			}
			inputStream = new FileInputStream(inputFile);
			TeamResultReport report = (TeamResultReport) ctx.getBean("team_result_report");
			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
			JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(),
					report.getDataSource());
			JasperViewer.viewReport(print);
			Thread.sleep(30000);
			ctx.close();
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

	@Test
	public void testSimpleTemplate() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test_print_report.xml");
		FileInputStream inputStream;
		try {
			File inputFile = new File(SIMPLE_TEMPLATE);
			if (!inputFile.exists()) {
				fail("Template file does not exist");
			}
			inputStream = new FileInputStream(inputFile);
			ResultReport report = (ResultReport) ctx.getBean("result_report");
			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
			JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(),
					report.getDataSource());
			JasperViewer.viewReport(print);
			Thread.sleep(30000);
			ctx.close();
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

	@Test
	public void testSplitsTemplate() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test_print_report.xml");
		FileInputStream inputStream;
		try {
			File inputFile = new File(SPLITS_TEMPLATE);
			if (!inputFile.exists()) {
				fail("Template file does not exist");
			}
			inputStream = new FileInputStream(inputFile);
			ResultReport report = (ResultReport) ctx.getBean("result_report");
			JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
			JasperPrint print = JasperFillManager.fillReport(jasperReport, report.getParamMap(),
					report.getDataSource());
			JasperViewer.viewReport(print);
			Thread.sleep(30000);
			ctx.close();
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
