package projetoDosDinos;

import java.util.Scanner;

public class questaoDoisDois {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha entre A, B, ou C, para qual especie de dinossauro encontrar: ");
		String especie = scanner.next();
		
		switch (especie) {
		case "A":
			System.out.println("Você encontra um velociraptor.");
			break;
		case "B":
			System.out.println("Você encontra um Triceraptos");
			break;
		case "C":
			System.out.println("Você encontra um Diplodocus.");
			break;
		case "a":
			System.out.println("Você encontra um velociraptor.");
			break;
		case "b":
			System.out.println("Você encontra um Triceraptos");
			break;
		case "c":
			System.out.println("Você encontra um Diplodocus.");
			break;
		default:
			System.out.println("Escolha inválida, Tente com novamente com digito válido");
		}
	}
}
