package model;

import org.uqbar.commons.utils.Observable;

@Observable
public class Prenda {
	private Estado estado;
	private String nombre;
	private String marca;
	private TipoPrenda tipo;
	private double precioBase;
	private int stock;

	public Prenda(String nombre, String marca, double precioBase, TipoPrenda tipo) {
		super();
		this.estado = new Nueva();
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.stock = 0;
	}
	
	public Venta vender(int unidades) {
		return new Venta(unidades, this);
	}
	
	public double precio() {
		return this.precioBase - descuento();
	}

	private double descuento() {
		return estado.descuento(this.precioBase);
	}
	
	public void vender() {
		this.stock--;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public int getStock() {
		return stock;
	}

	public Estado getEstado() {
		return estado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMarca() {
		return marca;
	}

	public TipoPrenda getTipo() {
		return tipo;
	}

	public void incrementarStock(int unidades) {
		this.stock += unidades;
	}

}
