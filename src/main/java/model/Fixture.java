package model;

import model.repositories.Repositorios;

public class Fixture {

	public static void initialize() {
		Prenda pantalonNegroSarkani = new Prenda("Pantalon negro", "Sarkany", new Oferta(100), 900, TipoPrenda.PANTALON);
		Prenda camisaMangaCortaSarkani = new Prenda("Camisa manga corta", "Sarkany", new Liquidacion(), 850, TipoPrenda.CAMISA);
		camisaMangaCortaSarkani.incrementarStock(10);
		pantalonNegroSarkani.incrementarStock(10);
		
		Repositorios.prendas.agregar(pantalonNegroSarkani);
		Repositorios.prendas.agregar(camisaMangaCortaSarkani);
		
		Venta venta1 = new Venta(6,camisaMangaCortaSarkani);
		Venta venta2 = new Venta(3,pantalonNegroSarkani);
		Repositorios.ventas.agregar(venta1);
		Repositorios.ventas.agregar(venta2);
		
	}

}
