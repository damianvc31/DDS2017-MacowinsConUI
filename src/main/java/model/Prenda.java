package model;

public class Prenda {
	private Estado estado;
	private String nombre;
	private String marca;
	private TipoPrenda tipo;
	private double precioBase;
	private int stock;

	public Prenda(String nombre, String marca, Estado estado,double precioBase, TipoPrenda tipo) {
		super();
		this.estado = estado;
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.stock = 0;
	}
	
	public void incrementarStock(int unidades) {
		this.stock += unidades;
	}
	
	public void vender(int unidades) {
		this.stock -= unidades;
	}
	
	public double precio() {
		return this.precioBase - descuento();
	}

	private double descuento() {
		return estado.descuento(this.precioBase);
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

	@Override
	public String toString(){
		return this.nombre + " - Marca: " + this.marca + " - " + this.estado 
				+ " - Rubro: " + this.tipo.toString() 
				+ " - Precio: " + this.precioBase;
				
	}

}
