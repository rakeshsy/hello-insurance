package com.rocky.insurance.common.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.rocky.insurance.common.model.ErrorData;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ApiResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ErrorData error;

	public ErrorData getError() {
		return error;
	}

	public void setError(ErrorData error) {
		this.error = error;
	}

}
