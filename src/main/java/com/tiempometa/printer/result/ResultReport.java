/**
 * 
 */
package com.tiempometa.printer.result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import com.tiempometa.printer.Report;

/**
 * @author Gerardo Tasistro
 *
 */
public class ResultReport implements Report {
	private String reportTemplate;
	private String eventTitle;
	private String reportTitle;
	private String eventSubtitle;
	private String eventLocation;
	private String eventDate;
	private String printDate;
	private String eventWebPage;
	private String imageTopLeft;
	private String imageTopRight;
	private String imageBottomLeft;
	private String imageBottomRight;
	private String categoryName;

	private List<ResultRow> rows = new ArrayList<ResultRow>();

	public ResultReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultReport(String reportTemplate, String eventTitle, String reportTitle, String eventSubtitle,
			String eventLocation, String eventDate, String printDate, String eventWebPage, String imageTopLeft,
			String imageTopRight, String imageBottomLeft, String imageBottomRight, String categoryName,
			List<ResultRow> rows) {
		super();
		this.reportTemplate = reportTemplate;
		this.eventTitle = eventTitle;
		this.reportTitle = reportTitle;
		this.eventSubtitle = eventSubtitle;
		this.eventLocation = eventLocation;
		this.eventDate = eventDate;
		this.printDate = printDate;
		this.eventWebPage = eventWebPage;
		this.imageTopLeft = imageTopLeft;
		this.imageTopRight = imageTopRight;
		this.imageBottomLeft = imageBottomLeft;
		this.imageBottomRight = imageBottomRight;
		this.categoryName = categoryName;
		this.rows = rows;
	}

	public ResultReport(String reportTemplate, List<ResultRow> rows) {
		this.reportTemplate = reportTemplate;
		this.rows = rows;
	}

	/**
	 * @return the reportTemplate
	 */
	public String getReportTemplate() {
		return reportTemplate;
	}

	/**
	 * @param reportTemplate the reportTemplate to set
	 */
	public void setReportTemplate(String reportTemplate) {
		this.reportTemplate = reportTemplate;
	}

	/**
	 * @return the eventTitle
	 */
	public String getEventTitle() {
		return eventTitle;
	}

	/**
	 * @param eventTitle the eventTitle to set
	 */
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	/**
	 * @return the eventSubtitle
	 */
	public String getEventSubtitle() {
		return eventSubtitle;
	}

	/**
	 * @param eventSubtitle the eventSubtitle to set
	 */
	public void setEventSubtitle(String eventSubtitle) {
		this.eventSubtitle = eventSubtitle;
	}

	/**
	 * @return the eventLocation
	 */
	public String getEventLocation() {
		return eventLocation;
	}

	/**
	 * @param eventLocation the eventLocation to set
	 */
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	/**
	 * @return the eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}

	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	/**
	 * @return the printDate
	 */
	public String getPrintDate() {
		return printDate;
	}

	/**
	 * @param printDate the printDate to set
	 */
	public void setPrintDate(String printDate) {
		this.printDate = printDate;
	}

	/**
	 * @return the eventWebPage
	 */
	public String getEventWebPage() {
		return eventWebPage;
	}

	/**
	 * @param eventWebPage the eventWebPage to set
	 */
	public void setEventWebPage(String eventWebPage) {
		this.eventWebPage = eventWebPage;
	}

	/**
	 * @return the imageTopLeft
	 */
	public String getImageTopLeft() {
		return imageTopLeft;
	}

	/**
	 * @param imageTopLeft the imageTopLeft to set
	 */
	public void setImageTopLeft(String imageTopLeft) {
		this.imageTopLeft = imageTopLeft;
	}

	/**
	 * @return the imageTopRight
	 */
	public String getImageTopRight() {
		return imageTopRight;
	}

	/**
	 * @param imageTopRight the imageTopRight to set
	 */
	public void setImageTopRight(String imageTopRight) {
		this.imageTopRight = imageTopRight;
	}

	/**
	 * @return the imageBottomLeft
	 */
	public String getImageBottomLeft() {
		return imageBottomLeft;
	}

	/**
	 * @param imageBottomLeft the imageBottomLeft to set
	 */
	public void setImageBottomLeft(String imageBottomLeft) {
		this.imageBottomLeft = imageBottomLeft;
	}

	/**
	 * @return the imageBottomRight
	 */
	public String getImageBottomRight() {
		return imageBottomRight;
	}

	/**
	 * @param imageBottomRight the imageBottomRight to set
	 */
	public void setImageBottomRight(String imageBottomRight) {
		this.imageBottomRight = imageBottomRight;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the rows
	 */
	public List<ResultRow> getRows() {
		return rows;
	}

	/**
	 * @param rows the rows to set
	 */
	public void setRows(List<ResultRow> rows) {
		this.rows = rows;
	}

	@Override
	public JRDataSource getDataSource() {
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(rows);
		return dataSource;
	}

	@Override
	public Map<String, Object> getParamMap() {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("EVENT_TITLE", this.getEventTitle());
		paramMap.put("EVENT_SUBTITLE", this.getEventSubtitle());
		paramMap.put("EVENT_LOCATION", this.getEventLocation());
		paramMap.put("EVENT_DATE", this.getEventDate());
		paramMap.put("EVENT_WEBPAGE", this.getEventWebPage());
		paramMap.put("REPORT_TITLE", this.getReportTitle());
		paramMap.put("CATEGORY_NAME", this.getCategoryName());
		paramMap.put("IMAGE_TOP_RIGHT", this.getImageTopRight());
		paramMap.put("IMAGE_TOP_LEFT", this.getImageTopLeft());
		paramMap.put("IMAGE_BOTTOM_RIGHT", this.getImageBottomRight());
		paramMap.put("IMAGE_BOTTOM_LEFT", this.getImageBottomLeft());
		paramMap.put("REPORT_PRINT_TIME", this.getPrintDate());

		return paramMap;
	}

	/**
	 * @return the reportTitle
	 */
	public String getReportTitle() {
		return reportTitle;
	}

	/**
	 * @param reportTitle the reportTitle to set
	 */
	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	@Override
	public String getTemplate() {
		return getReportTemplate();
	}

}
