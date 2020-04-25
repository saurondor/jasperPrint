/**
 * 
 */
package com.tiempometa.printer.result;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 * @author gtasi
 *
 */
public class TeamResultRow {
	private String bibs;
	private String teamName;
	private String category;
	private String chipTime;
	private String chipPace;
	private String chipDiff;
	private String officialTime;
	private String officialDiff;
	private String officialPace;
	private Integer chipGeneralPosition;
	private Integer chipGenderPosition;
	private Integer chipCategoryPosition;
	private Integer officialGeneralPosition;
	private Integer officialGenderPosition;
	private Integer officialCategoryPosition;
	private String detailColumn1;
	private String detailColumn2;
	private List<ResultRow> rows = new ArrayList<ResultRow>();

	public TeamResultRow() {
		super();
	}

	public TeamResultRow(String bibs, String teamName, String category, String chipTime, String chipPace,
			String chipDiff, String officialTime, String officialDiff, String officialPace, Integer chipGeneralPosition,
			Integer chipGenderPosition, Integer chipCategoryPosition, Integer officialGeneralPosition,
			Integer officialGenderPosition, Integer officialCategoryPosition, String detailColumn1,
			String detailColumn2, List<ResultRow> rows) {
		super();
		this.bibs = bibs;
		this.teamName = teamName;
		this.category = category;
		this.chipTime = chipTime;
		this.chipPace = chipPace;
		this.chipDiff = chipDiff;
		this.officialTime = officialTime;
		this.officialDiff = officialDiff;
		this.officialPace = officialPace;
		this.chipGeneralPosition = chipGeneralPosition;
		this.chipGenderPosition = chipGenderPosition;
		this.chipCategoryPosition = chipCategoryPosition;
		this.officialGeneralPosition = officialGeneralPosition;
		this.officialGenderPosition = officialGenderPosition;
		this.officialCategoryPosition = officialCategoryPosition;
		this.detailColumn1 = detailColumn1;
		this.detailColumn2 = detailColumn2;
		this.rows = rows;
	}

	public JRDataSource getDataSource() {
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(rows);
		return dataSource;
	}

	public String getBibs() {
		return bibs;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getCategory() {
		return category;
	}

	public String getChipTime() {
		return chipTime;
	}

	public String getChipPace() {
		return chipPace;
	}

	public String getChipDiff() {
		return chipDiff;
	}

	public String getOfficialTime() {
		return officialTime;
	}

	public String getOfficialDiff() {
		return officialDiff;
	}

	public String getOfficialPace() {
		return officialPace;
	}

	public Integer getChipGeneralPosition() {
		return chipGeneralPosition;
	}

	public Integer getChipGenderPosition() {
		return chipGenderPosition;
	}

	public Integer getChipCategoryPosition() {
		return chipCategoryPosition;
	}

	public Integer getOfficialGeneralPosition() {
		return officialGeneralPosition;
	}

	public Integer getOfficialGenderPosition() {
		return officialGenderPosition;
	}

	public Integer getOfficialCategoryPosition() {
		return officialCategoryPosition;
	}

	public String getDetailColumn1() {
		return detailColumn1;
	}

	public String getDetailColumn2() {
		return detailColumn2;
	}

	public List<ResultRow> getRows() {
		return rows;
	}

	public void setBibs(String bibs) {
		this.bibs = bibs;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setChipTime(String chipTime) {
		this.chipTime = chipTime;
	}

	public void setChipPace(String chipPace) {
		this.chipPace = chipPace;
	}

	public void setChipDiff(String chipDiff) {
		this.chipDiff = chipDiff;
	}

	public void setOfficialTime(String officialTime) {
		this.officialTime = officialTime;
	}

	public void setOfficialDiff(String officialDiff) {
		this.officialDiff = officialDiff;
	}

	public void setOfficialPace(String officialPace) {
		this.officialPace = officialPace;
	}

	public void setChipGeneralPosition(Integer chipGeneralPosition) {
		this.chipGeneralPosition = chipGeneralPosition;
	}

	public void setChipGenderPosition(Integer chipGenderPosition) {
		this.chipGenderPosition = chipGenderPosition;
	}

	public void setChipCategoryPosition(Integer chipCategoryPosition) {
		this.chipCategoryPosition = chipCategoryPosition;
	}

	public void setOfficialGeneralPosition(Integer officialGeneralPosition) {
		this.officialGeneralPosition = officialGeneralPosition;
	}

	public void setOfficialGenderPosition(Integer officialGenderPosition) {
		this.officialGenderPosition = officialGenderPosition;
	}

	public void setOfficialCategoryPosition(Integer officialCategoryPosition) {
		this.officialCategoryPosition = officialCategoryPosition;
	}

	public void setDetailColumn1(String detailColumn1) {
		this.detailColumn1 = detailColumn1;
	}

	public void setDetailColumn2(String detailColumn2) {
		this.detailColumn2 = detailColumn2;
	}

	public void setRows(List<ResultRow> rows) {
		this.rows = rows;
	}

}
