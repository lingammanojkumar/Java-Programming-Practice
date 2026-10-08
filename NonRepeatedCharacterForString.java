package Arrays;

import java.util.Scanner;

public class NonRepeatedCharacterForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str=sc.nextLine();
    //boolean character=true;
    for(int i=0;i<str.length();i++)
    {
    	int count=0;
    	for(int j=0;j<str.length();j++)
    	{
    		if(str.charAt(i)==str.charAt(j)) {
    			count++;
    		}
    	}
    	if(count==1)
    	{
    		System.out.println(str.charAt(i));
    		//character=false;
    		break;
    	}
    }
//    if(character)
//    {
//    	System.out.println("No Repeated characters");
//    }
    
    sc.close();
	}

}
/*
Enter a string: 
Hello
H
*/