/*
 * Copyright (c) 2019 Gerardo Esteban Tasistro Giubetic
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
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
 * Implementation of {@link Report} to handling printing of labels on a thermal
 * transfer printer.
 * 
 * @author Gerardo Esteban Tasistro Giubetic
 *
 */
public class LabelReport implements Report {
	/**
	 * Indicates participant city field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_CITY = "city";
	/**
	 * Indicates participant state field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_STATE = "state";
	/**
	 * Indicates participant team field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_TEAM = "team";
	/**
	 * Indicates registration extra1 field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_REG_EXTRA_1 = "regExtra1";
	/**
	 * Indicates registration extra2 field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_REG_EXTRA_2 = "regExtra2";
	/**
	 * Indicates category extra1 field for us as detail column value. (Usually Color
	 * code label set on bib)
	 */
	public static final String DETAIL_COLUMN_CAT_EXTRA_1 = "catExtra1";
	/**
	 * Indicates category extra2 field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_CAT_EXTRA_2 = "catExtra2";
	/**
	 * Indicates category extra3 field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_CAT_EXTRA_3 = "catExtra3";
	/**
	 * Indicates category extra4 field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_CAT_EXTRA_4 = "catExtra4";
	/**
	 * Indicates category color code field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_COLOR = "color";
	/**
	 * Indicates participant start time field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_START_TIME = "startTime";
	/**
	 * Indicates participant start time field (in datetime format) for us as detail
	 * column value.
	 */
	public static final String DETAIL_COLUMN_START_DATE_TIME = "startDateTime";
	/**
	 * Indicates bib UUID field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_BIB_UUID = "bibUuid";
	/**
	 * Indicates bib number field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_BIB = "bib";
	/**
	 * Indicates registration pass code field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_PASS_CODE = "passCode";
	/**
	 * Indicates registration confirmation code field for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_CONFIRMATION_CODE = "confirmationCode";
	/**
	 * Indicates a custom code to parse for us as detail column value.
	 */
	public static final String DETAIL_COLUMN_CUSTOM_CODE = "customCode";
	/**
	 * Indicates the distance title should not be concatenated to the category
	 * title.
	 */
	public static final int PRINT_DISTANCE_TITLE_NONE = 0;
	/**
	 * Indicates the distance title should be concatenated after the category title.
	 */
	public static final int PRINT_DISTANCE_TITLE_POST = 1;
	/**
	 * Indicates the distance title should be concatenated prior to the category
	 * title.
	 */
	public static final int PRINT_DISTANCE_TITLE_PRE = 2;
	/**
	 * Indicates the 3x1 inch default template should be used
	 */
	public static final String TEMPLATE_MODE_3_BY_1 = "3by1Template";
	/**
	 * Indicates the 3x1 inch with barcode default template should be used
	 */
	public static final String TEMPLATE_MODE_3_BY_1_BARCODE = "3by1BarcodeTemplate";
	/**
	 * Indicates the 3x2 inch default template should be used
	 */
	public static final String TEMPLATE_MODE_3_BY_2 = "3by2Template";
	/**
	 * Indicates the 3x2 inch with barcode default template should be used
	 */
	public static final String TEMPLATE_MODE_3_BY_2_BARCODE = "3by2BarcodeTemplate";
	/**
	 * Indicates a custom template should be used
	 */
	public static final String TEMPLATE_MODE_CUSTOM = "customTemplate";
	private String template;
	private File templateFile;
	private String detailColumn1Title;
	private String detailColumn2Title;
	private String detailColumn1Column;
	private String detailColumn2Column;
	private String eventLogo;
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

	/**
	 * Returns the filename to the event logo image.
	 * 
	 * @return
	 */
	public String getEventLogo() {
		return eventLogo;
	}

	/**
	 * Sets the filename for the event logo image.
	 * 
	 * @param eventLogo
	 */
	public void setEventLogo(String eventLogo) {
		this.eventLogo = eventLogo;
	}

}
