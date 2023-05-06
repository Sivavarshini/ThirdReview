package com.Athletics.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Athletics.demo.model.AthleticsChildModel;

@Repository
public interface AthleticsChildRepository extends JpaRepository<AthleticsChildModel,Integer>
{
	
}
