package model;

import model.repositories.Repositorios;

public class Fixture {

	public static void initialize() {
		Prenda pantalonNegroSarkani = new Prenda("Pantalon negro", "Sarkany", 900, TipoPrenda.PANTALON);
		Prenda camisaMangaCortaSarkani = new Prenda("Camisa manga corta", "Sarkany", 850, TipoPrenda.CAMISA);
		camisaMangaCortaSarkani.incrementarStock(100);
		
		Repositorios.prendas.agregar(pantalonNegroSarkani);
		Repositorios.prendas.agregar(camisaMangaCortaSarkani);
	}

}
