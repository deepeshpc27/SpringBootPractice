package com.syne.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "health_insurance")

public class HealthInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int planId;
	private String planName;
	private String insuranceProvider;
	private String description;
	private String coverage;
	private double premium;
	private String periodicity;
	private boolean accidentalBenefitCovered;
	private String accidentAmountCovered;
	
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getInsuranceProvider() {
		return insuranceProvider;
	}
	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getPeriodicity() {
		return periodicity;
	}
	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}
	
	public String getAccidentAmountCovered() {
		return accidentAmountCovered;
	}
	public void setAccidentAmountCovered(String accidentAmountCovered) {
		this.accidentAmountCovered = accidentAmountCovered;
	}
	
	public boolean isAccidentalBenefitCovered() {
		return accidentalBenefitCovered;
	}
	public void setAccidentalBenefitCovered(boolean accidentalBenefitCovered) {
		this.accidentalBenefitCovered = accidentalBenefitCovered;
	}
	
	public HealthInsurance(int planId, String planName, String insuranceProvider, String description, String coverage,
			double premium, String periodicity, boolean accidentalBenefitCovered, String accidentAmountCovered) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.insuranceProvider = insuranceProvider;
		this.description = description;
		this.coverage = coverage;
		this.premium = premium;
		this.periodicity = periodicity;
		this.accidentalBenefitCovered = accidentalBenefitCovered;
		this.accidentAmountCovered = accidentAmountCovered;
	}
	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accidentAmountCovered == null) ? 0 : accidentAmountCovered.hashCode());
		result = prime * result + (accidentalBenefitCovered ? 1231 : 1237);
		result = prime * result + ((coverage == null) ? 0 : coverage.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((insuranceProvider == null) ? 0 : insuranceProvider.hashCode());
		result = prime * result + ((periodicity == null) ? 0 : periodicity.hashCode());
		result = prime * result + planId;
		result = prime * result + ((planName == null) ? 0 : planName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(premium);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HealthInsurance other = (HealthInsurance) obj;
		if (accidentAmountCovered == null) {
			if (other.accidentAmountCovered != null)
				return false;
		} else if (!accidentAmountCovered.equals(other.accidentAmountCovered))
			return false;
		if (accidentalBenefitCovered != other.accidentalBenefitCovered)
			return false;
		if (coverage == null) {
			if (other.coverage != null)
				return false;
		} else if (!coverage.equals(other.coverage))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (insuranceProvider == null) {
			if (other.insuranceProvider != null)
				return false;
		} else if (!insuranceProvider.equals(other.insuranceProvider))
			return false;
		if (periodicity == null) {
			if (other.periodicity != null)
				return false;
		} else if (!periodicity.equals(other.periodicity))
			return false;
		if (planId != other.planId)
			return false;
		if (planName == null) {
			if (other.planName != null)
				return false;
		} else if (!planName.equals(other.planName))
			return false;
		if (Double.doubleToLongBits(premium) != Double.doubleToLongBits(other.premium))
			return false;
		return true;
	}
	
	
		
}
