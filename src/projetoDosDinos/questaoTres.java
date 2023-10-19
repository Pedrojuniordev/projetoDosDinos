package projetoDosDinos;

import java.util.Scanner;;

public class questaoTres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha uma letra entre X, Y, Z ");
		 String escolha = scanner.next();
		 
		 switch (escolha) {
		 case "X":
			 System.out.println("Nesse caminho encontrará um T-Rex");
			 break;
		 case "Y":
			 System.out.println("Nesse caminho encontrará um Pterodáctilo");
			 break;
		 case "Z":
			 System.out.println("Nesse caminho encontrará um Estegossauro");
			 break;
		 case "x":
			 System.out.println("Nesse caminho encontrará um T-Rex");
			 break;
		 case "y":
			 System.out.println("Nesse caminho encontrará um Pterodáctilo");
			 break;
		 case "z":
			 System.out.println("Nesse caminho encontrará um Estegossauro");
			 break;
		default:
			System.out.println("Opção incorreta, tente novamente com uma letra válida. ");
			break;
		 }
	}

}
