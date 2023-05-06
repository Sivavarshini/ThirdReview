package com.Athletics.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Athletics.demo.model.AthleticsParentModel;
import com.Athletics.demo.service.ParentChildService;

@RestController
public class ParentChildController {

	@Autowired
	ParentChildService apService;
	@GetMapping("/getAllPersons")
     public List<AthleticsParentModel> fetchAllPersons()
	   {
		  return apService.fetchAllPersons();
	   }
	   @PostMapping("/saveAlldata")
	   public AthleticsParentModel savePersons(@RequestBody AthleticsParentModel p)
	   {
		   return apService.savePersons(p);
	   }
}
