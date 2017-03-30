package model;

import org.uqbar.commons.utils.Observable;

@Observable
public class Venta {

	private int unidades;
	private Prenda prenda;

	public Venta(int unidades, Prenda prenda) {
		this.unidades = unidades;
		this.prenda = prenda;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	
	@Override
	public String toString(){
		return this.prenda.toString() + " x" + this.unidades;
	}
}
