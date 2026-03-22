package ecoCity;

public class EdificioResidencial extends Edificio implements Mantenible {
	
	
	public EdificioResidencial () {	
		nombre = "Edificio Residencial";
		costo = 50;
		consumoEnergia = 100;
		salud = 20;
		activo = true;
	}
	

	@Override
	public void aplicarEfectoMensual() {
		
	}


	@Override
	public void reparar() {
		
		
	}

	@Override
	public void desgastar(int cantidad) {
		
		
	}

}
