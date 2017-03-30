package model.repositories;

import java.util.ArrayList;
import java.util.List;

import model.Venta;

public class VentasRepository {

	private List<Venta> ventas = new ArrayList<>();

	public List<Venta> all() {
		return this.ventas;
	}

}
