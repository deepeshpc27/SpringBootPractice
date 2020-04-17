package com.syne.demo.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.syne.demo.entity.HealthInsurance;
import com.syne.demo.services.HealthInsuranceService;

import lombok.Setter;

@RestController
@Setter
@CrossOrigin(origins = "*")
public class HealthInsuranceController {

	@Autowired	
	private HealthInsuranceService hservice;	
	
	//fetching all records
	@GetMapping(path = "healthInsurance/viewPlans")
	public List<HealthInsurance> getAll(){
		
		try {
			if(hservice.findAll() == null) 
				throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Entities not found");
			}catch(ResponseStatusException e) {
				throw e;
			}
		
		return this.hservice.findAll();
	}
	
	//adding a new record
	@PostMapping(path="healthInsurance/addPlans")
	public HealthInsurance add(@RequestBody HealthInsurance entity) {
		return this.hservice.add(entity);
	}
	
	//updating the record
	@PutMapping(path="healthInsurance/updatePlan")
	public HealthInsurance update(@RequestBody HealthInsurance entity) {
		return this.hservice.update(entity);
	}
	
	//deleting a record
	@DeleteMapping(path = "healthInsurance/deletePlan")
	public HealthInsurance remove(@RequestBody HealthInsurance entity) {
		HealthInsurance removedEntity = this.hservice.delete(entity);
		try {
			if(removedEntity == null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Requested Entity Not Found");
			}
		}catch(ResponseStatusException e)
		{
			throw e;
		}
		return removedEntity;	
	}
	
	@GetMapping(path="healthInsurance/viewPlans/{planId}")
	public HealthInsurance findPlansByPlanId(@PathVariable Integer planId)  {
		
		HealthInsurance healthIns = this.hservice.findPlansByPlanID(planId);
		try {
			if(healthIns.getPlanId() != planId) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Requested ID Not Found");
			}
		}catch(ResponseStatusException e)
		{
			throw e;
		}
		return healthIns;
	}
	
}
