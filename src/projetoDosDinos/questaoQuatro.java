package projetoDosDinos;

import java.util.Scanner;

public class questaoQuatro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero romano(I,II,III) para saber o estar no caminho: ");
		String numeroromano =  scanner.next();
		
		switch(numeroromano) {
		case "I":
			System.out.println("Vai encontrar ovos de dinossauro");
			break;
		case "II":
			System.out.println("Vai encontrar f�sseis de dinossauro");
			break;
		case "III":
			System.out.println("Vai encontrar um ninho de pterod�ctilos");
			break;
		case "i":
			System.out.println("Vai encontrar ovos de dinossauro");
			break;
		case "ii":
			System.out.println("Vai encontrar f�sseis de dinossauro");
			break;
		case "iii":
			System.out.println("Vai encontrar um ninho de pterod�ctilos");
			break;
		default:
			System.out.println("Op��o incorreta, tente novamente com uma letra v�lida. ");
			
		}
	}

}
