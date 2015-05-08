package com.avea.ci.model;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.annotation.RelatedToVia;

@NoArgsConstructor
@NodeEntity
@TypeAlias(value="Company")
public @Data class Company extends AbstractEntity{
	
	public Company(String name) {
		super();
		this.name = name;
	}

	@Indexed(unique = true)
	 private  String name;
	
	private String values;
	private String vision;
	private String mission;	
	private String profile;
	private String baseLocation;
	private String stockExchangeCode;
	private String coreCompedance;
	private String organizationChart;
	private String webSite;
	private Integer numberOfEmployes;
	private String financialPerformance;
	private String type;
	
	@RelatedTo(type="location",direction = Direction.OUTGOING)
	private Country country;
	
	@RelatedTo(type="strategicPosition",direction = Direction.OUTGOING)
	private Set<People> strategicPositions = new HashSet<People>();
	
	@RelatedToVia(type="viewpoint", direction = Direction.OUTGOING)
	private Set<ViewPoint> competitors = new HashSet<ViewPoint>();
	
	@RelatedTo(type = "memberOf",direction= Direction.OUTGOING)
	private Group group ;
	
	@RelatedTo(type = "advertising",direction= Direction.OUTGOING)
	private AdvertisingCompany advertisingCompany ;
//	
	@RelatedTo(type = "succesFactor",direction= Direction.OUTGOING)
	private Set<SuccessFactor> successFactors = new HashSet<SuccessFactor>();
	
	@RelatedTo(type = "sells",direction= Direction.OUTGOING)
	private Set<Product> products = new HashSet<Product>();

	
	
	
}
