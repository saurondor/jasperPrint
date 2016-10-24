/**
 * 
 */
package com.tiempometa.printer.label;

import java.awt.Image;
import java.util.Date;

/**
 * @author Gerardo Tasistro
 * 
 */
public class LabelRow {
	private Image barcode;
	private Image qrCode;
	private Image photo;
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
	private String extra1;
	private String extra2;
	private String extra3;
	private String extra4;
	private String extra5;
	private Date registrationDate;
	private String team;
	private String procedence;
	private String companyName;
	private String jobPosition;

	public LabelRow() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public LabelRow(String bib, String firstName, String lastName, String middleName, String fullName, String email,
			Integer age, String gender, Date birthDate, String category, String categoryKey,
			String registrationConfirmation, String registrationOperation, String paymentConfirmation,
			String paymentAmount, String eventName, String subeventName, String address, String extra1, String extra2,
			String extra3, String extra4, String extra5, Date registrationDate, String team, String procedence,
			Image barcode, Image qrCode, Image photo, String companyName, String jobPosition) {
		super();
		this.barcode = barcode;
		this.qrCode = qrCode;
		this.photo = photo;
		this.bib = bib;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.fullName = fullName;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.birthDate = birthDate;
		this.category = category;
		this.categoryKey = categoryKey;
		this.registrationConfirmation = registrationConfirmation;
		this.registrationOperation = registrationOperation;
		this.paymentConfirmation = paymentConfirmation;
		this.paymentAmount = paymentAmount;
		this.eventName = eventName;
		this.subeventName = subeventName;
		this.address = address;
		this.extra1 = extra1;
		this.extra2 = extra2;
		this.extra3 = extra3;
		this.extra4 = extra4;
		this.extra5 = extra5;
		this.registrationDate = registrationDate;
		this.team = team;
		this.procedence = procedence;
		this.companyName = companyName;
		this.jobPosition = jobPosition;
	}



	public LabelRow(String bib, String firstName, String lastName, String middleName, String fullName, String email,
			Integer age, String gender, Date birthDate, String category, String categoryKey,
			String registrationConfirmation, String registrationOperation, String paymentConfirmation,
			String paymentAmount, String eventName, String subeventName, String address, String extra1, String extra2,
			String extra3, String extra4, String extra5, Date registrationDate, String team, String procedence,
			Image barcode, Image qrCode, Image photo) {
		super();
		this.bib = bib;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.fullName = fullName;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.birthDate = birthDate;
		this.category = category;
		this.categoryKey = categoryKey;
		this.registrationConfirmation = registrationConfirmation;
		this.registrationOperation = registrationOperation;
		this.paymentConfirmation = paymentConfirmation;
		this.paymentAmount = paymentAmount;
		this.eventName = eventName;
		this.subeventName = subeventName;
		this.address = address;
		this.extra1 = extra1;
		this.extra2 = extra2;
		this.extra3 = extra3;
		this.extra4 = extra4;
		this.extra5 = extra5;
		this.registrationDate = registrationDate;
		this.team = team;
		this.procedence = procedence;
		this.barcode = barcode;
		this.qrCode = qrCode;
		this.photo = photo;
	}

	public LabelRow(String bib, String firstName, String lastName, String middleName, String fullName, String email,
			Integer age, String gender, Date birthDate, String category, String categoryKey,
			String registrationConfirmation, String registrationOperation, String paymentConfirmation,
			String paymentAmount, String eventName, String subeventName, String address, String extra1, String extra2,
			String extra3, String extra4, String extra5, Date registrationDate, String team, String procedence,
			Image barcode) {
		super();
		this.bib = bib;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.fullName = fullName;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.birthDate = birthDate;
		this.category = category;
		this.categoryKey = categoryKey;
		this.registrationConfirmation = registrationConfirmation;
		this.registrationOperation = registrationOperation;
		this.paymentConfirmation = paymentConfirmation;
		this.paymentAmount = paymentAmount;
		this.eventName = eventName;
		this.subeventName = subeventName;
		this.address = address;
		this.extra1 = extra1;
		this.extra2 = extra2;
		this.extra3 = extra3;
		this.extra4 = extra4;
		this.extra5 = extra5;
		this.registrationDate = registrationDate;
		this.team = team;
		this.procedence = procedence;
		this.barcode = barcode;
	}

	/**
	 * @return the bib
	 */
	public String getBib() {
		return bib;
	}

	/**
	 * @param bib
	 *            the bib to set
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
	 * @param firstName
	 *            the firstName to set
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
	 * @param lastName
	 *            the lastName to set
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
	 * @param middleName
	 *            the middleName to set
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
	 * @param fullName
	 *            the fullName to set
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
	 * @param email
	 *            the email to set
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
	 * @param age
	 *            the age to set
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
	 * @param gender
	 *            the gender to set
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
	 * @param birthDate
	 *            the birthDate to set
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
	 * @param category
	 *            the category to set
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
	 * @param categoryKey
	 *            the categoryKey to set
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
	 * @param registrationConfirmation
	 *            the registrationConfirmation to set
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
	 * @param registrationOperation
	 *            the registrationOperation to set
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
	 * @param paymentConfirmation
	 *            the paymentConfirmation to set
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
	 * @param paymentAmount
	 *            the paymentAmount to set
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
	 * @param eventName
	 *            the eventName to set
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
	 * @param subeventName
	 *            the subeventName to set
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
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the extra1
	 */
	public String getExtra1() {
		return extra1;
	}

	/**
	 * @param extra1
	 *            the extra1 to set
	 */
	public void setExtra1(String extra1) {
		this.extra1 = extra1;
	}

	/**
	 * @return the extra2
	 */
	public String getExtra2() {
		return extra2;
	}

	/**
	 * @param extra2
	 *            the extra2 to set
	 */
	public void setExtra2(String extra2) {
		this.extra2 = extra2;
	}

	/**
	 * @return the extra3
	 */
	public String getExtra3() {
		return extra3;
	}

	/**
	 * @param extra3
	 *            the extra3 to set
	 */
	public void setExtra3(String extra3) {
		this.extra3 = extra3;
	}

	/**
	 * @return the extra4
	 */
	public String getExtra4() {
		return extra4;
	}

	/**
	 * @param extra4
	 *            the extra4 to set
	 */
	public void setExtra4(String extra4) {
		this.extra4 = extra4;
	}

	/**
	 * @return the extra5
	 */
	public String getExtra5() {
		return extra5;
	}

	/**
	 * @param extra5
	 *            the extra5 to set
	 */
	public void setExtra5(String extra5) {
		this.extra5 = extra5;
	}

	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate
	 *            the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * @param team
	 *            the team to set
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
	 * @param procedence
	 *            the procedence to set
	 */
	public void setProcedence(String procedence) {
		this.procedence = procedence;
	}

	/**
	 * @return the barcode
	 */
	public Image getBarcode() {
		return barcode;
	}

	/**
	 * @param barcode
	 *            the barcode to set
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
	 * @param qrCode
	 *            the qrCode to set
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
	 * @param photo
	 *            the photo to set
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

}
