package utiles;

import java.util.Scanner;

public class Depurar {
	//Depura los números enteros
		public static int entero(String texto, Scanner sc) {
			boolean valido=false;
			int n=0;
			while(!valido) {
				try {
					System.out.println(texto);
					n=Integer.parseInt(sc.nextLine());
					valido=true;
				}catch(NumberFormatException e) {
					System.err.println("Error");
				}
			}
			return n;
		}

		//Depura los números decimales
		public static Double decimal(String texto, Scanner sc) {
			boolean valido=false;
			double n=0;
			while(!valido) {
				try {
					System.out.println(texto);
					n=Double.parseDouble(sc.nextLine());
					valido=true;
				}catch(NumberFormatException e) {
					System.err.println("Error");
				}
			}
			return n;
		}

		//Depura para que el String no pueda estar vacio
		public static String texto(String texto, Scanner sc) {
			String n="";
			do {
				System.out.println(texto);
				n=sc.nextLine();
			}while(n.isEmpty());
			return n;
		}

		//Depura para que la fecha sea correcta
		public static String fecha(String texto, Scanner sc) {
			String comprobacion="^\\d{2}+/\\d{2}+/\\d{4}$";
			boolean salir=false;
			while(!salir) {
				System.out.println(texto);
				String n=sc.nextLine();
				if(n.matches(comprobacion)) {
					if(comprobacionFecha(n)) {
						return n;
					}else {
						System.out.println("Fecha incorrecta");
					}
				}else {
					System.out.println("Introduce un formato correcto. dd/mm/aaaa");
				}
			}
			return "error";
		}

		//Comprueba que la fecha sea correcta
		private static boolean comprobacionFecha(String fecha) {
			int dia=Integer.parseInt(fecha.substring(0,2));
			int mes=Integer.parseInt(fecha.substring(3,5));
			int anyo=Integer.parseInt(fecha.substring(6));
			switch(mes) {
			//Si es de 31 dia lo comprueba
			case 1, 3, 5, 7, 8, 10, 12:
				if (dia<0 || dia>31) {
					return false;
				} else {
					return true;
				}
			//Si es febrero comprueba que sea bisiesto
			case 2:
				if((anyo%4==0) && ((anyo%100!=0) || (anyo%400==0))) {
					if (dia<0 || dia>29) {
						return false;
					} else {
						return true;
					}
				}else {
					if (dia<0 || dia>28) {
						return false;
					} else {
						return true;
					}
				}
				//Si es de 30 dias lo comprueba
			case 4, 6, 9, 11: 
				if (dia<0 || dia>30) {
					return false;
				} else {
					return true;
				}
			default:
				return false;
			}
		}
		//Comprueba que el DNI sea correcto
		public static String DNI(String texto, Scanner sc) {
			char letras[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			String dni="", letra="", comprobacion="^[0-9]{8}-?[TRWAGMYFPDXBNJZSQVHLCKE]$";
			int numero=0;
			do {
				do {
					System.out.println(texto);
					dni=sc.nextLine().toUpperCase();
				}while(!dni.matches(comprobacion));
				numero=Integer.parseInt(dni.substring(0,8));
				numero=numero%23;
				if(dni.charAt(8)=='-') {
					letra=dni.substring(9);
				}else {
					letra=dni.substring(8);
				}
			}while(letras[numero]!=letra.charAt(0));
			return dni;
		}
}
