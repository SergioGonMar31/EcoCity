package ecoCity;

public abstract class Edificio {
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
	return "Edificio [nombre=" + nombre + ", costo=" + costo + ", consumoEnergia=" + consumoEnergia + ", salud=" + salud
			+ "]";
}
}