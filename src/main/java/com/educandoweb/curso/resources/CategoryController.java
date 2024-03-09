package com.educandoweb.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.entities.Category;
import com.educandoweb.curso.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/findALL")
	public ResponseEntity<List<Category>> findAll(){
		List<Category> lista= categoryService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	public ResponseEntity<Category> findById(Long id){
		Category category = categoryService.findById(id);
		return ResponseEntity.ok().body(category);
	}
}
