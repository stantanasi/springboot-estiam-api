package com.tanasi.estiam.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanasi.estiam.api.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
