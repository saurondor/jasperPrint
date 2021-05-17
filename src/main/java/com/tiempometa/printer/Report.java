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
package com.tiempometa.printer;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;

/**
 * Interface for a report that provides access to data source and report
 * parameters.
 * 
 * @author Gerardo Esteban Tasistro Giubetic
 *
 */
public interface Report {

	/**
	 * Returns a string to a file o resource holding the Jasper file.
	 * 
	 * @return
	 */
	String getTemplate();

	/**
	 * Returns a datasource to the array of beans to fill the report.
	 * 
	 * @return
	 */
	JRDataSource getDataSource();

	/**
	 * Returns a map to the parameters that will be passed to the report.
	 * 
	 * @return
	 */
	Map<String, Object> getParamMap();

	/**
	 * Gets an input stream to the file or resource indicated as template
	 * ({@link #getTemplate()}).
	 * 
	 * @return
	 */
	InputStream getReportInputStream() throws FileNotFoundException;

}
