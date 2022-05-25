package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.model.Libro;

public interface ILibroService {
	
	public void save (Libro libro);
	public Libro findById(int id_libro);
	public void deleteById (int id_libro);
	public List<Libro> findAll();
	
}
