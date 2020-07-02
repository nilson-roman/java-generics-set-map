package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		// List<?> list = new ArrayList<Integer>();
		// O compilador não sabe qual é o tipo específico do qual a lista foi instanciada
		// --> list.add(3); // erro de compilação
		
	}	
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}