package com.capgemini.model;

import java.time.LocalDate;

public class FeedBack {
	private int feedBackId;
	private int schemeRating;
	private int schemeTrainingRating;
	private int overallRating;
	private String comments;
	private	LocalDate feedbackdate;
	private User user;
	private TrainingCourse training;
	private Scheme scheme;

//	No agrgument Constructor
	public FeedBack() {
		super();
	}
	
// agrgument Constructor
	public FeedBack(int feedBackId, int schemeRating, int schemeTrainingRating, int overallRating, String comments,
			LocalDate feedbackdate, User user, TrainingCourse training, Scheme scheme) {
		super();
		this.feedBackId = feedBackId;
		this.schemeRating = schemeRating;
		this.schemeTrainingRating = schemeTrainingRating;
		this.overallRating = overallRating;
		this.comments = comments;
		this.feedbackdate = feedbackdate;
		this.user = user;
		this.training = training;
		this.scheme = scheme;
	}

//	getters An Setters
	public int getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}

	public int getSchemeRating() {
		return schemeRating;
	}

	public void setSchemeRating(int schemeRating) {
		this.schemeRating = schemeRating;
	}

	public int getSchemeTrainingRating() {
		return schemeTrainingRating;
	}

	public void setSchemeTrainingRating(int schemeTrainingRating) {
		this.schemeTrainingRating = schemeTrainingRating;
	}

	public int getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public LocalDate getFeedbackdate() {
		return feedbackdate;
	}

	public void setFeedbackdate(LocalDate feedbackdate) {
		this.feedbackdate = feedbackdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TrainingCourse getTraining() {
		return training;
	}

	public void setTraining(TrainingCourse training) {
		this.training = training;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	
//	tostring method
	@Override
	public String toString() {
		return "FeedBack [feedBackId=" + feedBackId + ", schemeRating=" + schemeRating + ", schemeTrainingRating="
				+ schemeTrainingRating + ", overallRating=" + overallRating + ", comments=" + comments
				+ ", feedbackdate=" + feedbackdate + ", user=" + user + ", training=" + training + ", scheme=" + scheme
				+ "]";
	}

}
