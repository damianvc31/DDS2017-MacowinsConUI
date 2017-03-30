package model;

public class Liquidacion implements Estado {

	@Override
	public double descuento(double precioBase) {
		return precioBase * 0.5;
	}
	@Override
	public String toString(){
		return "LIQUIDACION";
	};

}
