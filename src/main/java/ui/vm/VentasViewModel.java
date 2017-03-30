package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import model.Venta;
import model.repositories.Repositorios;

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
		this.setVentas(Repositorios.ventas.all());
	}
	
}


