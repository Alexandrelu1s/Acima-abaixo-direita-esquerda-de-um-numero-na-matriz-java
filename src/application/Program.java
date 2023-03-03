package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o numero de linhas: ");
		int l = sc.nextInt();

		System.out.print("Informe o numero de colunas: ");
		int c = sc.nextInt();

		int[][] matriz = new int[l][c];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("Digite um numero inteiro: ");
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Informe um numero que quer encontrar na matriz: ");
		int x = sc.nextInt();

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if (x == matriz[i][j]) {
					System.out.println("Numero " + matriz[i][j] + "; Posição: " + i + ", " + j);
					if(j > 0) { 
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if(j < matriz.length - 1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Acima: " + matriz[i-1][j]);
					}
					if(i < matriz.length - 1) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
				}
			}
			
			/*vetores, matrizes e listas começa no 0. Se voce informar valor 3 para o tamanho do vetor ele ficara assim: 
			 
			 pos1 = 0, pos2 = 1, pos3 = 2;
			 
			 */
			

			sc.close();
		}

	}
}
