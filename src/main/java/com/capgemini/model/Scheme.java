package com.capgemini.model;

import java.time.LocalDate;

public class Scheme {
	Integer schemeId;
	String schemeName;
	String schemeType;
	LocalDate schemeLaunchDate;
	String schemeEligibility;
	String schemeObjective;
	TrainingCourse training;

//	No agrgument Constructor
	public Scheme() {
		super();
	}

//	agrgument Constructor
public Scheme(Integer schemeId, String schemeName, String schemeType, LocalDate schemeLaunchDate,
		String schemeEligibility, String schemeObjective, TrainingCourse training) {
	super();
	this.schemeId = schemeId;
	this.schemeName = schemeName;
	this.schemeType = schemeType;
	this.schemeLaunchDate = schemeLaunchDate;
	this.schemeEligibility = schemeEligibility;
	this.schemeObjective = schemeObjective;
	this.training = training;
}


//Getters and Setters
public Integer getSchemeId() {
	return schemeId;
}

public void setSchemeId(Integer schemeId) {
	this.schemeId = schemeId;
}

public String getSchemeName() {
	return schemeName;
}

public void setSchemeName(String schemeName) {
	this.schemeName = schemeName;
}

public String getSchemeType() {
	return schemeType;
}

public void setSchemeType(String schemeType) {
	this.schemeType = schemeType;
}

public LocalDate getSchemeLaunchDate() {
	return schemeLaunchDate;
}

public void setSchemeLaunchDate(LocalDate schemeLaunchDate) {
	this.schemeLaunchDate = schemeLaunchDate;
}

public String getSchemeEligibility() {
	return schemeEligibility;
}

public void setSchemeEligibility(String schemeEligibility) {
	this.schemeEligibility = schemeEligibility;
}

public String getSchemeObjective() {
	return schemeObjective;
}

public void setSchemeObjective(String schemeObjective) {
	this.schemeObjective = schemeObjective;
}

public TrainingCourse getTraining() {
	return training;
}

public void setTraining(TrainingCourse training) {
	this.training = training;
}


//Tostring methods
@Override
public String toString() {
	return "Scheme [schemeId=" + schemeId + ", schemeName=" + schemeName + ", schemeType=" + schemeType
			+ ", schemeLaunchDate=" + schemeLaunchDate + ", schemeEligibility=" + schemeEligibility
			+ ", schemeObjective=" + schemeObjective + ", training=" + training + "]";
}
	
	
}