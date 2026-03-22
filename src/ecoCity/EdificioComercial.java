package ecoCity;

public class EdificioComercial extends Edificio {
	// ATRIBUTOS
	private int felicidad;

	// CONSTRUCTOR
	public EdificioComercial() {
		nombre = "Edificio Comercial";
		consumoEnergia = 50;
		costo = 50;
		felicidad = 10;
		salud = 100;
		activo = true;
	}
	// METODOS HEREDADO E IMPLEMENTADOS
	@Override
	public void aplicarEfectoMensual() { // Este metodo se encarga de aplicar un efecto mensual de felicidad mientras
											// este se encuentre activo
		if (activo && salud > 0) {
			desgastar(50);
				System.out.println(nombre+" aporta "+felicidad+" de felicidad este mes");
				
				if(salud<=30) {	
					System.out.println("⚠️ "+nombre+" requiere mantenimiento de manera urgente");
				}
		}else {
			System.out.println(nombre+" se encuentra inactivo en estos momentos disculpe las molestias, no aportara felicida");
		}

	}

	// GETTERS Y SETTERS

	public int getFelicida() {
		return felicidad;
	}

	public void setFelicida(int felicidad) {
		this.felicidad = felicidad;
	}


}
