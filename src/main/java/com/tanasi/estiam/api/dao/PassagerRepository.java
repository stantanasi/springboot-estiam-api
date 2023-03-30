package com.tanasi.estiam.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanasi.estiam.api.entities.Passager;

public interface PassagerRepository extends JpaRepository<Passager, Long> {

}
