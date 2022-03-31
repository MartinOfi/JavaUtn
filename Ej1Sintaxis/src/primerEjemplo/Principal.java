package primerEjemplo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Primer ejemplo");
		int n1;
		int n2 = 3;
		Integer n3;
		String texto;
		n1 = 2;
		String texto2="Bienvenido";
		
		Scanner lector = new Scanner(System.in);
		iterar(lector);
		//variablesElIfs(n1, n2, texto2, lector);
		lector.close();
		String despedida=JOptionPane.showInputDialog("Ingrese saludo final");
		JOptionPane.showMessageDialog(null, despedida);
			
	}

	private static void iterar(Scanner lector) {
		String[] palabras = new String[3];
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Ingrese la palabra " + (i+1));
			palabras[i]=lector.nextLine();
		}
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabras["+i+"]"+palabras[i]);
		}
		System.out.println("Iterar con foreach");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
				
	}
		
	private static void variablesElIfs(int n1, int n2, String texto2, Scanner lector) {
		Integer n3;
		String texto;
		System.out.print("Ingrese un texto ");
		texto = lector.nextLine();
		System.out.print("Ingrese un numero ");
		n3 = Integer.parseInt(lector.nextLine());
		System.out.println(texto + n3);
		if (n3 == n2 + n1) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
		if (texto.equalsIgnoreCase(texto2)) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
	}

}
