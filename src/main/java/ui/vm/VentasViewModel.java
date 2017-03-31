package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

//import org.uqbar.commons.utils.TransactionalAndObservable;

import model.Venta;
import model.repositories.Repositorios;

//@TransactionalAndObservable //alternativa para solucionar problema de actualizacion de tabla
@Observable
public class VentasViewModel {

	private List<Venta> ventas;
	
	public VentasViewModel() {
		this.ventas = Repositorios.ventas.all();
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public void registrarVenta(Venta venta) {
		Repositorios.ventas.agregar(venta);
		this.setVentas(null); //se reasigna la lista de ventas a la misma para que lo actualice
		this.setVentas(Repositorios.ventas.all()); // la vista
	}
	
}


