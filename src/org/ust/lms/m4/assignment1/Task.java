package org.ust.lms.m4.assignment1;

import java.time.LocalDate;

public class Task {

	private String description;
	private LocalDate dueDate;

	public Task(String description, LocalDate dueDate) {

		this.description = description;
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Task [description=" + description + ", dueDate=" + dueDate + "]";
	}

}
