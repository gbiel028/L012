package L012;

import java.util.Scanner;

public class L012_Q03 {
public static void main(String[] args) {
		Scanner LerIdade = new Scanner(System.in);
		int idade;
		int totalCrianças = 0;
		int totalAdolescentes = 0;
		int totalAdultos = 0;

		System.out.print("Digite a idade da pessoa (ou -1 para sair): ");
		idade = LerIdade.nextInt();

		while (idade != -1) {
			if (idade <= 12) {
				System.out.println("Criança");
				totalCrianças++;
			} else if (idade <= 18) {
				System.out.println("Adolescente");
				totalAdolescentes++;
			} else {
				System.out.println("Adulto");
				totalAdultos++;
			}

			System.out.print("Digite a idade da pessoa (ou -1 para sair): ");
			idade = LerIdade.nextInt();
		}

		System.out.println("\nTotal de Crianças: " + totalCrianças);
		System.out.println("Total de Adolescentes: " + totalAdolescentes);
		System.out.println("Total de Adultos: " + totalAdultos);
	}
}
