package com.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "K_FAKULTE")
@SequenceGenerator(name = "idGenerator", initialValue = 1, allocationSize = 1, sequenceName = "SQ_KFAKULTE")
public class Faculty extends BaseEntity {
	@Column(name = "ADI", nullable = false)
	private String name;
	@Column(name = "KODU", nullable = false) // unique = true
	private String code;

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

}
