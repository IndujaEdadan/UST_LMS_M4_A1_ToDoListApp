package org.ust.lms.m4.assignment1;

import java.util.Date;

public class Task {

	private String description;
	private Date dueDate;

	public Task(String description, Date dueDate) {

		this.description = description;
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Task [description=" + description + ", dueDate=" + dueDate + "]";
	}

}
