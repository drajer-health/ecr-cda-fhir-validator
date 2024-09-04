package com.drajer.ecrfhirValidator.response;

import java.util.List;

public class FhirValidationResponse {

	private boolean success;
	private String message;
	private List<String> validationOutput;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getValidationOutput() {
		return validationOutput;
	}

	public void setValidationOutput(List<String> validationOutput) {
		this.validationOutput = validationOutput;
	}

}