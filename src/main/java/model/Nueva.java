package model;

public class Nueva implements Estado {

	@Override
	public double descuento(double precioBase) {
		return 0;
	}
	@Override
	public String toString(){
		return "NUEVA";
	};

}
