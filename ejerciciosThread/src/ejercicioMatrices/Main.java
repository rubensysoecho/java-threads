package ejercicioMatrices;

import java.util.Scanner;

public class Main {

	static final Scanner entrada = new Scanner(System.in);

	public static int[][] establecer_matriz1()	{
		System.out.println("CREACION DE MATRIZ 1");
		System.out.print("Número de filas: ");
		int num_filas1 = entrada.nextInt();
		System.out.print("Número de columnas: ");
		int num_col1 = entrada.nextInt();

		int[][] matriz1 = new int[num_filas1][num_col1];

		for (int row = 0; row < matriz1.length; row++) {
			for (int col = 0; col < matriz1[row].length; col++) {
				System.out.print("Posición {" + row + "," + col + "} --> ");
				int num = entrada.nextInt();
				matriz1[row][col] = num;
			}
		}
		return matriz1;
	}
	public static int[][] establecer_matriz2()	{
		System.out.println("\nCREACION DE MATRIZ 2");
		System.out.print("Número de filas: ");
		int num_filas2 = entrada.nextInt();
		System.out.print("Número de columnas: ");
		int num_col2 = entrada.nextInt();

		int[][] matriz2 = new int[num_filas2][num_col2];

		for (int row = 0; row < matriz2.length; row++) {
			for (int col = 0; col < matriz2[row].length; col++) {
				System.out.print("Posición {" + row + "," + col + "} --> ");
				int num = entrada.nextInt();
				matriz2[row][col] = num;
			}
		}
		return matriz2;
	}

	public static void main(String[] args) {
		//int[][] matriz1 = establecer_matriz1();
		//int[][] matriz2 = establecer_matriz2();

		System.out.println("CREACION DE MATRIZ 1");
		System.out.print("Número de filas: ");
		int num_filas1 = entrada.nextInt();
		System.out.print("Número de columnas: ");
		int num_col1 = entrada.nextInt();

		int[][] matriz1 = new int[num_filas1][num_col1];

		for (int row = 0; row < matriz1.length; row++) {
			for (int col = 0; col < matriz1[row].length; col++) {
				System.out.print("Posición {" + row + "," + col + "} --> ");
				int num = entrada.nextInt();
				matriz1[row][col] = num;
			}
		}

		System.out.println("\nCREACION DE MATRIZ 2");
		System.out.print("Número de filas: ");
		int num_filas2 = entrada.nextInt();
		System.out.print("Número de columnas: ");
		int num_col2 = entrada.nextInt();

		int[][] matriz2 = new int[num_filas2][num_col2];

		for (int row = 0; row < matriz2.length; row++) {
			for (int col = 0; col < matriz2[row].length; col++) {
				System.out.print("Posición {" + row + "," + col + "} --> ");
				int num = entrada.nextInt();
				matriz2[row][col] = num;
			}
		}

		int[][] matrizResultado = new int[num_filas1][num_col2];
		if (num_col1 == num_filas2)	{

			for (int i = 0; i < matrizResultado.length; i++) {
				for (int j = 0; j < matrizResultado[i].length; j++) {
					matrizResultado[i][j] = 0;
					for (int k = 0; k < matrizResultado[i].length; k++) {
						matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
					}
					
				}
			}

			for (int i = 0; i < matrizResultado.length; i++) {
				for (int j = 0; j < matrizResultado.length; j++) {
					System.out.print(matrizResultado[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		else	{
			System.out.println("No es posible hacer el producto de estas matrices. El número de filas de X debe ser igual al número de columnas de Y.");
		}
	}
}
