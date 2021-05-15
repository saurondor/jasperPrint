/**
 * 
 */
package com.tiempometa.printer.result;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import com.tiempometa.printer.Report;
import com.tiempometa.printer.label.LabelReport;

/**
 * @author Gerardo Tasistro
 *
 */
public class ResultReport implements Report {

	public static final int REPORT_TYPE_GUN = 0;
	public static final int REPORT_TYPE_CHIP = 1;
	public static final int REPORT_TYPE_GUN_SPLITS = 2;
	public static final int REPORT_TYPE_CHIP_SPLITS = 3;

	public static final int RESULT_POSITION_TYPE_CATEGORY = 1;
	public static final int RESULT_POSITION_TYPE_GENERAL = 2;
	public static final int RESULT_POSITION_TYPE_GENDER = 3;

	public static final int HIDE_COLUMN = 0;
	public static final int SHOW_COLUMN = 1;
	public static final int PRINT_MODE_OFFICIAL = 0;
	public static final int PRINT_MODE_PRELIMINARY = 1;
	public static final int PRINT_DISTANCE_TITLE_NONE = 0;
	public static final int PRINT_DISTANCE_TITLE_POST = 1;
	public static final int PRINT_DISTANCE_TITLE_PRE = 2;
	public static final String DETAIL_COLUMN_CITY = "city";
	public static final String DETAIL_COLUMN_STATE = "state";
	public static final String DETAIL_COLUMN_TEAM = "team";
	public static final String DETAIL_COLUMN_REG_EXTRA_1 = "regExtra1";
	public static final String DETAIL_COLUMN_REG_EXTRA_2 = "regExtra2";
	public static final String DETAIL_COLUMN_CAT_EXTRA_1 = "catExtra1";
	public static final String DETAIL_COLUMN_CAT_EXTRA_2 = "catExtra2";
	public static final String DETAIL_COLUMN_CAT_EXTRA_3 = "catExtra3";
	public static final String DETAIL_COLUMN_CAT_EXTRA_4 = "catExtra4";
	public static final String DETAIL_COLUMN_COLOR = "color";
	public static final String DETAIL_COLUMN_START_TIME = "startTime";
	public static final String DETAIL_COLUMN_START_DATE_TIME = "startDateTime";
	public static final String DETAIL_COLUMN_BIB_UUID = "bibUuid";
	public static final String DETAIL_COLUMN_PASS_CODE = "passCode";
	public static final String DETAIL_COLUMN_CONFIRMATION_CODE = "confirmationCode";
	public static final String DETAIL_COLUMN_CUSTOM_CODE = "customCode";

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
	private String detailColumn1Column;
	private String detailColumn2Column;

	private String eventWebPage;
	private String eventMessage;

	private String reportTemplate;
	private File reportTemplateFile;
	private String reportTitle;
	private String printDate;
	private Integer printMode = PRINT_MODE_PRELIMINARY;
	private Integer reportType = REPORT_TYPE_GUN;
	private Integer showChipTime = SHOW_COLUMN;
	private Integer showPace = SHOW_COLUMN;
	private Integer positionType = RESULT_POSITION_TYPE_CATEGORY;

	private List<ResultRow> rows = new ArrayList<ResultRow>();

//	public ResultReport() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public ResultReport(String eventTitle, String eventSubtitle, String eventLocation, String eventDate,
//			String imageTopLeft, String imageTopRight, String imageBottomLeft, String imageBottomRight,
//			String detailColumn1Title, String detailColumn2Title, String eventWebPage, String eventMessage,
//			String reportTemplate, String reportTitle, String printDate, Integer printMode, Integer reportType,
//			List<ResultRow> rows) {
//		super();
//		this.eventTitle = eventTitle;
//		this.eventSubtitle = eventSubtitle;
//		this.eventLocation = eventLocation;
//		this.eventDate = eventDate;
//		this.imageTopLeft = imageTopLeft;
//		this.imageTopRight = imageTopRight;
//		this.imageBottomLeft = imageBottomLeft;
//		this.imageBottomRight = imageBottomRight;
//		this.detailColumn1Title = detailColumn1Title;
//		this.detailColumn2Title = detailColumn2Title;
//		this.eventWebPage = eventWebPage;
//		this.eventMessage = eventMessage;
//		this.reportTemplate = reportTemplate;
//		this.reportTitle = reportTitle;
//		this.printDate = printDate;
//		this.printMode = printMode;
//		this.reportType = reportType;
//		this.rows = rows;
//	}

	public ResultReport(File reportTemplateFile, List<ResultRow> rows) {
		this.reportTemplateFile = reportTemplateFile;
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
		paramMap.put("RESULT_POSITION_TYPE", this.getPositionType());
		paramMap.put("EVENT_TITLE", this.getEventTitle());
		paramMap.put("DETAIL_COLUMN_1_TITLE", this.getDetailColumn1Title());
		paramMap.put("DETAIL_COLUMN_2_TITLE", this.getDetailColumn2Title());
		paramMap.put("EVENT_SUBTITLE", this.getEventSubtitle());
		paramMap.put("EVENT_LOCATION", this.getEventLocation());
		paramMap.put("EVENT_DATE", this.getEventDate());
		paramMap.put("EVENT_WEBPAGE", this.getEventWebPage());
		paramMap.put("EVENT_REPORT_TITLE", this.getReportTitle());
		paramMap.put("EVENT_REPORT_MESSAGE", this.getEventMessage());
		paramMap.put("SHOW_CHIP_TIME", this.getShowChipTime());
		paramMap.put("SHOW_PACE", this.getShowPace());
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

	public Integer getShowChipTime() {
		return showChipTime;
	}

	public Integer getShowPace() {
		return showPace;
	}

	public void setShowChipTime(Integer showChipTime) {
		this.showChipTime = showChipTime;
	}

	public void setShowPace(Integer showPace) {
		this.showPace = showPace;
	}

	public String getDetailColumn1Column() {
		return detailColumn1Column;
	}

	public String getDetailColumn2Column() {
		return detailColumn2Column;
	}

	public void setDetailColumn1Column(String detailColumn1Column) {
		this.detailColumn1Column = detailColumn1Column;
	}

	public void setDetailColumn2Column(String detailColumn2Column) {
		this.detailColumn2Column = detailColumn2Column;
	}

	@Override
	public InputStream getReportInputStream() throws FileNotFoundException {
		InputStream stream = null;
		if (reportTemplateFile == null) {
			stream = LabelReport.class.getResourceAsStream(reportTemplate);
		} else {
			stream = new FileInputStream(reportTemplateFile);
		}
		return stream;
	}

	public File getReportTemplateFile() {
		return reportTemplateFile;
	}

	public void setReportTemplateFile(File reportTemplateFile) {
		this.reportTemplateFile = reportTemplateFile;
	}

	public Integer getPositionType() {
		return positionType;
	}

	public void setPositionType(Integer positionType) {
		this.positionType = positionType;
	}

	public boolean useChipTime() {
		return getReportType().equals(ResultReport.REPORT_TYPE_CHIP)
				|| getReportType().equals(ResultReport.REPORT_TYPE_CHIP_SPLITS);
	}

}
