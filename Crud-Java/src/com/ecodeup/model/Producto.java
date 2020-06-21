package com.ecodeup.model;

import java.sql.Date;

public class Producto {
	private int id;
	private String nombre;
	private double cantidad;
	private double precio;
	private Date fechaCrear;
	private Date fechaActualizar;
	
	
	public Producto(int id, String nombre, double cantidad, double precio, Date fechaCrear, Date fechaActualizar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fechaCrear = fechaCrear;
		this.fechaActualizar = fechaActualizar;
	}
	

	public Producto() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the cantidad
	 */
	public double getCantidad() {
		return cantidad;
	}


	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	/**
	 * @return the fechaCrear
	 */
	public Date getFechaCrear() {
		return fechaCrear;
	}


	/**
	 * @param fechaCrear the fechaCrear to set
	 */
	public void setFechaCrear(Date fechaCrear) {
		this.fechaCrear = fechaCrear;
	}


	/**
	 * @return the fechaActualizar
	 */
	public Date getFechaActualizar() {
		return fechaActualizar;
	}


	/**
	 * @param fechaActualizar the fechaActualizar to set
	 */
	public void setFechaActualizar(Date fechaActualizar) {
		this.fechaActualizar = fechaActualizar;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", fechaCrear=" + fechaCrear + ", fechaActualizar=" + fechaActualizar + "]";
	}
	
	

}
