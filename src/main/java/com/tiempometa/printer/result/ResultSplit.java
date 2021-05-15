/*
 * Copyright (c) 2019 TiempoMeta
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
package com.tiempometa.printer.result;

/**
 * Row bean for JRDataSource embedded in {@link ResultRow} to render splits
 * subreport.
 * 
 * @author Gerardo Esteban Tasistro Giubetic
 *
 */
public class ResultSplit {
	private String phaseTitle;
	private String phaseTime;
	private String phaseTimeDifference;
	private String phasePace;
	private Integer phaseGeneralPosition;
	private Integer phaseBranchPosition;
	private Integer phaseCategoryPosition;
	private String lapTitle;
	private String lapTime;
	private String lapTimeDifference;
	private String lapPace;
	private Integer lapGeneralPosition;
	private Integer lapBranchPosition;
	private Integer lapCategoryPosition;
	private Integer gunGeneralPosition;
	private Integer gunBranchPosition;
	private Integer gunCategoryPosition;
	private Integer chipGeneralPosition;
	private Integer chipBranchPosition;
	private Integer chipCategoryPosition;
	private Double distance;
	private String distanceValue;
	private Byte distanceUnits;
	private Integer calories;
	private Integer steps;

	public ResultSplit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResultSplit(String phaseTitle, String phaseTime, String phaseTimeDifference, String phasePace,
			Integer phaseGeneralPosition, Integer phaseBranchPosition, Integer phaseCategoryPosition, String lapTitle,
			String lapTime, String lapTimeDifference, String lapPace, Integer lapGeneralPosition,
			Integer lapBranchPosition, Integer lapCategoryPosition, Integer gunGeneralPosition,
			Integer gunBranchPosition, Integer gunCategoryPosition, Integer chipGeneralPosition,
			Integer chipBranchPosition, Integer chipCategoryPosition) {
		super();
		this.phaseTitle = phaseTitle;
		this.phaseTime = phaseTime;
		this.phaseTimeDifference = phaseTimeDifference;
		this.phasePace = phasePace;
		this.phaseGeneralPosition = phaseGeneralPosition;
		this.phaseBranchPosition = phaseBranchPosition;
		this.phaseCategoryPosition = phaseCategoryPosition;
		this.lapTitle = lapTitle;
		this.lapTime = lapTime;
		this.lapTimeDifference = lapTimeDifference;
		this.lapPace = lapPace;
		this.lapGeneralPosition = lapGeneralPosition;
		this.lapBranchPosition = lapBranchPosition;
		this.lapCategoryPosition = lapCategoryPosition;
		this.gunGeneralPosition = gunGeneralPosition;
		this.gunBranchPosition = gunBranchPosition;
		this.gunCategoryPosition = gunCategoryPosition;
		this.chipGeneralPosition = chipGeneralPosition;
		this.chipBranchPosition = chipBranchPosition;
		this.chipCategoryPosition = chipCategoryPosition;
	}

	public String getPhaseTime() {
		return phaseTime;
	}

	public String getPhaseTimeDifference() {
		return phaseTimeDifference;
	}

	public String getPhasePace() {
		return phasePace;
	}

	public Integer getPhaseGeneralPosition() {
		return phaseGeneralPosition;
	}

	public Integer getPhaseBranchPosition() {
		return phaseBranchPosition;
	}

	public Integer getPhaseCategoryPosition() {
		return phaseCategoryPosition;
	}

	public String getLapTime() {
		return lapTime;
	}

	public String getLapTimeDifference() {
		return lapTimeDifference;
	}

	public String getLapPace() {
		return lapPace;
	}

	public Integer getLapGeneralPosition() {
		return lapGeneralPosition;
	}

	public Integer getLapBranchPosition() {
		return lapBranchPosition;
	}

	public Integer getLapCategoryPosition() {
		return lapCategoryPosition;
	}

	public Integer getGunGeneralPosition() {
		return gunGeneralPosition;
	}

	public Integer getGunBranchPosition() {
		return gunBranchPosition;
	}

	public Integer getGunCategoryPosition() {
		return gunCategoryPosition;
	}

	public Integer getChipGeneralPosition() {
		return chipGeneralPosition;
	}

	public Integer getChipBranchPosition() {
		return chipBranchPosition;
	}

	public Integer getChipCategoryPosition() {
		return chipCategoryPosition;
	}

	public void setPhaseTime(String phaseTime) {
		this.phaseTime = phaseTime;
	}

	public void setPhaseTimeDifference(String phaseTimeDifference) {
		this.phaseTimeDifference = phaseTimeDifference;
	}

	public void setPhasePace(String phasePace) {
		this.phasePace = phasePace;
	}

	public void setPhaseGeneralPosition(Integer phaseGeneralPosition) {
		this.phaseGeneralPosition = phaseGeneralPosition;
	}

	public void setPhaseBranchPosition(Integer phaseBranchPosition) {
		this.phaseBranchPosition = phaseBranchPosition;
	}

	public void setPhaseCategoryPosition(Integer phaseCategoryPosition) {
		this.phaseCategoryPosition = phaseCategoryPosition;
	}

	public void setLapTime(String lapTime) {
		this.lapTime = lapTime;
	}

	public void setLapTimeDifference(String lapTimeDifference) {
		this.lapTimeDifference = lapTimeDifference;
	}

	public void setLapPace(String lapPace) {
		this.lapPace = lapPace;
	}

	public void setLapGeneralPosition(Integer lapGeneralPosition) {
		this.lapGeneralPosition = lapGeneralPosition;
	}

	public void setLapBranchPosition(Integer lapBranchPosition) {
		this.lapBranchPosition = lapBranchPosition;
	}

	public void setLapCategoryPosition(Integer lapCategoryPosition) {
		this.lapCategoryPosition = lapCategoryPosition;
	}

	public void setGunGeneralPosition(Integer gunGeneralPosition) {
		this.gunGeneralPosition = gunGeneralPosition;
	}

	public void setGunBranchPosition(Integer gunBranchPosition) {
		this.gunBranchPosition = gunBranchPosition;
	}

	public void setGunCategoryPosition(Integer gunCategoryPosition) {
		this.gunCategoryPosition = gunCategoryPosition;
	}

	public void setChipGeneralPosition(Integer chipGeneralPosition) {
		this.chipGeneralPosition = chipGeneralPosition;
	}

	public void setChipBranchPosition(Integer chipBranchPosition) {
		this.chipBranchPosition = chipBranchPosition;
	}

	public void setChipCategoryPosition(Integer chipCategoryPosition) {
		this.chipCategoryPosition = chipCategoryPosition;
	}

	public String getPhaseTitle() {
		return phaseTitle;
	}

	public String getLapTitle() {
		return lapTitle;
	}

	public void setPhaseTitle(String phaseTitle) {
		this.phaseTitle = phaseTitle;
	}

	public void setLapTitle(String lapTitle) {
		this.lapTitle = lapTitle;
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

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

}
