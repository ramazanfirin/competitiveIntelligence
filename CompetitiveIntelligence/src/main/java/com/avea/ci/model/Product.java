package com.avea.ci.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
@TypeAlias(value="Product")
public @Data class Product extends AbstractEntity{
	@Indexed(unique = true)
	private String name;

	private String strengless;
	private String weaknessless;
	private Double price;
	 private Double discount;
	
}
