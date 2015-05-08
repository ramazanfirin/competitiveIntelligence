package com.avea.ci.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.avea.ci.model.AbstractEntity;

public interface AbstractRepository  extends GraphRepository<AbstractEntity>{
	<C extends AbstractEntity> C save(C abstractEntity);
	
}
