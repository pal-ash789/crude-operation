package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Categories;
import com.springrest.springrest.services.Categoriessrevice;

@RestController
public class MyController {

	@Autowired
	private Categoriessrevice categoriessrevice;
	

	// get all the categories
	@GetMapping("/categories")
	public List<Categories> getCategories() {
		return this.categoriessrevice.getCategories();
	}

	// GET categories by Id
	@GetMapping("/categorie/{categorieId}")
	public Categories getCategorie(@PathVariable String categoriesId) {
		return this.categoriessrevice.getCategories(Long.parseLong(categoriesId));
	}

	// add categories
	@PostMapping("/categorie")
	public Categories addCategories(@RequestBody Categories categories) {
		return this.categoriessrevice.addCategories(categories);
	}

	//update categories
	@PutMapping("/categorie")
	public Categories updateCategories(@RequestBody Categories categories) {

		return this.categoriessrevice.updateCategories(categories);
	}

	//delete categories
	@DeleteMapping("/categorie/{categorieId}")
	public ResponseEntity<HttpStatus> deleteCategories(@PathVariable String categories){
		try {
			this .categoriessrevice.deleteCategories(Long.parseLong(categories));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
