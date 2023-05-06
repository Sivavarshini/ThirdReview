package com.Athletics.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Athletics.demo.model.AthleticsParentModel;

@Repository
public interface AthleticsParentRepository extends JpaRepository<AthleticsParentModel,Integer> {

}
