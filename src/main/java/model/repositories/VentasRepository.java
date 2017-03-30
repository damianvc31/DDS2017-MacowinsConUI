package model.repositories;

import java.util.ArrayList;
import java.util.List;

import model.Venta;

public class VentasRepository {

	private List<Venta> ventas = new ArrayList<>();

	public void agregar(Venta venta) {
		if(venta.getPrenda().getStock() >= venta.getUnidades()){
			this.ventas.add(venta);
			venta.getPrenda().vender(venta.getUnidades());
			System.out.println(venta + " - Venta OK");
		}
		else{
			System.out.println("No se puede vender por falta de stock");
		}
	}
	
	public List<Venta> all() {
		return this.ventas;
	}

}
