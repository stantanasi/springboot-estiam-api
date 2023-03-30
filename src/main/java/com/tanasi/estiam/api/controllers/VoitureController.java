package com.tanasi.estiam.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tanasi.estiam.api.dao.VoitureRepository;
import com.tanasi.estiam.api.entities.Voiture;

@RestController
@RequestMapping("/voitures")
public class VoitureController {

	@Autowired
	private VoitureRepository vr;


	@GetMapping("")
	public List<Voiture> getVoitures() {
		return vr.findAll();
	}

	@PostMapping("")
	public Voiture createVoiture(@RequestBody Voiture voiture) {
	    return vr.save(voiture);
    }

	@GetMapping("{id}")
	public Optional<Voiture> getVoiture(@PathVariable("id") Long id) {
		return vr.findById(id);
	}

	@PutMapping("{id}")
	public Voiture updateVoiture(@PathVariable("id") Long id, @RequestBody Voiture voiture) {
		vr.save(voiture);
		return voiture;
	}

	@DeleteMapping("{id}")  
	public void deleteVoiture(@PathVariable("id") Long id) {  
		vr.deleteById(id);  
	}
}