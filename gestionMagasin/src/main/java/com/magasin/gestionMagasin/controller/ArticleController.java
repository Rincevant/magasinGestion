package com.magasin.gestionMagasin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magasin.gestionMagasin.model.Article;
import com.magasin.gestionMagasin.service.ArticleService;

@RestController
public class ArticleController {
	
	@Autowired
	private ArticleService service;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/articles")
	public List<Article> findAllArticles() {
		return service.getArticles();
	}

}
