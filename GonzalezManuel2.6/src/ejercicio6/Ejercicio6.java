/*Realizar un programa en el que se le pida al usuario una serie de valores y una vez que te los dé 
 * mostrar dichos valores segun el caso que indique el usuario.
 * Manuel González Díaz
 * 08/10/2026 
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre,apellidos,cicloFormativo,resultado;
		byte nota;
		
		System.out.println("Cual es tu nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Cuales son tus apellidos: ");
		apellidos=teclado.nextLine();						// Se le pide al usuario sus datos
		System.out.println("Cual es tu ciclo formativo: ");
		cicloFormativo=teclado.nextLine();		
		System.out.println("Cual es tu nota academica" );
		nota=teclado.nextByte();
		
	
		if (nota < 0 || nota > 10)  {
			System.out.print("La nota académica inidica es incorrecta"); // Si el usuario pone un valor que en ningún caso puede salir le saldría este mensaje
		}else { 
			switch(nota) {
				case 0,1,2,3,4:
					resultado= (" Insuficiente");
				break;
				case 5:
					resultado=(" Aprobado");
				break;
				case 6:
					resultado=(" Bien");					// Segun el caso que sea al usuario le aparecería en pantalla el suyo.
				break;
				case 7,8:
					resultado=(" Notable");
				break;
				case 9:
					resultado=(" Sobresaliente");
				break;
				case 10: 
					resultado=(" Matricula de Honor");
				break;
				default: resultado = " ";  
			}
		System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCiclo formativo: "
								+ cicloFormativo + "\nNota academica: " +  nota + resultado);	// Se le indica en pantalla 

		}
		teclado.close();

	}
}
