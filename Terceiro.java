package quinta_folha;

import java.util.Scanner;

public class Terceiro {
	public static void main(String[] args) {
		final int TAM = 10;
		String nome[] = new String[TAM];
		int nota[][] = new int[TAM][TAM];
		double media_a[] = new double[TAM];
		double media = 0;
		String mma_nome = "";
		double ma_media = 0;
		String mme_nome = "";
		double me_media = 0;
		String ma_nome = "";
		int ma_nota = 0;
		String me_nome = "";
		int me_nota = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de alunos igual " + TAM);
		for (int i = 0; i < TAM; i++) {
			System.out.println();
			if (i != 0)
				nome[i] = sc.nextLine();
			System.out.printf("Digite seu nome " + (i + 1) + "º aluno ");
			nome[i] = sc.nextLine();
			for (int j = 0; j < 2; j++) {
				System.out.print("Digite a nota da " + (j + 1) + "ª prova ");
				nota[i][j] = sc.nextInt();
				media_a[i] += nota[i][j];
			}
			media_a[i] /= 2;
			media += media_a[i];
			if (i == 0) {
				ma_nome = nome[i];
				ma_nota = nota[i][1] + nota[i][2];

				me_nome = nome[i];
				me_nota = nota[i][1] + nota[i][2];

				mma_nome = nome[i];
				ma_media = media_a[i];

				mme_nome = nome[i];
				me_media = media_a[i];
			}
			if (ma_nota < nota[i][1] + nota[i][2]) {
				ma_nome = nome[i];
				ma_nota = nota[i][1] + nota[i][2];
			}
			if (me_nota > nota[i][1] + nota[i][2]) {
				me_nome = nome[i];
				me_nota = nota[i][1] + nota[i][2];
			}
			if (ma_media < media_a[i]) {
				mma_nome = nome[i];
				ma_media = media_a[i];
			}
			if (me_media > media_a[i]) {
				mme_nome = nome[i];
				me_media = media_a[i];
			}
		}
		media /= TAM;
		for (int i = 0; i < TAM; i++) {
			System.out.print("O aluno " + nome[i]);
			System.out.print(" tem notas " + nota[i][0] + ", ");
			System.out.print(nota[i][1] + " e ");
			System.out.println("conseguiu média de " + media_a[i]);
		}
		System.out.println();
		System.out.println();
		System.out.printf("O aluno %s", ma_nome);
		System.out.printf(" obteve a maior nota com %d", ma_nota);
		System.out.printf("%n O aluno %s", me_nome);
		System.out.printf(" obteve a menor nota com %d", me_nota);
		System.out.printf("%n O aluno %s", mma_nome);
		System.out.printf(" obteve a maior média com %.2f ", ma_media);
		System.out.printf("%n O aluno %s", mme_nome);
		System.out.printf(" obteve a menor média com %.2f ", me_media);
		System.out.printf("%n média geral da turma: %.2f", media);
		System.out.println();
		System.out.println();
		for (int i = 0; i < TAM; i++) {
			if (media_a[i] > media) {
				System.out.printf("Nome dos alunos acima da média %s", nome[i]);
				System.out.println();
			}
		}
		System.out.println();
		for (int i = 0; i < TAM; i++) {
			if (media_a[i] < media) {
				System.out.printf("Nome dos alunos abaixo da média %s", nome[i]);
				System.out.println();
			}
		}

		sc.close();
	}
}
//Permitir gravar e ler estes dados de um arquivo.