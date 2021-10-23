package quinta_folha;

import java.util.Scanner;

public class Segundo {
	public static void main(String[] args) {
		final int TAM = 5;
		int preco[][] = new int[TAM][TAM];
		int soma[] = new int[TAM];
		int barato = 0, caro = 0;
		double media[] = new double[TAM];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < TAM; i++) {
			System.out.println();
			System.out.println((i + 1)+"º supermercado:");
			for (int a = 0; a < TAM; a++) {
				System.out.print((a + 1) + "º produto:");
				preco[i][a] = sc.nextInt();
				soma[i] += preco[i][a];
				media[a] += preco[i][a];
				System.err.println(media[a]);
			}
			if (i == 0) {
				barato = soma[i];
				caro = soma[i];
			} else {
				if (barato > soma[i]) {
					barato = soma[i];
				}
				if (caro < soma[i]) {
					caro = soma[i];
				}
			}
		}
		for (int i = 0; i < TAM; i++) {
			media[i] /= TAM;
			System.err.println(media[i]);
			System.out.printf("%nPrecos do " , (i + 1) , "º supermercado:");
			for (int a = 0; a < TAM; a++) {
				System.out.print(preco[i][a] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < TAM; i++) {
			System.out.printf("%nA média de preço por produto:%.2f", media[i]);
		}
		System.out.println();
		for (int i = 0; i < TAM; i++) {
			System.out.println("A soma de precos por supermercado:" + soma[i]);
		}System.out.println();
		System.out.println("O valor total no supermercado mais barato:" + barato);
		System.out.println("O valor total no supermercado mais caro:" + caro);
		System.out.println("O valor total no supermercado mais caro:" + caro);
		sc.close();
	}
}
//Permitir gravar e ler estes dados de um arquivo.