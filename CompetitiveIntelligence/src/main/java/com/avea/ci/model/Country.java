package com.avea.ci.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
@TypeAlias(value="Country")
public @Data class Country extends AbstractEntity{
	@Indexed(unique = true)
	private String name;

}
