package ecoCity;

public class EdificioComercial extends Edificio implements Mantenible {
	// ATRIBUTOS
	private int felicida;
	private int cliente;

	// CONSTRUCTOR
	public EdificioComercial(String nombre, int consumoEnergia, int costo) {
		this.nombre = nombre;
		this.consumoEnergia = consumoEnergia;
		this.costo = costo;
		this.felicida = 10;
		this.salud = 100;
		this.activo = true;
	}

	// METODOS HEREDADO Y IMPLEMENTADOS
	@Override
	public void aplicarEfectoMensual() { // Este metodo se encarga de aplicar un efecto mensual de felicidad mientras
											// este se encuentre activo
		if (activo && salud > 0) {
				System.out.println(nombre+"aporta"+felicida+"de felicidad este mes");
				if(salud<=30) {	
					System.out.println("⚠️"+nombre+"requiere mantenimiento de manera urgente");
				}
		}else {
			System.out.println(nombre+"Se encuentra inactivo en estos momentos disculpe las molestias, no aportara felicida");
		}

	}
	
	@Override
	public void reparar() {
		salud = 100;

	}
	
	@Override
	public void desgastar(int cantidad) {
		salud -= cantidad;
		
		if(salud<=0) {
			salud=0;
			activo=false;
			
			
		}
	}

	// GETTERS Y SETTERS

	public int getFelicida() {
		return felicida;
	}

	public void setFelicida(int felicida) {
		this.felicida = felicida;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

}
