package com.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "K_BOLUM")
@SequenceGenerator(name="idGenerator",initialValue=1,allocationSize=1,sequenceName="SQ_KBOLUM")
public class Department extends BaseEntity {

	@Column(name = "ADI", nullable = false)
	private String name;
	@Column(name = "KODU", nullable = false)//, unique = true
	private String code;
	@Column(name="YIL")
	private Integer countYear;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "FAKULTEID", foreignKey = @ForeignKey(name = "KBOLUM_KFAKULTE_FK"), referencedColumnName = "ID")
	private Faculty Faculty;

	public Integer getCountYear() {
		return countYear;
	}

	public void setCountYear(Integer countYear) {
		this.countYear = countYear;
	}

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

	public Faculty getFaculty() {
		return Faculty;
	}

	public void setFaculty(Faculty faculty) {
		Faculty = faculty;
	}

}
