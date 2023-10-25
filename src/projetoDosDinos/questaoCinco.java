package projetoDosDinos;

import java.util.Scanner;

public class questaoCinco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Após sua jornada no parque, digite S continuar, e V para voltar: ");
		String escolha = scanner.next();
		
		if (escolha.equalsIgnoreCase("S")) {
			System.out.println("Você escolheu continuar explorando o parque. ");
		} else if (escolha.equalsIgnoreCase("V")) {
			System.out.println("Você escolheu voltar a entrada do parque. ");
		}else {
			System.out.println("escolha inválida. Tente com uma opção valida");
		}
	}
}
