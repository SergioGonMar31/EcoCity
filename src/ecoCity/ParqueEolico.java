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

		return 70;
	}

	@Override
	public String getTipoRecurso() {
		return "Energia";
	}

	@Override
	public void aplicarEfectoMensual() {
		if(activo) {
			desgastar(5);
		}else {
			System.out.println(nombre+" no esta activo. Reparalo para que funcione");
		}
	}
	

}
