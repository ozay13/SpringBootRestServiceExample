package com.obs.dto;

import java.util.Date;

import com.obs.model.Student;

public class StudentDto {
	private Long id;
	private Integer createdBy;
	private Date createdDate;
	private String identityNumber;
	private String number;
	private String firstName;
	private String lastName;
	private Boolean gender;
	private String phone;
	private String adress;
	private String facultyName;
	private String departName;
	private Integer countYear;

	public StudentDto() {
		// TODO Auto-generated constructor stub
	}

	public StudentDto(Student st, Integer c, String departmanName, String facultyName) {
		this.id=st.getId();
		this.identityNumber=st.getIdentityNumber();
		this.number=st.getNumber();
		this.firstName=st.getFirstName();
		this.lastName=st.getLastName();
		this.gender=st.getGender();
		this.phone=st.getPhone();
		this.adress=st.getAdress();
		this.countYear = c;
		this.departName = departmanName;
		this.facultyName = facultyName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public Integer getCountYear() {
		return countYear;
	}

	public void setCountYear(Integer countYear) {
		this.countYear = countYear;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
