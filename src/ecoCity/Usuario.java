package ecoCity;

import java.math.BigInteger;

public class Usuario {
	private String nombre;
	private BigInteger contrasena;
	
	public Usuario (String nombre, BigInteger contrasena) {
		this.nombre = nombre;
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigInteger getContrasena() {
		return contrasena;
	}

	public void setContrasena(BigInteger contrasena) {
		this.contrasena = contrasena;
	}
}
