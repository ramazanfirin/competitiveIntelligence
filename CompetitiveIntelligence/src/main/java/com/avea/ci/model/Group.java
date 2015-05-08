package com.avea.ci.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.neo4j.graphdb.Direction;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.annotation.RelatedToVia;
@NodeEntity
@TypeAlias(value="Group")
public @Data class Group extends AbstractEntity{
	@Indexed(unique = true)
	@Getter @Setter private String name;
	
	@RelatedTo(type = "memberOf",direction= Direction.INCOMING)
	@Getter @Setter private Set<Company> companyList = new HashSet<Company>();
}
