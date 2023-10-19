package projetoDosDinos;

import java.util.Scanner;

public class questaoDois {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escolha entre A, B, ou C, para qual especie de dinossauro encontrar: ");
		String especie = scanner.next();
		
		if (especie.equals("A")) {
			System.out.println("Você encontra um Velociraptor.");
		} else if (especie.equals("B")) {
			System.out.println("Você encontra um Triceratops");
		} else if (especie.equals("C")) {
            System.out.println("Você encontra um Diplodocus.");
        } else {
            System.out.println("Escolha inválida. Você está perdido na floresta dos dinossauros.");
        }
	}

}
