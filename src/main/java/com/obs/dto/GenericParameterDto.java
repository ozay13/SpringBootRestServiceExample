package com.obs.dto;

import org.springframework.lang.NonNull;

public class GenericParameterDto<T> {

	@NonNull
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
