/**
 * 
 */
package com.tiempometa.printer.result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tiempometa.printer.Report;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * @author gtasi
 *
 */
public class TeamResultReport implements Report {

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

	private List<TeamResultRow> rows = new ArrayList<TeamResultRow>();

	@Override
	public String getTemplate() {
		return reportTemplate;
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

	public String getEventTitle() {
		return eventTitle;
	}

	public String getEventSubtitle() {
		return eventSubtitle;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public String getEventDate() {
		return eventDate;
	}

	public String getImageTopLeft() {
		return imageTopLeft;
	}

	public String getImageTopRight() {
		return imageTopRight;
	}

	public String getImageBottomLeft() {
		return imageBottomLeft;
	}

	public String getImageBottomRight() {
		return imageBottomRight;
	}

	public String getDetailColumn1Title() {
		return detailColumn1Title;
	}

	public String getDetailColumn2Title() {
		return detailColumn2Title;
	}

	public String getEventWebPage() {
		return eventWebPage;
	}

	public String getEventMessage() {
		return eventMessage;
	}

	public String getReportTemplate() {
		return reportTemplate;
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public String getPrintDate() {
		return printDate;
	}

	public Integer getPrintMode() {
		return printMode;
	}

	public Integer getReportType() {
		return reportType;
	}

	public List<TeamResultRow> getRows() {
		return rows;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public void setEventSubtitle(String eventSubtitle) {
		this.eventSubtitle = eventSubtitle;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public void setImageTopLeft(String imageTopLeft) {
		this.imageTopLeft = imageTopLeft;
	}

	public void setImageTopRight(String imageTopRight) {
		this.imageTopRight = imageTopRight;
	}

	public void setImageBottomLeft(String imageBottomLeft) {
		this.imageBottomLeft = imageBottomLeft;
	}

	public void setImageBottomRight(String imageBottomRight) {
		this.imageBottomRight = imageBottomRight;
	}

	public void setDetailColumn1Title(String detailColumn1Title) {
		this.detailColumn1Title = detailColumn1Title;
	}

	public void setDetailColumn2Title(String detailColumn2Title) {
		this.detailColumn2Title = detailColumn2Title;
	}

	public void setEventWebPage(String eventWebPage) {
		this.eventWebPage = eventWebPage;
	}

	public void setEventMessage(String eventMessage) {
		this.eventMessage = eventMessage;
	}

	public void setReportTemplate(String reportTemplate) {
		this.reportTemplate = reportTemplate;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public void setPrintDate(String printDate) {
		this.printDate = printDate;
	}

	public void setPrintMode(Integer printMode) {
		this.printMode = printMode;
	}

	public void setReportType(Integer reportType) {
		this.reportType = reportType;
	}

	public void setRows(List<TeamResultRow> rows) {
		this.rows = rows;
	}

}
