package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Libro;

public interface LibroRepository extends CrudRepository<Libro, Integer> {

}
