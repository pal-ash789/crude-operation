package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CategoriesDao;
import com.springrest.springrest.entities.Categories;

@Service
public class CategoriessreviseImpl implements Categoriessrevice {

	@Autowired
	private CategoriesDao categoriesDao;
	// List<Categories> list;

	public CategoriessreviseImpl() {

	}

	@Override()
	public List<Categories> getCategories() {

		return categoriesDao.findAll();
	}

	@Override
	public Categories getCategories(long categoriesId) {

		return categoriesDao.getOne(categoriesId);
	}

	@Override
	public Categories addCategories(Categories categories) {

		categoriesDao.save(categories);
		return categories;
	}

	@Override
	public Categories updateCategories(Categories categories) {

		categoriesDao.save(categories);
		return categories;
	}

	
	@Override
	public void deleteCategories(long parseLong) {

		Categories entity = categoriesDao.getOne(parseLong);
		categoriesDao.delete(entity);
	}

}
