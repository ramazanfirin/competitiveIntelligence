package com.avea.ci.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
@TypeAlias(value="Strategy")
public  @Data class Strategy extends AbstractEntity{
	@Indexed(unique = true)
	private String name;
}
