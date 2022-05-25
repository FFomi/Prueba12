package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ILibroService;
import com.example.demo.model.Libro;
import com.example.demo.repository.LibroRepository;
import com.example.demo.interfaces.ILibroService;
import com.example.demo.model.Libro;

@Service
public class LibroService implements ILibroService {
	
	@Autowired
	LibroRepository libroRepository;

	@Override
	public void save(Libro libro) {
		libroRepository.save(libro);

	}

	@Override
	public Libro findById(int id_libro) {
		return libroRepository.findById(id_libro).orElse(null);
	}

	@Override
	public void deleteById(int id_libro) {
		libroRepository.deleteById(id_libro);

	}

	@Override
	public ArrayList<Libro> findAll() {
		return (ArrayList<Libro>)libroRepository.findAll();
	}

}
