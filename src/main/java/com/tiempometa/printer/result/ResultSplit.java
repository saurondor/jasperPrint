/**
 * 
 */
package com.tiempometa.printer.result;

/**
 * @author Gerardo Tasistro
 *
 */
public class ResultSplit {
	private String name;
	private String time;
	private Integer generalPosition;
	private Integer branchPosition;
	private Integer categoryPosition;
	private String speed;
	public ResultSplit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultSplit(String name, String time, Integer generalPosition,
			Integer branchPosition, Integer categoryPosition, String speed) {
		super();
		this.name = name;
		this.time = time;
		this.generalPosition = generalPosition;
		this.branchPosition = branchPosition;
		this.categoryPosition = categoryPosition;
		this.speed = speed;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the generalPosition
	 */
	public Integer getGeneralPosition() {
		return generalPosition;
	}
	/**
	 * @param generalPosition the generalPosition to set
	 */
	public void setGeneralPosition(Integer generalPosition) {
		this.generalPosition = generalPosition;
	}
	/**
	 * @return the branchPosition
	 */
	public Integer getBranchPosition() {
		return branchPosition;
	}
	/**
	 * @param branchPosition the branchPosition to set
	 */
	public void setBranchPosition(Integer branchPosition) {
		this.branchPosition = branchPosition;
	}
	/**
	 * @return the categoryPosition
	 */
	public Integer getCategoryPosition() {
		return categoryPosition;
	}
	/**
	 * @param categoryPosition the categoryPosition to set
	 */
	public void setCategoryPosition(Integer categoryPosition) {
		this.categoryPosition = categoryPosition;
	}
	/**
	 * @return the speed
	 */
	public String getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(String speed) {
		this.speed = speed;
	}

}
