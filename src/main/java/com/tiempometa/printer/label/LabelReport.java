/**
 * 
 */
package com.tiempometa.printer.label;

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

/**
 * @author Gerardo Tasistro
 *
 */
public class LabelReport implements Report {
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
	public static final int PRINT_DISTANCE_TITLE_NONE = 0;
	public static final int PRINT_DISTANCE_TITLE_POST = 1;
	public static final int PRINT_DISTANCE_TITLE_PRE = 2;
	public static final String TEMPLATE_MODE_3_BY_1 = "3by1Template";
	public static final String TEMPLATE_MODE_3_BY_2 = "3by2Template";
	public static final String TEMPLATE_MODE_CUSTOM = "customTemplate";
	private String template;
	private File templateFile;
	private String detailColumn1Title;
	private String detailColumn2Title;
	private String detailColumn1Column;
	private String detailColumn2Column;
	private int labelDistancePrint;
	private String eventMessage;

	private List<LabelRow> rows = new ArrayList<LabelRow>();

	@Override
	public InputStream getReportInputStream() throws FileNotFoundException {
		InputStream stream = null;
		if (templateFile == null) {
			stream = LabelReport.class.getResourceAsStream(template);
		} else {
			stream = new FileInputStream(templateFile);
		}
		return stream;
	}

	public LabelReport(File templateFile, List<LabelRow> rows) {
		this.rows = rows;
		this.templateFile = templateFile;
	}

	public LabelReport(String template, List<LabelRow> rows) {
		this.rows = rows;
		this.template = template;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tiempometa.printer.Report#getTemplate()
	 */
	@Override
	public String getTemplate() {
		return template;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tiempometa.printer.Report#getDataSource()
	 */
	@Override
	public JRDataSource getDataSource() {
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(rows);
		return dataSource;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tiempometa.printer.Report#getParamMap()
	 */
	@Override
	public Map<String, Object> getParamMap() {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("DETAIL_COLUMN_1_TITLE", this.getDetailColumn1Title());
		paramMap.put("DETAIL_COLUMN_2_TITLE", this.getDetailColumn2Title());
		paramMap.put("EVENT_REPORT_MESSAGE", this.getEventMessage());
		return paramMap;
	}

	public String getDetailColumn1Title() {
		return detailColumn1Title;
	}

	public String getDetailColumn2Title() {
		return detailColumn2Title;
	}

	public String getDetailColumn1Column() {
		return detailColumn1Column;
	}

	public String getDetailColumn2Column() {
		return detailColumn2Column;
	}

	public List<LabelRow> getRows() {
		return rows;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public void setDetailColumn1Title(String detailColumn1Title) {
		this.detailColumn1Title = detailColumn1Title;
	}

	public void setDetailColumn2Title(String detailColumn2Title) {
		this.detailColumn2Title = detailColumn2Title;
	}

	public void setDetailColumn1Column(String detailColumn1Column) {
		this.detailColumn1Column = detailColumn1Column;
	}

	public void setDetailColumn2Column(String detailColumn2Column) {
		this.detailColumn2Column = detailColumn2Column;
	}

	public void setRows(List<LabelRow> rows) {
		this.rows = rows;
	}

	public String getEventMessage() {
		return eventMessage;
	}

	public void setEventMessage(String eventMessage) {
		this.eventMessage = eventMessage;
	}

	public File getTemplateFile() {
		return templateFile;
	}

	public void setTemplateFile(File templateFile) {
		this.templateFile = templateFile;
	}

	public int getLabelDistancePrint() {
		return labelDistancePrint;
	}

	public void setLabelDistancePrint(int labelDistancePrint) {
		this.labelDistancePrint = labelDistancePrint;
	}

}
