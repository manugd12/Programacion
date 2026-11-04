/*Manuel González Díaz
 * 30-09-2026
 * Ejercicio 4
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		double num1,num2,num3,num4;
		System.out.println("Dame un valor: "); // Pedimos que nos de 1 valor
		Scanner teclado = new Scanner(System.in);
	num1=teclado.nextDouble();
	System.out.println("El valor es: " + num1);
	

	num2=Math.ceil(num1);
	num3=Math.floor(num1);
	num4=Math.round(num1);
	System.out.println("Los valores son :" + num2 + " , " + num3 + " y " + num4 ); // nos entregan dichos valores
	
	teclado.close();
	
	}

}
