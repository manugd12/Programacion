/*Realizar un programa que solicite 2 valores , comprobar si es uno mayor, menor o igual y mostrar
 * en la pantalla un mensaje informandolo.
 * Manuel González Díaz 
 * 08/10/2026
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		byte num1,num2;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dime 2 valores: "); // Se le pide al usuario los 2 valores
		num1=teclado.nextByte();
		num2=teclado.nextByte();
	if (num1 > num2) {
		System.out.println("Es mayor ");  // Se indica si es mayor el valor 1 al 2 
	}
		else {
		if (num1 ==num2) {
		System.out.println("Es igual"); // se indica si son iguales los valores
		}else {
			System.out.println("Es menor"); // se indica si es menor el valor 1 al 2
			
		}
		teclado.close();
	}
	
	}

}
