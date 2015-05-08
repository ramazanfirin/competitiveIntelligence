package com.avea.ci.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
@TypeAlias(value="SuccessFactor")
public @Data class SuccessFactor extends AbstractEntity{
	@Indexed(unique = true)
	private String name;
	
	private String environmental;
	 private String enterprise;
	 private String industry;
	
//	@RelatedTo(type = "succesFactor",direction= Direction.INCOMING)
//	@Getter @Setter private Company company;
	
	@RelatedTo(type = "strategy",direction= Direction.OUTGOING)
	 private Set<Strategy> Strategies = new HashSet<Strategy>();
}
