package com.magasin.gestionMagasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.gestionMagasin.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

	Article findByName(String name);

}
