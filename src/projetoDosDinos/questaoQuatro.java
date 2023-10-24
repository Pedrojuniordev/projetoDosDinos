package projetoDosDinos;

import java.util.Scanner;

public class questaoQuatro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número romano(I,II,III) para saber o estar no caminho: ");
		String numeroromano =  scanner.next();
		
		switch(numeroromano) {
		case "I":
			System.out.println("Vai encontrar ovos de dinossauro");
			break;
		case "II":
			System.out.println("Vai encontrar fósseis de dinossauro");
			break;
		case "III":
			System.out.println("Vai encontrar um ninho de pterodáctilos");
			break;
		case "i":
			System.out.println("Vai encontrar ovos de dinossauro");
			break;
		case "ii":
			System.out.println("Vai encontrar fósseis de dinossauro");
			break;
		case "iii":
			System.out.println("Vai encontrar um ninho de pterodáctilos");
			break;
		default:
			System.out.println("Opção incorreta, tente novamente com uma letra válida. ");
			
		}
	}

}
