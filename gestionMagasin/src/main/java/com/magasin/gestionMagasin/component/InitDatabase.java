package com.magasin.gestionMagasin.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.magasin.gestionMagasin.model.Article;
import com.magasin.gestionMagasin.repository.ArticleRepository;

@Component
public class InitDatabase implements CommandLineRunner {

	@Autowired
	private ArticleRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.repository.deleteAll();
		
		Article shoes = new Article(1, "shoes", 50.23);
		Article pants = new Article(2, "pants", 99.99);
		Article jumper = new Article(3, "jumper", 150);
		
		this.repository.save(shoes);
		this.repository.save(pants);
		this.repository.save(jumper);
		
		System.out.println(" -- Database has been initialized");		
	}
}
