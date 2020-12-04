/**
 * 
 */
package com.tiempometa.printer.result;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

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
	private Date finishDate;
	private String detailColumn1;
	private String detailColumn2;
	private Double distance;
	private String distanceValue;
	private Byte distanceUnits;
	private Integer lapCount;
	private Integer calories;
	private Integer steps;
	private List<ResultSplit> splits = new ArrayList<ResultSplit>();
	JRBeanCollectionDataSource splitsDataSource;

	public ResultRow() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultRow(String bib, String firstName, String lastName, String middleName, String fullName, String category,
			String chipTime, String chipPace, String chipDiff, String officialTime, String officialDiff,
			String officialPace, Integer chipGeneralPosition, Integer chipGenderPosition, Integer chipCategoryPosition,
			Integer officialGeneralPosition, Integer officialGenderPosition, Integer officialCategoryPosition,
			Date finishDate, String detailColumn1, String detailColumn2, List<ResultSplit> splits,
			JRBeanCollectionDataSource splitsDataSource) {
		super();
		this.bib = bib;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.fullName = fullName;
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
		this.finishDate = finishDate;
		this.detailColumn1 = detailColumn1;
		this.detailColumn2 = detailColumn2;
		this.splits = splits;
		this.splitsDataSource = splitsDataSource;
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
		this.splitsDataSource = new JRBeanCollectionDataSource(this.splits, false);
	}

	public synchronized JRBeanCollectionDataSource getSplitsDataSource() {
		return splitsDataSource;
	}

	public synchronized void setSplitsDataSource(JRBeanCollectionDataSource splitsDataSource) {
		this.splitsDataSource = splitsDataSource;
	}

	public String getDetailColumn1() {
		return detailColumn1;
	}

	public String getDetailColumn2() {
		return detailColumn2;
	}

	public void setDetailColumn1(String detailColumn1) {
		this.detailColumn1 = detailColumn1;
	}

	public void setDetailColumn2(String detailColumn2) {
		this.detailColumn2 = detailColumn2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResultRow [bib=");
		builder.append(bib);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", fullName=");
		builder.append(fullName);
		builder.append(", category=");
		builder.append(category);
		builder.append(", chipTime=");
		builder.append(chipTime);
		builder.append(", chipDiff=");
		builder.append(chipDiff);
		builder.append(", officialTime=");
		builder.append(officialTime);
		builder.append(", officialDiff=");
		builder.append(officialDiff);
		builder.append(", chipGeneralPosition=");
		builder.append(chipGeneralPosition);
		builder.append(", chipGenderPosition=");
		builder.append(chipGenderPosition);
		builder.append(", chipCategoryPosition=");
		builder.append(chipCategoryPosition);
		builder.append(", officialGeneralPosition=");
		builder.append(officialGeneralPosition);
		builder.append(", officialGenderPosition=");
		builder.append(officialGenderPosition);
		builder.append(", officialCategoryPosition=");
		builder.append(officialCategoryPosition);
		builder.append(", finishDate=");
		builder.append(finishDate);
		builder.append(", detailColumn1=");
		builder.append(detailColumn1);
		builder.append(", detailColumn2=");
		builder.append(detailColumn2);
		builder.append(", splits=");
		builder.append(splits);
		builder.append(", splitsDataSource=");
		builder.append(splitsDataSource);
		builder.append("]");
		return builder.toString();
	}

	public String getChipPace() {
		return chipPace;
	}

	public String getOfficialPace() {
		return officialPace;
	}

	public void setChipPace(String chipPace) {
		this.chipPace = chipPace;
	}

	public void setOfficialPace(String officialPace) {
		this.officialPace = officialPace;
	}

	public Double getDistance() {
		return distance;
	}

	public String getDistanceValue() {
		return distanceValue;
	}

	public Byte getDistanceUnits() {
		return distanceUnits;
	}

	public Integer getLapCount() {
		return lapCount;
	}

	public Integer getCalories() {
		return calories;
	}

	public Integer getSteps() {
		return steps;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public void setDistanceValue(String distanceValue) {
		this.distanceValue = distanceValue;
	}

	public void setDistanceUnits(Byte distanceUnits) {
		this.distanceUnits = distanceUnits;
	}

	public void setLapCount(Integer lapCount) {
		this.lapCount = lapCount;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

}
