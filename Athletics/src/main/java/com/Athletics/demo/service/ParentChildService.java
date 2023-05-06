package com.Athletics.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Athletics.demo.model.AthleticsParentModel;
import com.Athletics.demo.repository.AthleticsParentRepository;

@Service
public class ParentChildService {

	@Autowired
	AthleticsParentRepository perRepository;
	public List<AthleticsParentModel>fetchAllPersons()
	   {
		   return perRepository.findAll();
	   }
    public AthleticsParentModel savePersons(AthleticsParentModel p)
	   {
		   return perRepository.save(p);
	   }
}
