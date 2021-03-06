package com.ipartek.formacion.basedatosProfe.bean;

import java.sql.Timestamp;

public class Persona {
	
	//Atributos
	private int id;
	private String nombre;
	private float nota;
	private String telefono;
	private Timestamp fecha;
	
	//Constructores
	/**
	 * @param id
	 * @param nombre
	 * @param nota
	 * @param telefono
	 * @param fecha
	 */
	public Persona(String nombre) {
		super();
		this.id = -1;
		this.nombre = nombre;
		this.fecha = null;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", nota=" + nota
				+ ", telefono=" + telefono + ", fecha=" + fecha + "]";
	}
	
}
