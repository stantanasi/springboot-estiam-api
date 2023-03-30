package com.tanasi.estiam.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tanasi.estiam.api.dao.PassagerRepository;
import com.tanasi.estiam.api.dao.VoitureRepository;
import com.tanasi.estiam.api.entities.Passager;
import com.tanasi.estiam.api.entities.Voiture;

@SpringBootApplication
public class EstiamApiApplication implements CommandLineRunner {

	@Autowired
	private VoitureRepository vr;
	@Autowired
	private PassagerRepository pr;
	
	public static void main(String[] args) {
		SpringApplication.run(EstiamApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i=0; i<10; i++) {
			Voiture voiture = new Voiture();
			
			voiture.setName(Voiture.names[(int) (Math.random() * Voiture.names.length)]);
			voiture.setPrice((int) (Math.random() * 100000));
			voiture.setColor(Voiture.colors[(int) (Math.random() * Voiture.colors.length)]);
			voiture.setAvailable(Math.random() > 0.2);
			
			
			List<Passager> passagers = new ArrayList<>(); 
			for (int j=0; j<((int) (Math.random() * 10 + 20)); j++) {
				Passager passager = new Passager();
				passager.setName(Passager.names[(int) (Math.random() * Passager.names.length)]);
	  
				pr.save(passager); passagers.add(passager); 
			}
			voiture.setPassagers(passagers);
			 

			vr.save(voiture);
		}
		System.out.println("Voitures sauvegardées...");

		List<Voiture> voitures = vr.findAll();
		for (Voiture voiture : voitures) {
			System.out.println("La voiture " + voiture.getName() + " (ID: " + voiture.getId() + ") de couleur " + voiture.getColor() + " coûte " + voiture.getPrice() + "€ et a " + voiture.getPassagers().size() + " passagers");
		}
	}

}
