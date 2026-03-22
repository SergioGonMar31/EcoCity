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

		return 100;
	}

	@Override
	public String getTipoRecurso() {

		return "Energia";
	}

	@Override
	public void aplicarEfectoMensual() {
		if(activo) {
			desgastar(15);
			
			if(salud<=20) {
				int num=(int)((Math.random()*10)+1);
				if(num<=3) {
					activo=false;
				}
			}
		}else {
			System.out.println(nombre+" no se encuentra operativa. Reparalo para que funcione");
		}

	}

	

}
