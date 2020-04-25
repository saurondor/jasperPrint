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

	public static final int REPORT_TYPE_GUN = 0;
	public static final int REPORT_TYPE_CHIP = 1;
	public static final int PRINT_MODE_OFFICIAL = 0;
	public static final int PRINT_MODE_PRELIMINARY = 1;

	private String eventTitle;
	private String eventSubtitle;
	private String eventLocation;
	private String eventDate;

	private String imageTopLeft;
	private String imageTopRight;
	private String imageBottomLeft;
	private String imageBottomRight;

	private String detailColumn1Title;
	private String detailColumn2Title;

	private String eventWebPage;
	private String eventMessage;

	private String reportTemplate;
	private String reportTitle;
	private String printDate;
	private Integer printMode = PRINT_MODE_PRELIMINARY;
	private Integer reportType = REPORT_TYPE_GUN;

	private List<ResultRow> rows = new ArrayList<ResultRow>();

	public ResultReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultReport(String eventTitle, String eventSubtitle, String eventLocation, String eventDate,
			String imageTopLeft, String imageTopRight, String imageBottomLeft, String imageBottomRight,
			String detailColumn1Title, String detailColumn2Title, String eventWebPage, String eventMessage,
			String reportTemplate, String reportTitle, String printDate, Integer printMode, Integer reportType,
			List<ResultRow> rows) {
		super();
		this.eventTitle = eventTitle;
		this.eventSubtitle = eventSubtitle;
		this.eventLocation = eventLocation;
		this.eventDate = eventDate;
		this.imageTopLeft = imageTopLeft;
		this.imageTopRight = imageTopRight;
		this.imageBottomLeft = imageBottomLeft;
		this.imageBottomRight = imageBottomRight;
		this.detailColumn1Title = detailColumn1Title;
		this.detailColumn2Title = detailColumn2Title;
		this.eventWebPage = eventWebPage;
		this.eventMessage = eventMessage;
		this.reportTemplate = reportTemplate;
		this.reportTitle = reportTitle;
		this.printDate = printDate;
		this.printMode = printMode;
		this.reportType = reportType;
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
		paramMap.put("IMAGE_TOP_RIGHT", this.getImageTopRight());
		paramMap.put("IMAGE_TOP_LEFT", this.getImageTopLeft());
		paramMap.put("IMAGE_BOTTOM_RIGHT", this.getImageBottomRight());
		paramMap.put("IMAGE_BOTTOM_LEFT", this.getImageBottomLeft());
		paramMap.put("REPORT_PRINT_TIME", this.getPrintDate());
		paramMap.put("RESULT_REPORT_PRINT_MODE", this.getPrintMode());
		paramMap.put("RESULT_REPORT_TYPE", this.getReportType());
		paramMap.put("EVENT_TITLE", this.getEventTitle());
		paramMap.put("DETAIL_COLUMN_1_TITLE", this.getDetailColumn1Title());
		paramMap.put("DETAIL_COLUMN_2_TITLE", this.getDetailColumn2Title());
		paramMap.put("EVENT_SUBTITLE", this.getEventSubtitle());
		paramMap.put("EVENT_LOCATION", this.getEventLocation());
		paramMap.put("EVENT_DATE", this.getEventDate());
		paramMap.put("EVENT_WEBPAGE", this.getEventWebPage());
		paramMap.put("EVENT_REPORT_TITLE", this.getReportTitle());
		paramMap.put("EVENT_REPORT_MESSAGE", this.getEventMessage());
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

	public String getEventMessage() {
		return eventMessage;
	}

	public Integer getPrintMode() {
		return printMode;
	}

	public Integer getReportType() {
		return reportType;
	}

	public void setEventMessage(String eventMessage) {
		this.eventMessage = eventMessage;
	}

	public void setPrintMode(Integer printMode) {
		this.printMode = printMode;
	}

	public void setReportType(Integer reportType) {
		this.reportType = reportType;
	}

	public String getDetailColumn1Title() {
		return detailColumn1Title;
	}

	public String getDetailColumn2Title() {
		return detailColumn2Title;
	}

	public void setDetailColumn1Title(String detailColumn1Title) {
		this.detailColumn1Title = detailColumn1Title;
	}

	public void setDetailColumn2Title(String detailColumn2Title) {
		this.detailColumn2Title = detailColumn2Title;
	}

}
