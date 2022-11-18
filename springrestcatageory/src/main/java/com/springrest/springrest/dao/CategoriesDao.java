package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Categories;

public interface CategoriesDao extends JpaRepository<Categories, Long>{

}
