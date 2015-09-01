package Teclado;

import java.util.Scanner;

public class teste {
	public static void main(String[] args){
		
		Scanner tc = new Scanner (System.in);
		
		funcionario f = new funcionario();
		for (int i=0; i<2; i++){
			f.Cadastro();
			f.mostrar();
		}
		
		
	}
}
