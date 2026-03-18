package ecoCity;

public abstract class Edificio {
	protected String nombre;
	protected int costo;
	protected int consumoEnergia;
	protected int salud;

	public Edificio(String nombre, int costo, int consumoEnergia, int salud) {
		this.nombre=nombre;
		this.costo=costo;
		this.consumoEnergia=consumoEnergia;
		this.salud=salud;
	}

public abstract void aplicarEfectoMensual();

@Override
public String toString() {
	return "Edificio [nombre=" + nombre + ", costo=" + costo + ", consumoEnergia=" + consumoEnergia + ", salud=" + salud
			+ "]";
}
}