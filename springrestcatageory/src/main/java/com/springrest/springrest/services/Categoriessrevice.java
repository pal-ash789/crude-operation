package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Categories;

public interface Categoriessrevice {

	
	public List<Categories> getCategories();
	
	public Categories getCategories(long categoriesId);
	
	public Categories addCategories(Categories categories);
	
	public Categories updateCategories(Categories categories);

	public void deleteCategories(long categoriesId);
	
	
}
