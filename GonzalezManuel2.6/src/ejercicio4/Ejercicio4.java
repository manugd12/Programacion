/* Solicitar al usuario una serie de valores, algunos de estos se sumarán y se hará una media y
 * se comprobará si cumple un objetivo o no y se mostrará en una ficha.
 * Manuel González Díaz
 * 08/10/2026 
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellido;
		int importeGastado1,importeGastado2,importeGastado3,importeGastado4,suma;
		double media;
		System.out.println("Nombre: "); // Se le piden los valores al usuario
		
		nombre=teclado.nextLine();
		System.out.println("Apellido: ");
		apellido=teclado.nextLine();
		
		System.out.println("Importe gastado1: ");
		importeGastado1=teclado.nextInt();
		System.out.println("Importe gastado2: ");
		importeGastado2=teclado.nextInt();
		System.out.println("Importe gastado3: ");
		importeGastado3=teclado.nextInt();
		System.out.println("Importe gastado4: ");
		importeGastado4=teclado.nextInt();

			suma=importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4; // Se hace la suma de los valores correspondientes
			System.out.println("Suman: " +suma);
			media=(importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4) / 4.0 ; // Se hcae una media con los mismos valores que se suman 
			System.out.println("Media: " +media);
		
			System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nImporte Gastado1: " + importeGastado1 
				+ "\nImporte Gastado2: " + importeGastado2 + "\nImporte Gastado3: " + importeGastado3 + 
				"\nImporte Gastado4 " + importeGastado4 + "\nImporte medio " + media ); // Se le muestra en pantalla al susuario este mensaje 
		
				if (suma >= 300) {
					System.out.println("Obtiene el vale de descuento de 50€"); // Si el usuario no cumple el objetivo le saldría este mensaje 
				}else { 
					System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de\r\n"
					+ "descuento."); // Si el usuario cumple el objetivo se le mostraría este mensaje 
			 
					}
		
		teclado.close();
	}

}
