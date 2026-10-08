package Codetantrapractice;
import java.util.Scanner;
public class LengthOfLastWordInString {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().trim();
        
        // Find the index of the last space character
        int lastSpaceIndex = str.lastIndexOf(' ');
        
        // Length of last word is total length minus index of last space - 1
        int length = str.length() - lastSpaceIndex - 1;
        
        System.out.println(length);
    }
}
/*
Enter a string: 
Hello world
5
*/