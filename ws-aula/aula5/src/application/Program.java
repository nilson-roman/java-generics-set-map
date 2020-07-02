package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Maria", "maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		// String tem tratamento específico no conteudo por isso compara como true
		System.out.println(s1 == s2);
		
		// mas se instanciar uma String como object String ele vai comparar a posicção heap (memória)
		System.out.println(s3 == s4);
	}

}
