package com.avea.ci.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

import com.avea.ci.model.Company;

public interface CompanyRepository extends GraphRepository<Company>{
	//Company save(Company company);
	
		
	@Query("START n=node(*) where n.__type__='Company' SET n:Company ;")
    public void updateLabelsForCompany();
	
	@Query("START n=node(*) where n.__type__='Country' SET n:Country ;")
    public void updateLabelsForCountry();
	
	@Query("START n=node(*) where n.__type__='Group' SET n:Group ;")
    public void updateLabelsForGroup();
	
	@Query("START n=node(*) where n.__type__='People' SET n:People ;")
    public void updateLabelsForPeople();
	
	@Query("START n=node(*) where n.__type__='Product' SET n:Product ;")
    public void updateLabelsForProduct();
	
	@Query("START n=node(*) where n.__type__='Strategy' SET n:Strategy ;")
    public void updateLabelsForStrategy();
	
	@Query("START n=node(*) where n.__type__='SuccessFactor' SET n:SuccessFactor ;")
    public void updateLabelsForSuccessFactor();
	
	@Query("START n=node(*) where n.__type__='AdvertisingCompany' SET n:AdvertisingCompany ;")
    public void updateLabelsForAdvertisingCompany();
}
