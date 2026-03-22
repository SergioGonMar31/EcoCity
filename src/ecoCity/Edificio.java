package ecoCity;

public abstract class Edificio implements Mantenible {
	protected String nombre;
	protected int costo;
	protected int consumoEnergia;
	protected int salud;
	protected boolean activo;
	
	public Edificio() {

	}

	public abstract void aplicarEfectoMensual();

	@Override
	public String toString() {
		return nombre + "[costo=" + costo + ", consumoEnergia=" + consumoEnergia +"]";
	}
	
	public String info() {
		String mantenimiento="";
		if(salud<50) {
			mantenimiento="¡REQUIERE MANTENIMIENTO!";
		}
		if(!activo) {
			mantenimiento="¡EDIFICIO DESTRUIDO! ¡REPARALO!";
		}
		return nombre +"[salud: "+salud+", activo: "+activo+"] "+ mantenimiento;
	}
	@Override
	public void reparar() {
		salud = 100;
		activo=true;
	}
	
	@Override
	public void desgastar(int cantidad) {
		salud -= cantidad;
		
		if(salud<=0) {
			salud=0;
			activo=false;
		}
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getConsumoEnergia() {
		return consumoEnergia;
	}

	public void setConsumoEnergia(int consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}