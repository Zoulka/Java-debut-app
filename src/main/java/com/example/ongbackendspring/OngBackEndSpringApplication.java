package com.example.ongbackendspring;

import Model.Adherant;
import Repository.AdherantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class OngBackEndSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(OngBackEndSpringApplication.class, args);

	}
	@Autowired
	private AdherantRepository adherantRepository;

	@Override
	public void run(String... args) throws Exception {
			this.adherantRepository.save(new Adherant("Zourkaleini", "Salihou","Neant", "Gao", "France"));

		}


	}




