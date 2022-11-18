package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {

	@Id
	private long id;
	private String projectname;
	private String description;
	
	public Categories(long id, String projectname, String description) {
		super();
		this.id = id;
		this.projectname = projectname;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "categories [id=" + id + ", projectname=" + projectname + ", description=" + description + "]";
	} 
	
	
}
