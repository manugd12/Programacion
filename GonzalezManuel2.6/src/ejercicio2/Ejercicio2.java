/*Realizar un programa que solicite los datos a un usuario que quiere acceder a unos estudios debe ser 
 * mayor de 18 y su nota académica un 7.
 * Manuel González Díaz
 * 08/10/2026
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		String nombre;
		byte edad; 
		double notaAcademica; 
		System.out.println("Dime tu nombre,edad y nota academica ");  // Se le piden al usuario sus datos 
		nombre=teclado.nextLine();
		edad=teclado.nextByte();
		notaAcademica=teclado.nextDouble();
		
		if (edad >= 18) {
			if (notaAcademica > 7) {
				System.out.println(nombre + ", usted ha sido admitido en el curso, cumple" // se utiliza el sistema de control if para que solo se pueda accerder siendo mayor de edad y teniendo un 7 minimo 
					+ " las condiciones requeridas.");
			}	
		}
		else{
			System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso"
					+ " ya que no cumple los requisitos mínimos"); // si no lo cumple le saldría este mensaje
		} 
	
		teclado.close();
	}
}
