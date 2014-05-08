/**
 * 
 */
package com.tiempometa.printer;

import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;

/**
 * @author Gerardo Tasistro
 *
 */
public interface Report {
	
	String getTemplate();
	JRDataSource getDataSource();
	Map<String, Object> getParamMap();

}
