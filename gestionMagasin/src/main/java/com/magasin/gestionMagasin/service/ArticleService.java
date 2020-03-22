package com.magasin.gestionMagasin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magasin.gestionMagasin.model.Article;
import com.magasin.gestionMagasin.repository.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository repository;
	
	
	public Article saveArticle(Article article) {
		return repository.save(article);
	}
	
	public List<Article> getArticles() {
		return repository.findAll();
	}
	
	public Article getArticleById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Article getArticleByName(String name) {
		return repository.findByName(name);
	}
}
