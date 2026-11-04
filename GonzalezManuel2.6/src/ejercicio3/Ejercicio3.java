/*Realizar un programa en el que se le pida la edad para poder ser admitido o no al usuario. 
 * Manuel González Díaz 
 * 08/10/2026
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		byte edad;
		String nombre, apellidos;
		System.out.println("Dime tu edad "); // Le pedimos al usuario su edad
		edad = teclado.nextByte();
		
		if (edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios"); // Si no cumple el minimo le saldría este mensaje
		} 
			else {
				System.out.println("Dime tu nombre" );
				teclado.nextLine();
				nombre = teclado.nextLine();
				System.out.println("Dime tu apellido" );  // Si cumple se le pedirían mas datos al usuario
				apellidos = teclado.nextLine();
				
				System.out.println("Nombre: " + nombre + " apellidos: " + apellidos + " edad:"
						+ edad + " Usted ha sido admitido"); // Se recopilan los datos del usuario
			}
		teclado.close();
	}

}
