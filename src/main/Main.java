package main;

import java.util.Scanner;

import ecoCity.Encriptacion;
import ecoCity.Usuario;
import ecoCity.BucleJuego;
public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String nombre = "", contrasena = "";
		System.out.println("Introduzca su nombre de usuario: ");
		nombre = sc.nextLine();
		System.out.println("Introduzca su contraseña: ");
		contrasena = sc.nextLine();
		Usuario usuario = new Usuario (nombre, Encriptacion.encriptacion(contrasena));	
		BucleJuego juego = new BucleJuego();
		juego.jugar();
	}
}
