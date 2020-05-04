package com.drapeau.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drapeau.clsse.EntiteDrapeau;

public interface DrapeauRepository extends JpaRepository<EntiteDrapeau, Long>{

}
