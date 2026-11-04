/* Realizar un programa en el que se le pida al usuario una serie de valores y una vez que te los dé 
 * mostrar dichos valores segun el caso que indique el usuario
 * Manuel González Díaz 
 * 08/10/2026
 */
package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nombre,apellidos,cicloFormativo;
		byte nota;
		
		System.out.println("Cual es tu nombre: ");
		nombre=teclado.nextLine();
		System.out.println("Cuales son tus apellidos: ");
		apellidos=teclado.nextLine(); 						// Se le pide al usuario sus datos
		System.out.println("Cual es tu ciclo formativo: ");
		cicloFormativo=teclado.nextLine();
		System.out.println("Cual es tu nota academica" );
		nota=teclado.nextByte();
		
		System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nCiclo formativo: "
				+ cicloFormativo + "\nNota academica: " +  nota ); // Se le indica en pantalla 
		
		switch(nota) {
		case 0,1,2,3,4:
			System.out.print(" Insuficiente");
			break;
		case 5:
			System.out.print(" Apobado");
			break;
		case 6:
			System.out.print(" Bien"); 		// Segun el caso que sea al usuario le aparecería en pantalla el suyo.
			break;
		case 7,8:
			System.out.print(" Notable");
		break;
		case 9,10:
			System.out.print(" Sobresaliente");
		}
		
			teclado.close();
	
	}

}
