package com.drapeau.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drapeau.clsse.EntiteCouleur;

public interface CouleurRepository extends JpaRepository<EntiteCouleur, Long> {

}
