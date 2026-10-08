package Arrays;
import java.util.Scanner;
public class PalidromeUsingTwoPointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str=sc.nextLine();
    boolean isPalindrome=true;
    int left=0,right=str.length()-1;
    while(left<right)
    {
    	str=str.toLowerCase();
    	if(str.charAt(left)!=str.charAt(right))
    	{
    		isPalindrome=false;
    		break;
    	}
    	left++;
    	right--;
    }
    if(isPalindrome)
    {
    	System.out.println("Palindrome");
    }else {
    	System.out.println("Not a palindrome");
    }
    sc.close();
	}

}
/*
Enter the String: 
Mom
Palindrome
*/	