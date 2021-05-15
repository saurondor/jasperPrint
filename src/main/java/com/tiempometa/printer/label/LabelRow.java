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
package com.tiempometa.printer.label;

import java.awt.Image;
import java.util.Date;

/**
 * Row bean for JRDataSource in {@link LabelReport}
 * 
 * @author Gerardo Tasistro
 *
 */
public class LabelRow {
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

	private Image barcode;
	private Image qrCode;
	private Image photo;
	private Image logo;
	private String bib;
	private String firstName;
	private String lastName;
	private String middleName;
	private String fullName;
	private String email;
	private Integer age;
	private String gender;
	private Date birthDate;
	private String category;
	private String categoryKey;
	private String registrationConfirmation;
	private String registrationOperation;
	private String paymentConfirmation;
	private String paymentAmount;
	private String eventName;
	private String subeventName;
	private String address;
	private String regExtra1;
	private String regExtra2;
	private String labelColor;
	private String catExtra2;
	private String catExtra3;
	private String catExtra4;
	private String catExtra5;
	private String registrationDateTime;
	private String team;
	private String state;
	private String city;
	private String country;
	private String companyName;
	private String jobPosition;
	private String startTime;
	private String detailColumn1;
	private String detailColumn2;

	public LabelRow() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
	 * @return the categoryKey
	 */
	public String getCategoryKey() {
		return categoryKey;
	}

	/**
	 * @param categoryKey the categoryKey to set
	 */
	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
	}

	/**
	 * @return the registrationConfirmation
	 */
	public String getRegistrationConfirmation() {
		return registrationConfirmation;
	}

	/**
	 * @param registrationConfirmation the registrationConfirmation to set
	 */
	public void setRegistrationConfirmation(String registrationConfirmation) {
		this.registrationConfirmation = registrationConfirmation;
	}

	/**
	 * @return the registrationOperation
	 */
	public String getRegistrationOperation() {
		return registrationOperation;
	}

	/**
	 * @param registrationOperation the registrationOperation to set
	 */
	public void setRegistrationOperation(String registrationOperation) {
		this.registrationOperation = registrationOperation;
	}

	/**
	 * @return the paymentConfirmation
	 */
	public String getPaymentConfirmation() {
		return paymentConfirmation;
	}

	/**
	 * @param paymentConfirmation the paymentConfirmation to set
	 */
	public void setPaymentConfirmation(String paymentConfirmation) {
		this.paymentConfirmation = paymentConfirmation;
	}

	/**
	 * @return the paymentAmount
	 */
	public String getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * @param paymentAmount the paymentAmount to set
	 */
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the subeventName
	 */
	public String getSubeventName() {
		return subeventName;
	}

	/**
	 * @param subeventName the subeventName to set
	 */
	public void setSubeventName(String subeventName) {
		this.subeventName = subeventName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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
	 * @return the barcode
	 */
	public Image getBarcode() {
		return barcode;
	}

	/**
	 * @param barcode the barcode to set
	 */
	public void setBarcode(Image barcode) {
		this.barcode = barcode;
	}

	/**
	 * @return the qrCode
	 */
	public Image getQrCode() {
		return qrCode;
	}

	/**
	 * @param qrCode the qrCode to set
	 */
	public void setQrCode(Image qrCode) {
		this.qrCode = qrCode;
	}

	/**
	 * @return the photo
	 */
	public Image getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(Image photo) {
		this.photo = photo;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the jobPosition
	 */
	public String getJobPosition() {
		return jobPosition;
	}

	/**
	 * @param jobPosition the jobPosition to set
	 */
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getLabelColor() {
		return labelColor;
	}

	public void setLabelColor(String labelColor) {
		this.labelColor = labelColor;
	}

	public Image getLogo() {
		return logo;
	}

	public String getRegExtra1() {
		return regExtra1;
	}

	public String getRegExtra2() {
		return regExtra2;
	}

	public String getCatExtra2() {
		return catExtra2;
	}

	public String getCatExtra3() {
		return catExtra3;
	}

	public String getCatExtra4() {
		return catExtra4;
	}

	public String getCatExtra5() {
		return catExtra5;
	}

	public String getRegistrationDateTime() {
		return registrationDateTime;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public void setLogo(Image logo) {
		this.logo = logo;
	}

	public void setRegExtra1(String regExtra1) {
		this.regExtra1 = regExtra1;
	}

	public void setRegExtra2(String regExtra2) {
		this.regExtra2 = regExtra2;
	}

	public void setCatExtra2(String catExtra2) {
		this.catExtra2 = catExtra2;
	}

	public void setCatExtra3(String catExtra3) {
		this.catExtra3 = catExtra3;
	}

	public void setCatExtra4(String catExtra4) {
		this.catExtra4 = catExtra4;
	}

	public void setCatExtra5(String catExtra5) {
		this.catExtra5 = catExtra5;
	}

	public void setRegistrationDateTime(String registrationDateTime) {
		this.registrationDateTime = registrationDateTime;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
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

}
