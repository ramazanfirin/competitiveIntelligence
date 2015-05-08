package com.avea.ci.model;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;



@RelationshipEntity(type = "viewpoint")  
public class ViewPoint extends AbstractEntity{


    
	@Fetch @StartNode 
    private Company startNode;
    
	@Fetch @EndNode 
    private Company endNode;
	
	private String name;
	

	public ViewPoint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ViewPoint(Company startNode, Company endNode,
			String name) {
		super();
		this.startNode = startNode;
		this.endNode = endNode;
		this.name = name;
	}



	public Company getStartNode() {
		return startNode;
	}

	public void setStartNode(Company startNode) {
		this.startNode = startNode;
	}

	public Company getEndNode() {
		return endNode;
	}

	public void setEndNode(Company endNode) {
		this.endNode = endNode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
