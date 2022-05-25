package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libros")

public class Libro {
	@Id
	private int idlibro;
	private String autor;

	public Libro() {
		super();
	}

	public Libro(int idlibro, String autor) {
		super();
		this.idlibro = idlibro;
		this.autor = autor;
	}

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [id_libro=" + idlibro + ", autor=" + autor + "]";
	}

}
