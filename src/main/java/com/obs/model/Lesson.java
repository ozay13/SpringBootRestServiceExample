package com.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "K_DERS")
@SequenceGenerator(name = "idGenerator", allocationSize = 1, initialValue = 1, sequenceName = "SQ_K_DERS")
public class Lesson extends BaseEntity {
	
	@Column(name = "ADI")
	private String name;
	@Column(name = "KODU")
	private String code;
	@Column(name = "UYGL_KREDI")
	private Integer appCredit;
	@Column(name = "TEORI_KREDI")
	private Integer teoriCredit;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BOLUMID", foreignKey=@ForeignKey(name = "KDERS_KBOLUM_FK"), referencedColumnName = "ID")
	private Department Department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getAppCredit() {
		return appCredit;
	}

	public void setAppCredit(Integer appCredit) {
		this.appCredit = appCredit;
	}

	public Integer getTeoriCredit() {
		return teoriCredit;
	}

	public void setTeoriCredit(Integer teoriCredit) {
		this.teoriCredit = teoriCredit;
	}

	public Department getDepartment() {
		return Department;
	}

	public void setDepartment(Department department) {
		Department = department;
	}
	
	
}
