package com.drajer.ecrfhirValidator.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.drajer.ecrfhirValidator.service.ValidationServcie;

@RestController
public class validatorController {

	@Autowired
	ValidationServcie validationServcie;



	@PostMapping("/api/fhir/validator")
	public  ResponseEntity<Object> fhirValidator(@RequestPart MultipartFile file) throws IOException {      
		
		 Object fhirValidationResponse = validationServcie.validateFhirBundle(file);
		 return new ResponseEntity<>(fhirValidationResponse, HttpStatus.OK);
	

	}

}
