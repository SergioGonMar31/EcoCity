package ecoCity;

public class ParqueEolico extends EdificioIndustrial {

	public ParqueEolico(){
		nombre="Parque Eolico";
		costo=30;
		consumoEnergia=20;
		salud=100;
		activo=true;
	}
	@Override
	public double producirRecurso() {
		
		return consumoEnergia;
	}

	@Override
	public String getTipoRecurso() {
		return "Energia";
	}

	@Override
	public void aplicarEfectoMensual() {
	salud-=5;	
	}

}
