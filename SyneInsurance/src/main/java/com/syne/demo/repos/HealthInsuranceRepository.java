package com.syne.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syne.demo.entity.HealthInsurance;

@Repository
public interface HealthInsuranceRepository extends JpaRepository<HealthInsurance, Integer> {

}
