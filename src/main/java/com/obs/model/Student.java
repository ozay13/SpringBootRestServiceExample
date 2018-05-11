package com.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="K_OGRENCI")
@SequenceGenerator(name="idGenerator",initialValue=1,allocationSize=1,sequenceName="SQ_K_OGRENCI")
public class Student extends BaseEntity {

	@Column(name = "KIMLIKNUMARASI", length = 11, nullable = false)// unique = true,
	private String identityNumber;
	@Column(name = "OGRNUMARASI", nullable = false)// unique = true,
	private String number;
	@Column(name = "ADI", nullable = false)
	private String firstName;
	@Column(name = "SOYADI", nullable = false)
	private String lastName;
	@Column(name = "CINSIYET", nullable = false)
	private Boolean gender;
	@Column(name = "TELEFON",length=13)
	private String phone;
	@Column(name = "ADRES",length=150)
	private String adress;

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="BOLUMID", foreignKey=@ForeignKey(name="KOGRENCI_KBOLUM_FK"),referencedColumnName="ID")
	private Department Department;
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
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
	public String  getPhone() {
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Department getDepartment() {
		return Department;
	}
	public void setDepartment(Department department) {
		Department = department;
	}
	
	
}
