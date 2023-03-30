package com.tanasi.estiam.api.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Voiture {
	
	public static String[] names = new String[] {"Toyota Camry", "Honda Civic", "Ford Mustang", "Chevrolet Corvette", "Tesla Model S", "BMW M3", "Mercedes-Benz C-Class", "Audi A4", "Volkswagen Golf", "Subaru WRX", "Mazda MX-5 Miata", "Jeep Wrangler", "Dodge Challenger", "Porsche 911", "Ferrari 488", "Lamborghini Aventador", "Bugatti Chiron", "McLaren 720S", "Aston Martin DB11", "Rolls-Royce Phantom"};
	public static String[] colors = new String[] {"rouge", "vert", "bleu", "jaune", "orange", "violet", "rose", "gris", "marron", "noir", "blanc", "turquoise", "olive", "argent", "or", "pourpre", "corail", "indigo", "sable", "émeraude"};
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double price;
	private String color;
	private boolean isAvailable;
	
	@OneToMany(fetch=FetchType.EAGER)
	private List<Passager> passagers = new ArrayList<Passager>();

	
	public Voiture() {
		super();
	}

	public Voiture(Long id, String name, double price, String color, boolean isAvailable, List<Passager> passagers) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
		this.isAvailable = isAvailable;
		this.passagers = passagers;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public List<Passager> getPassagers() {
		return passagers;
	}

	public void setPassagers(List<Passager> passagers) {
		this.passagers = passagers;
	}
}
