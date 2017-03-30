package model.repositories;

import java.util.LinkedList;
import java.util.List;

import model.Prenda;

public class PrendasRepository {

	private List<Prenda> prendas = new LinkedList<>();

	public void agregar(Prenda prenda) {
		this.prendas.add(prenda);
	}

	public List<Prenda> all() {
		return prendas;
	}

}
