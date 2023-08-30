package L012;

import java.util.Scanner;

public class L012_Q02 {
	public static void main(String[] args) {
		double SalarioAtual;
		double SalarioMinimo;
		double ValorAumento;
		double novoSalario;
		double PerAumento;

		AumentoSalarial CalcularAumento = new AumentoSalarial();

		Scanner LerSal = new Scanner(System.in);

		System.out.print("Digite o salario Minimo atul:");
		SalarioMinimo = LerSal.nextDouble();

		System.out.print("Digite o salario do colaborador: ");
		SalarioAtual = LerSal.nextDouble();

		if (SalarioAtual <= 1 * SalarioMinimo) { 
			PerAumento = 0.4;
			
			
		} else if (SalarioAtual <= 2 * SalarioMinimo) { 
			PerAumento = 0.3;
			
			
		} else if (SalarioAtual <= 3 * SalarioMinimo) { 
			PerAumento = 0.2;
			
			
		} else if (SalarioAtual <= 4 * SalarioMinimo) { 
			PerAumento = 0.2;
			
			
		} else { 
			PerAumento = 0.05;
			
			
		}
		ValorAumento = SalarioAtual * PerAumento;
		novoSalario = SalarioAtual + ValorAumento;

		System.out.println("Salário antes do reajuste: R$" + SalarioAtual);
		System.out.println("Percentual de aumento aplicado: " + (PerAumento * 100) + "%");
		System.out.println("Valor do aumento: R$" + ValorAumento);
		System.out.println("Novo salário após o aumento: R$" + novoSalario);





		LerSal.close();
	}
}
