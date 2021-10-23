package quinta_folha;

import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		int count = 10;
		final int TAM = 5;
		double media[] = new double[TAM];
		double menor = 0;
		int contador = 0;
		double ma_media = 0;
		double me_media = 0;
		double saltos[][] = new double[count][TAM];
		Scanner sc = new Scanner(System.in);
		System.out.println(count + " atletas irão participar da competição");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "º atleta de os " + TAM + " saltos  agora!");
			for (int j = 0; j < TAM; j++) {
				System.out.print("Digito o valor do " + (j + 1) + "º salto ");
				saltos[i][j] = sc.nextInt();
				while (saltos[i][j] < 1) {
					System.out.println("ERRO!!!");
					System.out.print("Digito o valor do " + (j + 1) + "º salto ");
					saltos[i][j] = sc.nextInt();
				}
				media[i] += saltos[i][j];
				if (j == 0) {
					menor = saltos[i][j];
					contador = j;
				} else if (menor > saltos[i][j]) {
					menor = saltos[i][j];
					contador = j;
				}

			}
			saltos[i][contador] -= menor;
			media[i] -= menor;
			media[i] /= (TAM-1);
			if (i == 0) {
				ma_media = media[i];
				me_media = media[i];
			} else if (ma_media < media[i])
				ma_media = media[i];
			else if (me_media > media[i])
				me_media = media[i];
			System.out.printf("Médias dos seus saltos: %.2f", media[i]);
			System.out.println();
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "º atleta ");
			for (int j = 0; j < TAM; j++) {
				if (saltos[i][j] > 0) {
					System.out.println("Valor dos " + (j + 1) + "º salto " + saltos[i][j]);
				}
			}
			System.out.println("Média dos seus saltos " + media[i]);
			System.out.println();
		}
		System.out.println("Média dos saltos do campeão " + ma_media);
		System.out.println("Média dos saltos do perdedor " + me_media);
		sc.close();
	}

}
//Permitir gravar e ler estes dados de um arquivo.