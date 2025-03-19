package basic.core;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
         
		 System.out.println("Enter the character(a to z):");
		 char c = in.next().charAt(0);
		  switch (c) {
		  case 'a' :{
			  System.out.println(c + "is a vowel");
			  break;
		  }
		  case 'e' :{
			  System.out.println(c + "is a vowel");
			  break;
		  }
		  case 'i' :{
		  System.out.println(c + "is a vowel");
		  break;
		  }
		  case 'o' :{
			  System.out.println(c + "is a vowel");
			  break;
		  }
		  case 'u' :{
			  System.out.println(c + "is a vowel");
			  break;
		  }
		  default:
			  System.out.println(c + "is a vowel");
		  
		  }
		  }
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
	}


