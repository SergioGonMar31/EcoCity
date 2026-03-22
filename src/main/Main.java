package main;

<<<<<<< HEAD
import java.util.Scanner;

import ecoCity.Encriptacion;
import ecoCity.Usuario;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String nombre = "", contrasena = "";
		System.out.println("Introduzca su nombre de usuario: ");
		nombre = sc.nextLine();
		System.out.println("Introduzca su contraseña: ");
		contrasena = sc.nextLine();
		Usuario usuario = new Usuario (nombre, Encriptacion.encriptacion(contrasena));	
=======
import ecoCity.BucleJuego;

public class Main {
	public static void main(String[] args) {
		BucleJuego juego=new BucleJuego();
		juego.jugar();
>>>>>>> efe4090131efa1c43f929d498608815289c966bf
	}
}
