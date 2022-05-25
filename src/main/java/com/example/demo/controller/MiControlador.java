package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.ILibroService;
import com.example.demo.model.Libro;

@RestController
@RequestMapping("libros")
public class MiControlador {

	@Autowired
	ILibroService libroservice;

	@GetMapping("/list_all")
	public List<Libro> get_libros() {
		return libroservice.findAll();
	}

	@PostMapping("/add")
	public Integer add_id_libro(@RequestBody Libro libro) {
		Libro libroaux = libroservice.findById(libro.getIdlibro());
		if (libroaux == null) {
			libroservice.save(libro);
			return 0;
		} else {
			return 1;
		}
	}

	@GetMapping("/find_by_id_libro/{id_libro}")
	public Libro get_libro_by_id(@PathVariable("id_libro") int id_libro) {
		Libro libroaux = libroservice.findById(id_libro);
		if (libroaux == null) {
			return new Libro();
		} else {
			return libroservice.findById(id_libro);
		}
	}

	@DeleteMapping("/delete_by_id_libro/{id_libro}")
	public Integer delete_libro_by_id(@PathVariable("id_libro") int id_libro) {
		Libro libroaux = libroservice.findById(id_libro);
		if (libroaux == null) {
			return 1;
		} else {
			libroservice.deleteById(id_libro);
			return 0;
		}
	}

	@PutMapping("/update")
	public Integer update_libro(@RequestBody Libro libro) {
		System.out.println(libro);
		Libro libroaux = libroservice.findById(libro.getIdlibro());
		if (libroaux == null) {
			return 1;
		} else {
			libroservice.save(libro);
			return 0;
		}
	}

}
