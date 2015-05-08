package com.avea.ci.model;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
@TypeAlias(value="AdvertisingCompany")
public class AdvertisingCompany extends Company{

	public AdvertisingCompany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdvertisingCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
