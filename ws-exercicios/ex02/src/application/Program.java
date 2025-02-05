package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> votes = new TreeMap<>();
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				if(votes.containsKey(fields[0])) {
					votes.put(fields[0], votes.get(fields[0]) +  Integer.parseInt(fields[1]));
				}else{
					votes.put(fields[0], Integer.parseInt(fields[1]));
				}
				line = br.readLine();
				
			}
			for(String key : votes.keySet()) {
				System.out.println(key +": " + votes.get(key));
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
