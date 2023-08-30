package L012;

public class VerificarIdade {
	int idade;
	int totalCrianças;
	int totalAdolescentes;
	int totalAdultos;


	public void VerificarIdade(int idade) {
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
	}

	public void imprimirTotais() {
		System.out.println("\nTotal de Crianças: " + totalCrianças);
		System.out.println("Total de Adolescentes: " + totalAdolescentes);
		System.out.println("Total de Adultos: " + totalAdultos);
	}
}
