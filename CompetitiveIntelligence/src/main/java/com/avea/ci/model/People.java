package com.avea.ci.model;

import lombok.Getter;
import lombok.Data;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
@TypeAlias(value="People")
public @Data class People extends AbstractEntity{
	@Indexed(unique = true)
	private String name;
}
