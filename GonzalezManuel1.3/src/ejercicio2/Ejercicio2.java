/*Manuel Gonzalez Diaz 
 * 30-09-2026
 * Ejercicio 2 
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int euro;
	double pesetas,conversion;
	
	conversion = 166.386d;
	
	
	System.out.println("Euros: ");
	euro = teclado.nextInt(); // Declaramos euros
	
	
	
	System.out.println("La conversion de euro a peseta es: " + euro * conversion ); // conversion de euros a pesetas
	
	
	System.out.println("Pesetas: "); // Declaramos pesetas
	pesetas = teclado.nextDouble();
	
   System.out.println("La conversion de pesetas a euros es: " + pesetas / conversion); // Conversion de pesetas a euros
	teclado.close();
	
	
	}

}
