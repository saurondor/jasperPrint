/**
 * 
 */
package com.tiempometa.printer.label;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import com.tiempometa.printer.Report;
import com.tiempometa.printer.result.ResultRow;

/**
 * @author Gerardo Tasistro
 *
 */
public class LabelReport implements Report {
	public LabelReport(String labelTemplate, List<LabelRow> rows) {
		super();
		this.labelTemplate = labelTemplate;
		this.rows = rows;
	}

	private String labelTemplate;
	
	private List<LabelRow> rows = new ArrayList<LabelRow>();

	/* (non-Javadoc)
	 * @see com.tiempometa.printer.Report#getTemplate()
	 */
	@Override
	public String getTemplate() {
		return labelTemplate;
	}

	/* (non-Javadoc)
	 * @see com.tiempometa.printer.Report#getDataSource()
	 */
	@Override
	public JRDataSource getDataSource() {
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(rows);
		return dataSource;
	}

	/* (non-Javadoc)
	 * @see com.tiempometa.printer.Report#getParamMap()
	 */
	@Override
	public Map<String, Object> getParamMap() {
		Map<String, Object> paramMap=new HashMap<String, Object>();
		return paramMap;
	}

}
