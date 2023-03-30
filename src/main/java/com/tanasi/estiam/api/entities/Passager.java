package com.tanasi.estiam.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passager {

	public static String[] names = new String[] {"Emily Johnson", "Michael Brown", "Jessica Davis", "David Lee", "Ashley Williams", "Christopher Martinez", "Amanda Garcia", "James Taylor", "Elizabeth Hernandez", "Daniel Anderson", "Taylor Thomas", "William Wilson", "Stephanie Rodriguez", "Anthony Jackson", "Lauren Martin", "Matthew Baker", "Brittany Nelson", "Brandon Perez", "Rachel Moore", "Kevin Scott"};
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	
	public Passager() {
		super();
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
