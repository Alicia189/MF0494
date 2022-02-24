package uf2178;

import java.util.Scanner;

public class Funciones {
	
	
	/** 
	 * Método de la clase que pide un vector por teclado
	 * @param v int[] el vector a introducir por teclado
	 */
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	/**
	 * Método para mostrar por pantalla el vector pasado como parámetro
	 * @param v int [] el vector a mostrar en pantalla
	 */
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	// Escribe las sentencias de los apartados 1 y 2
	public static void Calcularsancion(double tasa);
		double tasa
		
		if (tasa < 0.25  ) {
			sancion = null;
		} else if  (tasa < 0.50 &&  tasa >= 0.25) {
			sancion = "500 € y pérdida de 4 puntos";
		} else if ( tasa < 0.6 && tasa >= 0.50) {
			sancion = "1000 €  y pérdida de 6 puntos";
		} else if ( tasa >= 0.60) {
			sancion = "Retirada del carnet y de 3 a 6 meses de cárcel";
		}

	
	System.out.printf( "El coductor con tasa de alcoholemia %.2f tiene la sancion %s"tasa,sancion);
	
	public static void restaPuntos(int v[]) {

		Scanner entrada = new Scanner(System.in);
		for (int i= 0; i< v.length; i++) 
			v[i] = {10,12,15,8,4,9};
			v[j] = {2,3,4,2,6,3};
					
	
	
	
}

}

