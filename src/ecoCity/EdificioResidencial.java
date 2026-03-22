package ecoCity;

public class EdificioResidencial extends Edificio {
	
	private int impuestos;
	public EdificioResidencial () {	
		nombre = "Edificio Residencial";
		costo = 50;
		consumoEnergia = 100;
		salud = 100;
		activo = true;
		impuestos=70;
	}
	

	@Override
	public void aplicarEfectoMensual() {
		if(activo) {
			desgastar(15);
		}else {
			System.out.println(nombre+" esta inactivo. Reparalo para que produzca");
		}
	}


	public int getImpuestos() {
		return impuestos;
	}

}
