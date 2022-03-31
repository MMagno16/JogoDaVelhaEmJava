package interacao;

import java.util.Scanner;

public class Console {
	
	private static Scanner in;
	private static Scanner in2;

	public static String entraNome(){
		in = new Scanner(System.in);
		String nome = in.nextLine();
		return nome;
	}
	
	public static int lerJogada(){
		in2 = new Scanner(System.in);
		try {
			return in2.nextInt();
		} catch (Exception e) {
			System.out.println("caracter invalido");
		}
		return -1;
	}	
}
