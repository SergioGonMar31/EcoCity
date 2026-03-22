package main;

import java.util.Scanner;

import ecoCity.Usuario;
import utiles.Depurar;
import utiles.Encriptacion;
import ecoCity.BucleJuego;
public class Main {
	public static void main(String[] args) {		
		String nombre = "", contrasena = "";
		nombre = Depurar.texto("Introduzca su nombre de usuario: ", new Scanner(System.in));
		contrasena = Depurar.texto("Introduzca su contraseña: ", new Scanner(System.in));
		Usuario usuario = new Usuario (nombre, Encriptacion.encriptacion(contrasena));	
		BucleJuego juego = new BucleJuego(usuario);
		juego.jugar();
	}
}
