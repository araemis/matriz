package quinta_folha;

import java.util.Scanner;

public class Primeiro {
	public static void main(String[] args) {
		int n, num, soma = 0, maior = 0, menor = 0, par = 0, impar = 0, soma_pri = 0, soma_sec = 0;
		boolean verd = true;
		double media = 0;
		int qua[][];
		Scanner sc = new Scanner(System.in);
		System.out.print("De um  para criar uma matriz quadrada:");
		n = sc.nextInt();
		while ((n < 3 || n > 11) || n % 2 == 0) {
			System.out.println("ERRO!!! valor deve ser inteiro, ímpar e |3 e 11| ");
			System.out.print("para criar uma matriz quadrada:");
			n = sc.nextInt();
		}
		qua = new int[n][n];
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Digite um valor para a linha " + (i + 1) + "ª");
			for (int a = 0; a < n; a++) {
				System.out.print("coluna " + (a + 1) + "ª");
				num = sc.nextInt();
				qua[i][a] = num;
				if (verd == true) {
					maior = num;
					menor = num;
					verd = false;
				}
				soma += num;
				media += num;
				if (num % 2 == 0) {
					par++;
				} else {
					impar++;
				}
				if (i == a) {
					soma_pri += num;
				}
				if (maior < num) {
					maior = num;
				}
				if (menor > num) {
					menor = num;
				}

			}
			soma_sec += qua[i][n - 1 - i];
		}
		media /= (n * n);
		System.out.printf("%nSoma dos elementos:" + soma);
		System.out.printf("%nMédia dos elementos:%.2f", media);
		System.out.printf("%nMaior valor:" + maior);
		System.out.printf("%nmenor valor:" + menor);
		System.out.printf("%nContador de pares:" + par);
		System.out.printf("%nContador de ímpares:" + impar);
		System.out.printf("%nSoma da diagonal principal:" + soma_pri);
		System.out.printf("%nSoma da diagonal secundária:" + soma_sec + "%n");
		for (int i = 0; i < n; i++) {
			System.out.print("|");
			for (int a = 0; a < n; a++) {
				System.out.print(qua[i][a] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		sc.close();
	}
}
//Permitir gravar e ler estes dados de um arquivo.