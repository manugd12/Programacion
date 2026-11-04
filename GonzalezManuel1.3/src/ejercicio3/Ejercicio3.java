/*Manuel González Díaz
 * 30-09-2026
 * Ejercicio 3
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		byte num1,num2,numCambio1;
		
		System.out.println("Dame 2 numeros: " ); // Pedimos que nos den 2 numeros
		
	Scanner teclado = new Scanner(System.in);
	num1=teclado.nextByte();
	num2=teclado.nextByte();
	
	
	
	numCambio1 = num2;
	num2 = num1;
	num1 = numCambio1;
	System.out.println("El cambio es: " + num1 + " y " + num2); // y observamos el cambio
	teclado.close();
	
	
	}

}
