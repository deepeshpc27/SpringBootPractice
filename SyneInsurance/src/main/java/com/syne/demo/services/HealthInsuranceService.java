package com.syne.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syne.demo.entity.HealthInsurance;
import com.syne.demo.repos.HealthInsuranceRepository;

@Service
public class HealthInsuranceService {

	@Autowired
	private HealthInsuranceRepository hrepo;
	
	//fetching all the records
	public List<HealthInsurance> findAll(){
		return this.hrepo.findAll();
	}
	
	//adding the records
	public HealthInsurance add(HealthInsurance entity) {
		return this.hrepo.save(entity);
	}
	
	//updating the records
	public HealthInsurance update(HealthInsurance entity) {
		return this.hrepo.save(entity);
	}
	
	//deleting the records
	public HealthInsurance delete(HealthInsurance entity) {
		HealthInsurance res = null;
		if(hrepo.existsById(entity.getPlanId())) {
			hrepo.delete(entity);
			res = entity;
		}
		return res;
	}
	
	//searching plans by plan ID
	public HealthInsurance findPlansByPlanID(Integer planId) {
		Optional<HealthInsurance> hiFromRepo = this.hrepo.findById(planId);
		return hiFromRepo.orElse(new HealthInsurance());
	}
}
