package Teclado;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class funcionario {
	
	public String nome;
	public String setor;
	public int idade;
	public double salario;
	public int cont;
	
	public void Cadastro(){
		Scanner tc = new Scanner(System.in);
		System.out.println("nome: ");
		nome= tc.nextLine();
		System.out.println("idade: ");
		idade= tc.nextInt();
		System.out.println("setor: ");
		setor=tc.next();
		System.out.println("salario: ");
		salario=tc.nextDouble();
		cont++;
		System.out.println(cont);
	}
	
	public void mostrar(){
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.salario);
		System.out.println(this.setor);
		
	}
}
