package com.acts.core;

import java.time.LocalDate;

/*
 * Fields  : prn (string) : unique ID ,complete name(first name n last name), 
 * marks,course(enum), dob(LocalDate)
 */
public class Student {
	private String prn;
	private String firstName;
	private String lastName;
	private int marks;
	private Course enrolledCourse;
	private LocalDate dob;
	public Student(String prn, String firstName, String lastName, int marks, Course enrolledCourse, LocalDate dob) {
		super();
		this.prn = prn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.enrolledCourse = enrolledCourse;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [prn=" + prn + ", firstName=" + firstName + ", lastName=" + lastName + ", marks=" + marks
				+ ", enrolledCourse=" + enrolledCourse + ", dob=" + dob + "]";
	}
	public String getPrn() {
		return prn;
	}
	public void setPrn(String prn) {
		this.prn = prn;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Course getEnrolledCourse() {
		return enrolledCourse;
	}
	public void setEnrolledCourse(Course enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	

}
