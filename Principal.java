package com.vindixit;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Principal {

	public static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		String a, b, n;
		int c, d = 0;

		System.out.println("Comparando tamanho das palavras");
		
		System.out.println("Informe seu nome");
		n = sc.nextLine();
		
		
		System.out.println("Informe uma palavra:");

		a = sc.nextLine();
		System.out.println("Informe outra palavra:");
		b = sc.nextLine();

		int comparativo = a.length() < b.length() ? 1 : a.length() == b.length() ? 2 : 0;
		switch (comparativo) {
		case 1:
			System.out.println("a primeira palavra possui:  " + a.length() + "  caracteres");
			break;
		case 2:
			System.out.println("as duas palavras tem a mesma quantidade de caracteres.");
			break;
		default:
			System.out.println("a segunda palavra possui:  " + b.length() + "  caracteres");
			break;
		}
		

		/*
		 * 
		 * if(a.length() < (b.length())){
		 * System.out.println("a primeira palavra possui:  " + a.length() +
		 * "  caracteres");
		 * 
		 * }else if(a.length() > (b.length())){
		 * System.out.println("a segunda palavra possui:  " + b.length() +
		 * "  caracteres");
		 * 
		 * }else if(a.length() == (b.length())) { System.out.
		 * println("as duas palavras tem a mesma quantidade de caracteres.");
		 * 
		 * }
		 * 
		 */
		System.out.println("Comparando números");
		System.out.println("Informe um número:");

		c = sc.nextInt();
		System.out.println("Informe outro número:");
		d = sc.nextInt();

		/*
		 * if (c < d){ System.out.println("o numero  " + c + "  é menor.");
		 * 
		 * } else if(c > d) { System.out.println("o numero  " + d +
		 * "  é menor");
		 * 
		 * } else if (c == d) { System.out.println("os números são iguais"); }
		 * 
		 */
		int comparativo1 = c < d ? 1 : c == d ? 2 : 0;
		switch (comparativo1) {
		case 1:
			System.out.println("o numero  " + c + "  é menor.");
			break;
		case 2:
			System.out.println("os números são iguais");
			break;
		default:
			System.out.println("o numero  " + d + "  é menor");
			break;
		
		}
		
		System.out.println("Obrigada " + n);
	
		}
	}

	