package com.catalogo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.catalogo.PelisCatalogoApplication;
import com.catalogo.model.Detalle;
import com.catalogo.model.Personaje;
import com.catalogo.model.Response;


@Controller
@RequestMapping("/")
public class HomeController {
	RestTemplate restTemplate = new RestTemplate();
	Response data;
	
	@GetMapping("")
	public String Home(Model model) {
		ResponseEntity<Response> response = restTemplate.getForEntity("https://swapi.dev/api/films/", Response.class);
		data = response.getBody();
		
		model.addAttribute("peliculas",data.getResults());
		
		return "index";
	}

	@GetMapping("/peliculas/detalle/{id}")
	public String mostrarDetalle(@PathVariable int id, Model model) {
		if (data==null) {
			return "redirect:/index";
		}
		Detalle detalle = data.getResults().get(id);
		model.addAttribute("detalle",detalle);
		
		List<Personaje> personas = new ArrayList<>();
		
		detalle.getCharacters().forEach(c->{
			ResponseEntity<Personaje> personaje = restTemplate.getForEntity(c, Personaje.class);
			personas.add(personaje.getBody());
		});

		 model.addAttribute("personajes",personas);
		 
		return "detalle";
	}
	
	
}
