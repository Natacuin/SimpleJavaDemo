package com.example.mvnprg.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.example.mvnprg.openapi.api.PetApi;
import com.example.mvnprg.openapi.model.Pet;

@RestController
public class PetController implements PetApi {

	@Override
	public ResponseEntity<Pet> getPetById(Long petId) {
		Pet petExample = new Pet();
		petExample.setId(petId);
		petExample.setName("Dog");
		return ResponseEntity.ok(petExample);
	}
	
}
