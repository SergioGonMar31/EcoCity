package ecoCity;

import java.math.BigInteger;

public class Encriptacion {
	public static BigInteger encriptacion (String contrasena) {
		StringBuilder sb = new StringBuilder();
		int numero = 0;
		
		for(int i = 0; i < contrasena.length(); i++) {
			
			numero = contrasena.charAt(i);
			
			if (numero < 100) {
				sb.insert(0, "0" + numero);
			}else {
				sb.insert(0, numero);
			}
		}
		BigInteger num = new BigInteger (sb.toString());
		return num;
	}

	
	public static String inverso (BigInteger numero) {
		StringBuilder sb = new StringBuilder();
		char caracter = ' ';
		BigInteger num, numeroMod = numero;
		for (int i = 0; i < numero.toString().length(); i+= 3) {
			num = numeroMod.remainder(BigInteger.valueOf(1000));
			caracter = (char) num.intValue();
			numeroMod = numeroMod.divide(BigInteger.valueOf(1000));
			sb.append(caracter);
		}		
		return sb.toString();
	}
}