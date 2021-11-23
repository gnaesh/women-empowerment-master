package com.capgemini.model;

import java.time.LocalDate;

public class Trainee {
	
	private Integer traineeId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private long contact;
	private String email;
	private String familyInfo;
	private long aadharNo;
	private LocalDate dob;
	private TrainingCourse trainingCourse;
	private FeedBack feedBack;
	
	
//	No agrgument Constructor
	public Trainee() {
		super();
	}
	
	// agrgument Constructor
	public Trainee(Integer traineeId, String userName, String password, String firstName, String lastName, long contact,
			String email, String familyInfo, long aadharNo, LocalDate dob, TrainingCourse trainingCourse,
			FeedBack feedBack) {
		super();
		this.traineeId = traineeId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.email = email;
		this.familyInfo = familyInfo;
		this.aadharNo = aadharNo;
		this.dob = dob;
		this.trainingCourse = trainingCourse;
		this.feedBack = feedBack;
	}
// getters and setters

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFamilyInfo() {
		return familyInfo;
	}

	public void setFamilyInfo(String familyInfo) {
		this.familyInfo = familyInfo;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public TrainingCourse getTrainingCourse() {
		return trainingCourse;
	}

	public void setTrainingCourse(TrainingCourse trainingCourse) {
		this.trainingCourse = trainingCourse;
	}

	public FeedBack getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(FeedBack feedBack) {
		this.feedBack = feedBack;
	}

	
//	tostring method
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", contact=" + contact + ", email=" + email + ", familyInfo="
				+ familyInfo + ", aadharNo=" + aadharNo + ", dob=" + dob + ", trainingCourse=" + trainingCourse
				+ ", feedBack=" + feedBack + "]";
	}

	
}
