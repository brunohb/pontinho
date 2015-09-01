package Teclado;

import java.util.Scanner;

public class Metodos {
	Scanner tc = new Scanner (System.in);
	
	public int lerInt1(){
		System.out.println(" Diga um inteiro: ");
		return (tc.nextInt());
	}


	public void lerInt2(String a, int b){
		System.out.println(a);
		b = tc.nextInt();
}


	public void lerInt3 (int a, String msg){
		System.out.println(msg);
		a = tc.nextInt();
		
	}
	
	
	public int lerInt4 (String msg){
		int a;
		System.out.println(msg);
		a = tc.nextInt();
		
		return (a);
	}
	
	/* TERMINO DO INT, COMEÇO DO STRING */

	public String lerString1(){
		System.out.println(" Diga um inteiro: ");
		return (tc.next());
	}

	public void lerString2(String a, String b){
		System.out.println(a);
		b = tc.nextLine();}
	
	public void lerString3 (String a, String msg){
		System.out.println(msg);
		a = tc.nextLine();}
	
	public String lerString4 (String msg){
		System.out.println("Diga uma msg: ");
		msg = tc.nextLine();
		return (msg);
	}
	
	/* TERMINO DO STRING, COMEÇO DO CHAR */
	
	public char lerChar1(){
		System.out.println(" Diga um inteiro: ");
		return tc.next().charAt(0);
	}
	
	public void lerChar2(char a, char b){
		System.out.println(a);
		b = tc.next().charAt(0);}
	
	public void lerChar3(char a, String msg){
		System.out.println(msg);
		a = tc.next().charAt(0);}
	
	public char lerChar4 (char msg){
		System.out.println("Diga um caracter: ");
		msg = tc.next().charAt(0);
		return (msg);}
	
	/* TERMINO DO CHAR, INICIO DO FLOAT */
	
	public float lerFloat1(){
		System.out.println(" Diga um numero: ");
		return (tc.nextFloat());}
	

	public void lerFloat2(float a, float b){
		System.out.println(a);
		b = tc.nextFloat();}
	
	public void lerFloat3(float a, float msg){
		System.out.println(msg);
		a = tc.nextFloat();}
	
	public float lerFloat4 (float a){
		System.out.println("Diga um numero: ");
		a = tc.nextFloat();
		return (a);}
	
	/* TERMINO DO FLOAT, INICIO DO DOUBLE*/
	
	public double lerDouble1(){
		System.out.println(" Diga um numero: ");
		return (tc.nextDouble());}
	
	public void lerDouble2(double a, double b){
		System.out.println(a);
		b = tc.nextDouble();}
	
	public void lerDouble3(double a, double b){
		System.out.println(b);
		a = tc.nextDouble();}
	
	public double lerDouble4 (double a){
		System.out.println("Diga um numero: ");
		a = tc.nextDouble();
		return (a);}
	
	/* FINISH */
}
