package projetoDosDinos;

import java.util.Scanner;

public class questaoSeis {

	public static void main(String[] args) {
		String[] listaDinossauros = {
			"Velociraptor",
			"Triceratops",
			"Diplodocus",
			"T-Rex",
			"Pterodpactilo",
			"Estegossauro"
		};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Você decide continua explorando o parque. ");
		
		int contadorDinossauros = 0;
		
		for(String dinossauro : listaDinossauros) {
			System.out.println("Você viu um(a) " + dinossauro + "? (S para sim, N para não): ");
			String resposta = scanner.next();
			
			if (resposta.equalsIgnoreCase("S")) {
				contadorDinossauros++;
				
			}
		}
		
		System.out.println("Você viu " + contadorDinossauros + "dinossauros. ");
	}

}
