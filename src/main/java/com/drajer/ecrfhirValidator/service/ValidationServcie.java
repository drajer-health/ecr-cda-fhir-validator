package com.drajer.ecrfhirValidator.service;

import java.io.IOException;

import org.hl7.fhir.r4.model.Bundle;
import org.springframework.web.multipart.MultipartFile;

import com.drajer.ecrfhirValidator.response.FhirValidationResponse;

public interface ValidationServcie {



	Object validateFhirBundle(MultipartFile eicr) throws IOException;
}