package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int YearOfBirth;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your your year of birth.");
		YearOfBirth = in.nextInt();
		
		in.close();
		
		int n = YearOfBirth % 12;
		
		switch(n) {
		
		  case 0:
			  System.out.println("Monkey");
			  break;
			  
		  case 1:
			  System.out.println("Cockerel");
			  break;
			  
		  case 2:
			  System.out.println("Dog");
			  break;
			  
		  case 3:
			  System.out.println("Pig");
			  break;
			  
		  case 4:
			  System.out.println("Mouse");
			  
		  case 5:
			  System.out.println("Ox");
			  break;
			  
		  case 6:
			  System.out.println("Tiger");
			  break;
			  
		  case 7:
			  System.out.println("Rabbit");
			  
		  case 8:
			  System.out.println("Dragon");
			  break;
			  
		  case 9:
			  System.out.println("Snake");
			  break;
			  
		  case 10:
			  System.out.println("Horse");
			  break;
			  
		  case 11:
			  System.out.println("Sheep");
			  break;
			  
			  
		
		}

	}

}
