package model;

public class Oferta implements Estado {
	private double descuento;
	
	public Oferta(double descuento){
		this.descuento = descuento;
	}
	@Override
	public double descuento(double precioBase) {
		return this.descuento;
	}
	@Override
	public String toString(){
		return "OFERTA <" + descuento + ">";
	};

}
