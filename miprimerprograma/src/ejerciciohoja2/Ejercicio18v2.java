package ejerciciohoja2;

import java.util.Scanner;

public class Ejercicio18v2 {

	public static void main(String[] args) {
		String frase;
		String letra;
		int cont;
		cont=0;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce la frase");
		frase=teclado.nextLine();
		System.out.println("introduce la letra");
		letra=teclado.next();
		
		//bucle para contar una letra de un string metodo no forzado (mas lento que forzado)
		
		 while (frase.indexOf(letra) > -1) {
		      frase = frase.substring(frase.indexOf(letra)+letra.length(),frase.length());
		      cont++; 
		    }
		
			System.out.println("la letra "+letra+" aparece " +cont+" veces");
			
	}

}
