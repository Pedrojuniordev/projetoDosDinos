package projetoDosDinos;

import java.util.Scanner;

public class questaoUm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escolha um n�mero entre (1, 2 ou 3), referente ao caminho:  ");
		int numero = scanner.nextInt();
		
		String caminhoDinos;
		
		switch (numero)	{
		case 1:
			caminhoDinos = "Floresta";
			break;
		case 2:
			caminhoDinos = "Montanha";
			break;
		case 3:
			caminhoDinos = "Caverna";
			break;
		default:
			caminhoDinos = "N�mero invalido, tente novamente com n�meros v�lidos";
			break;
		}
	System.out.println("E caminho leva � " + caminhoDinos + " dos dinossauros");
		
	}
}
