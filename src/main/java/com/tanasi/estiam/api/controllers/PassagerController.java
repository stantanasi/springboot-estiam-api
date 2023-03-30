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

import com.tanasi.estiam.api.dao.PassagerRepository;
import com.tanasi.estiam.api.entities.Passager;

@RestController
@RequestMapping("/passagers")
public class PassagerController {

	@Autowired
	private PassagerRepository pr;


	@GetMapping("")
	public List<Passager> getPassagers() {
		return pr.findAll();
	}

	@PostMapping("")
	public Passager createPassager(@RequestBody Passager passager) {
	    return pr.save(passager);
    }

	@GetMapping("{id}")
	public Optional<Passager> getPassager(@PathVariable("id") Long id) {
		return pr.findById(id);
	}

	@PutMapping("{id}")
	public Passager updatePassager(@PathVariable("id") Long id, @RequestBody Passager passager) {
		pr.save(passager);
		return passager;
	}

	@DeleteMapping("{id}")
	public void deletePassager(@PathVariable("id") Long id) {  
		pr.deleteById(id);  
	}
}
