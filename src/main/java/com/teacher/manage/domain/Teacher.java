package com.teacher.manage.domain;

public class Teacher {
	private int teacherId;
	private String firstName;
	private String middletName;
	private String lastName;
	private String gender;
	private int age;

	public Teacher() {
		super();
	}

	public Teacher(int teacherId, String firstName, String middletName, String lastName, String gender, int age) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.middletName = middletName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddletName() {
		return middletName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddletName(String middletName) {
		this.middletName = middletName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", firstName=" + firstName + ", middletName=" + middletName
				+ ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + "]";
	}

}
