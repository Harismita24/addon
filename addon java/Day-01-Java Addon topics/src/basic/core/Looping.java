package basic.core;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		/*
		
		for(int temp = 1; temp <= 5; temp++) {
		
		}
		
		System.out.println("Enter your name:");
		String name = in.nextLine();
		System.out.println("Your name is" + name);
		*/
		/*
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		*/
		
		int i=1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		
		int  i =1;
		do {
			System.out.println(i);
			i++;
		} while(i<=10);
		}
		

	}
}


