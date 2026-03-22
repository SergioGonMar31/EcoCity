package ecoCity;

public class EdificioResidencial extends Edificio implements GeneradorRecursos {
	
	public EdificioResidencial () {
		nombre = "Edificio Residencial";
		costo = 50;
		consumoEnergia = 100;
		salud = 20;
		activo = true;
	}
	
	@Override
	public double producirRecurso() {
		
		return 0;
	}

	@Override
	public String getTipoRecurso() {
		return null;
	}

	@Override
	public void aplicarEfectoMensual() {
		
	}

}
