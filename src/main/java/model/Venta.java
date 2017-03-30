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

}
