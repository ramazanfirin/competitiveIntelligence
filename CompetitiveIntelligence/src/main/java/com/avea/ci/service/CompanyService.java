package com.avea.ci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avea.ci.model.Company;
import com.avea.ci.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired(required=true)
	private CompanyRepository companyRepository;
	
	public void save(Company company){
		companyRepository.save(company);
	}
	
	public void deleteAll(){
		companyRepository.deleteAll();
	}
	
	public void updateLabels(String name){
		companyRepository.updateLabelsForCompany();
		companyRepository.updateLabelsForCountry();;
		companyRepository.updateLabelsForGroup();
		companyRepository.updateLabelsForPeople();
		companyRepository.updateLabelsForProduct();
		companyRepository.updateLabelsForStrategy();
		companyRepository.updateLabelsForSuccessFactor();
	}
}



	
	
	