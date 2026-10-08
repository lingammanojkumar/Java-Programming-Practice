package Arrays;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str=sc.nextLine();
    StringBuilder sb=new StringBuilder(str);
    sb.reverse();
    if(str.equalsIgnoreCase(sb.toString()))
    {
    	System.out.println("Palindrome");
    }else {
    	System.out.println("Not Palindrome");
    }
    sc.close();
	}

}
/*
Enter a string: 
Mom
Palindrome
*/