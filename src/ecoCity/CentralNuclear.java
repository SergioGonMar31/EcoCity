package ecoCity;

public class CentralNuclear extends EdificioIndustrial{

	public CentralNuclear(){
		nombre="Central Nuclear";
		costo=50;
		consumoEnergia=50;
		salud=100;
		activo=true;
	}
	
	@Override
	public double producirRecurso() {
		
		return consumoEnergia;
	}

	@Override
	public String getTipoRecurso() {
		
		return "Energia electrica";
	}

	@Override
	public void aplicarEfectoMensual() {
		
	}

}
