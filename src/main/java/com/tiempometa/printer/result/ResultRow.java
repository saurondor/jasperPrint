/**
 * 
 */
package com.tiempometa.printer.result;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Gerardo Tasistro
 *
 */
public class ResultRow {
	private String bib;
	private String firstName;
	private String lastName;
	private String middleName;
	private String fullName;
	private String category;
	private String chipTime;
	private String chipDiff;
	private String officialTime;
	private String officialDiff;
	private Integer chipGeneralPosition;
	private Integer chipGenderPosition;
	private Integer chipCategoryPosition;
	private Integer officialGeneralPosition;
	private Integer officialGenderPosition;
	private Integer officialCategoryPosition;
	private Date finishDate;
	private String team;
	private String procedence;
	private List<ResultSplit> splits = new ArrayList<ResultSplit>();
	public ResultRow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultRow(String bib, String firstName, String lastName,
			String middleName, String fullName, String category,
			String chipTime, String chipDiff, String officialTime,
			String officialDiff, Integer chipGeneralPosition,
			Integer chipGenderPosition, Integer chipCategoryPosition,
			Integer officialGeneralPosition, Integer officialGenderPosition,
			Integer officialCategoryPosition, Date finishDate, String team,
			String procedence, List<ResultSplit> splits) {
		super();
		this.bib = bib;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.fullName = fullName;
		this.category = category;
		this.chipTime = chipTime;
		this.chipDiff = chipDiff;
		this.officialTime = officialTime;
		this.officialDiff = officialDiff;
		this.chipGeneralPosition = chipGeneralPosition;
		this.chipGenderPosition = chipGenderPosition;
		this.chipCategoryPosition = chipCategoryPosition;
		this.officialGeneralPosition = officialGeneralPosition;
		this.officialGenderPosition = officialGenderPosition;
		this.officialCategoryPosition = officialCategoryPosition;
		this.finishDate = finishDate;
		this.team = team;
		this.procedence = procedence;
		this.splits = splits;
	}
	/**
	 * @return the bib
	 */
	public String getBib() {
		return bib;
	}
	/**
	 * @param bib the bib to set
	 */
	public void setBib(String bib) {
		this.bib = bib;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the chipTime
	 */
	public String getChipTime() {
		return chipTime;
	}
	/**
	 * @param chipTime the chipTime to set
	 */
	public void setChipTime(String chipTime) {
		this.chipTime = chipTime;
	}
	/**
	 * @return the chipDiff
	 */
	public String getChipDiff() {
		return chipDiff;
	}
	/**
	 * @param chipDiff the chipDiff to set
	 */
	public void setChipDiff(String chipDiff) {
		this.chipDiff = chipDiff;
	}
	/**
	 * @return the officialTime
	 */
	public String getOfficialTime() {
		return officialTime;
	}
	/**
	 * @param officialTime the officialTime to set
	 */
	public void setOfficialTime(String officialTime) {
		this.officialTime = officialTime;
	}
	/**
	 * @return the officialDiff
	 */
	public String getOfficialDiff() {
		return officialDiff;
	}
	/**
	 * @param officialDiff the officialDiff to set
	 */
	public void setOfficialDiff(String officialDiff) {
		this.officialDiff = officialDiff;
	}
	/**
	 * @return the chipGeneralPosition
	 */
	public Integer getChipGeneralPosition() {
		return chipGeneralPosition;
	}
	/**
	 * @param chipGeneralPosition the chipGeneralPosition to set
	 */
	public void setChipGeneralPosition(Integer chipGeneralPosition) {
		this.chipGeneralPosition = chipGeneralPosition;
	}
	/**
	 * @return the chipGenderPosition
	 */
	public Integer getChipGenderPosition() {
		return chipGenderPosition;
	}
	/**
	 * @param chipGenderPosition the chipGenderPosition to set
	 */
	public void setChipGenderPosition(Integer chipGenderPosition) {
		this.chipGenderPosition = chipGenderPosition;
	}
	/**
	 * @return the chipCategoryPosition
	 */
	public Integer getChipCategoryPosition() {
		return chipCategoryPosition;
	}
	/**
	 * @param chipCategoryPosition the chipCategoryPosition to set
	 */
	public void setChipCategoryPosition(Integer chipCategoryPosition) {
		this.chipCategoryPosition = chipCategoryPosition;
	}
	/**
	 * @return the officialGeneralPosition
	 */
	public Integer getOfficialGeneralPosition() {
		return officialGeneralPosition;
	}
	/**
	 * @param officialGeneralPosition the officialGeneralPosition to set
	 */
	public void setOfficialGeneralPosition(Integer officialGeneralPosition) {
		this.officialGeneralPosition = officialGeneralPosition;
	}
	/**
	 * @return the officialGenderPosition
	 */
	public Integer getOfficialGenderPosition() {
		return officialGenderPosition;
	}
	/**
	 * @param officialGenderPosition the officialGenderPosition to set
	 */
	public void setOfficialGenderPosition(Integer officialGenderPosition) {
		this.officialGenderPosition = officialGenderPosition;
	}
	/**
	 * @return the officialCategoryPosition
	 */
	public Integer getOfficialCategoryPosition() {
		return officialCategoryPosition;
	}
	/**
	 * @param officialCategoryPosition the officialCategoryPosition to set
	 */
	public void setOfficialCategoryPosition(Integer officialCategoryPosition) {
		this.officialCategoryPosition = officialCategoryPosition;
	}
	/**
	 * @return the finishDate
	 */
	public Date getFinishDate() {
		return finishDate;
	}
	/**
	 * @param finishDate the finishDate to set
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}
	/**
	 * @return the procedence
	 */
	public String getProcedence() {
		return procedence;
	}
	/**
	 * @param procedence the procedence to set
	 */
	public void setProcedence(String procedence) {
		this.procedence = procedence;
	}
	/**
	 * @return the splits
	 */
	public List<ResultSplit> getSplits() {
		return splits;
	}
	/**
	 * @param splits the splits to set
	 */
	public void setSplits(List<ResultSplit> splits) {
		this.splits = splits;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResultRow [bib=" + bib + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", middleName=" + middleName
				+ ", fullName=" + fullName + ", category=" + category
				+ ", chipTime=" + chipTime + ", chipDiff=" + chipDiff
				+ ", officialTime=" + officialTime + ", officialDiff="
				+ officialDiff + ", chipGeneralPosition=" + chipGeneralPosition
				+ ", chipGenderPosition=" + chipGenderPosition
				+ ", chipCategoryPosition=" + chipCategoryPosition
				+ ", officialGeneralPosition=" + officialGeneralPosition
				+ ", officialGenderPosition=" + officialGenderPosition
				+ ", officialCategoryPosition=" + officialCategoryPosition
				+ ", finishDate=" + finishDate + ", team=" + team
				+ ", procedence=" + procedence + ", splits=" + splits + "]";
	}

}
