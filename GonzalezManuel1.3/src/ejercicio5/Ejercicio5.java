/*Manuel González Díaz 
 * 30-09-2026
 * Ejercicio 5 
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		byte num1,num2;
		System.out.println("Dime 2 valores: "); // Pedimos 2 valores
		Scanner teclado = new Scanner(System.in);
		num1=teclado.nextByte();
		num2=teclado.nextByte();
		System.out.println("Los valores son: ");
		if (num1 > num2) {
			System.out.println("Es menor " + num2 ); // Formula para que diga si es menos 
		} else { 
		System.out.println("Es menor" + num1);
		}
			Math.pow(num1,num2);
			System.out.println("El resultado es: " + Math.pow(num1,num2)); // Formula para calcular el num1 elevado a num2
			
		double resultadoRaiz = Math.sqrt(num1);
		System.out.println("La raiz cuadrada es: " + resultadoRaiz); // Formula para calcular la raiz cuadrada 
		
		double random2 = Math.random();
		System.out.println("El valor random es: " + random2 * num2); // Formula para que nos entregue un valor random
		
		teclado.close();
		
			
		}
		}


