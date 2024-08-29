package com.drajer.ecranonymizer.service;

import java.io.IOException;

import org.hl7.fhir.r4.model.Bundle;
import org.springframework.web.multipart.MultipartFile;

import com.drajer.ecranonymizer.response.FhirValidationResponse;

public interface ValidationServcie {

	public String validateBundle(MultipartFile eicr) throws IOException;


	FhirValidationResponse validateFhirBundle(MultipartFile eicr) throws IOException;
}