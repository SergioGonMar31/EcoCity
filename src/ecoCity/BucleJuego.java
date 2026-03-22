package ecoCity;

import java.util.ArrayList;
import java.util.Scanner;

import utiles.Depurar;

public class BucleJuego {

	private int habitantes;
	private int felicidad;
	ArrayList <Edificio> edificios;
	ArrayList <Integer> recursos;
	private boolean finjuego;
	private boolean pasarmes;

	public BucleJuego() {
		habitantes=10;
		felicidad=10;
		edificios=new ArrayList<>();
		recursos=new ArrayList<>();
		finjuego=false;
		recursos.add(0, 500);
		recursos.add(1, 200);
		pasarmes=false;
	}


	public int getHabitantes() {
		return habitantes;
	}


	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}


	public int getFelicidad() {
		return felicidad;
	}


	public void setFelicidad(int felicidad) {
		this.felicidad = felicidad;
	}
	public void modificarFelicidad(int felicidad) {
		this.felicidad+=felicidad;
	}




	public void jugar() {
		while(!finjuego) {
			mostrarDatos();
			String opcion=Depurar.texto("Elige una opción: ", new Scanner(System.in));
			switch(opcion) {
			case "1":
				construirEdificio();
				break;
			case "2":
				reparar();
				break;
			case "3":
				System.out.println("Pasando mes.");
				pasarmes=true;
				break;
			case "4":
				System.out.println("Saliendo del juego...");
				finjuego=true;
				break;
			default:
				System.out.println("Elige una opción valida");
				break;
			}
			if(pasarmes) {
				felicidad-=10;
				for(Edificio e : edificios) {
					int energia= recursos.get(0);
					if(e.isActivo()) {

						int dinero=recursos.get(1);
						e.aplicarEfectoMensual();
						if(e instanceof ParqueEolico) {
							energia+=((ParqueEolico) e).producirRecurso();

						}else if(e instanceof CentralNuclear) {
							energia+=((CentralNuclear) e).producirRecurso();
						}else if(e instanceof EdificioResidencial) {
							dinero+=((EdificioResidencial) e).getImpuestos();
							recursos.set(1, dinero);
						}else if(e instanceof EdificioComercial) {
							felicidad+=((EdificioComercial) e).getFelicida();
						}
					}
					energia-=e.getConsumoEnergia();
					recursos.set(0, energia);
				}

				if(recursos.get(0)<=0) {
					felicidad-=50;
				}
				if(felicidad<=0) {
					System.out.println("\nLa pobalción no esta nada contenta. Tras un golpe de estado eres retirado de tu cargo.");
					System.out.println("\nFIN DE LA PARTIDA");
					finjuego=true;
				}
				pasarmes=false;
			}
		}

	}	


	private void construirEdificio() {
		boolean salir=false;
		Edificio e;
		while(!salir) {
			System.out.println("");
			System.out.println("¿Que edificio quieres construir?");
			System.out.println("1. Central Nuclear");
			System.out.println("2. Parque Eolico");
			System.out.println("3. Edificio Comercial");
			System.out.println("4. Edificio Residencial");
			System.out.println("5. Salir");
			System.out.println("");
			String opcion=Depurar.texto("Elige una opción: ", new Scanner(System.in));
			switch(opcion) {
			case "1":
				e= new CentralNuclear();
				comprar(e);
				break;
			case "2":
				e= new ParqueEolico();
				comprar(e);
				break;
			case "3":
				e= new EdificioComercial();
				comprar(e);
				break;
			case "4":
				e= new EdificioResidencial();
				comprar(e);

				break;
			case "5":
				System.out.println("Volviendo...");
				salir=true;
				break;
			default:
				System.out.println("Elige una opción valida.");
				break;
			}
		}
	}

	private void comprar(Edificio e) {
		int dinero;
		System.out.println(e.toString());
		System.out.println("¿Comprar?");
		String opcion2=Depurar.texto("Si o No", new Scanner(System.in));
		if(opcion2.equals("Si")) {	
			if(e.getCosto()<=recursos.get(1)) {
				edificios.add(e);
				dinero=recursos.get(1);
				dinero-=e.getCosto();
				recursos.set(1, dinero);
				if(e instanceof EdificioResidencial) {
					habitantes+=10;
				}
				System.out.println("Edificio construido");
			}else {
				System.out.println("Te falta Pasta monstruo");
			}
		}
	}
	private void reparar() {
		boolean salir=false;
		int i=1;
		while(!salir) {
			for(Edificio e : edificios) {
				System.out.println(i+". "+e.info());
				i++;
			}
			System.out.println(i+". Salir");
			System.out.println("Reaprar un edificio cuesta 25€");
			int opcion=Depurar.entero("Elige una opción: ", new Scanner(System.in));
			if(opcion==i) {
				salir=true;
			}else {
				if(recursos.get(1)>=20) {
					Edificio e=edificios.get(opcion-1);
					e.reparar();
				}else {
					System.out.println("No tienes suficiente dinero.");
				}
			}
			i=1;
		}
	}
	private void mostrarDatos() {
		int i=1;
		System.out.println("");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Energia: "+recursos.get(0)+"Kw | Dinero: "+recursos.get(1)+"€ | habitantes: "+habitantes+" | felicidad: "+felicidad);
		System.out.println("");
		for(Edificio e: edificios) {
			System.out.println(i+". "+ e.info());
			i++;
		}
		System.out.println("");
		System.out.println("1. Construir  2. Reparar  3. Pasar Mes  4. Salir");
	}
}