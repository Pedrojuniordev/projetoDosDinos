package projetoDosDinos;

import java.util.Scanner;;

public class questaoTres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha uma letra entre X, Y, Z para ver o que encontrar� no caminho: ");
		 String escolha = scanner.next();
		 
		 switch (escolha) {
		 case "X":
			 System.out.println("Nesse caminho encontrar� um T-Rex");
			 break;
		 case "Y":
			 System.out.println("Nesse caminho encontrar� um Pterod�ctilo");
			 break;
		 case "Z":
			 System.out.println("Nesse caminho encontrar� um Estegossauro");
			 break;
		 case "x":
			 System.out.println("Nesse caminho encontrar� um T-Rex");
			 break;
		 case "y":
			 System.out.println("Nesse caminho encontrar� um Pterod�ctilo");
			 break;
		 case "z":
			 System.out.println("Nesse caminho encontrar� um Estegossauro");
			 break;
		default:
			System.out.println("Op��o incorreta, tente novamente com uma letra v�lida. ");
			break;
		 }
	}

}
