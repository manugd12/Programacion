/*Manuel Gonzalez Diaz
*30-09-2026
*Ejercicio 1 Hacemos práctica de cálculos simples
*/
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
		byte aniosTrabajo;
		double aumento,salarioBruto,salarioNeto,salarioTotal; // Declaro variables
		
		String nombre;
			System.out.println("Nombre"); // Asigno nombre
			nombre = teclado.nextLine();
			
			String apellido;
			System.out.println("Apellido: "); // Asigno apellido
			apellido = teclado.nextLine();
			
			String fechaNacimiento;
			System.out.println("Fecha de nacimiento: "); // Asigno fecha de nacimiento 
			fechaNacimiento = teclado.nextLine();
		
			System.out.println("Salario bruto: "); // Asigno salario bruto
			salarioBruto = teclado.nextInt();
			
	
			System.out.println("Años trabajando en la empresa: "); // Asigno años trajados en la empresa
			aniosTrabajo = teclado.nextByte();
			
			
			salarioNeto = salarioBruto * 0.85; // Calculamos el porcentaje de IRPF
			
			
				aumento = aniosTrabajo * 0.02; // Porcentaje de aumento segun años trabajado
				
				salarioTotal = salarioNeto * aumento + salarioNeto; //Operacion para sacar el sueldo total 
				
				
			System.out.println("Estmiad@ " + nombre + " " + apellido + ",su salario bruto es " + salarioBruto
					+ ",teniendo en cuenta un IRPF del 15% su salario neto es " + salarioNeto
					+ " Debido a sus " + aniosTrabajo + " años trabajando en la empresa su salario se"  
							+ " incrementa en un 2% por cada año.El aumento es de " + aumento + " y el salario total es "
							+ salarioTotal + ".");
			// Texto a declarar junto con las operaciones correspondientes  
			
			
		
			teclado.close();
		
		
		
		
	}

}
