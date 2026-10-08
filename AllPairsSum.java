package Codetantrapractice;
import java.util.*;
public class AllPairsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        // Read input array size
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Read target sum
        int k = sc.nextInt();
        
        boolean found = false;
        
        // Find and print all ordered pairs (a, b) such that a + b = k
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                    found = true;
                }
            }
        }
        
        // If no pairs matched target k
        if (!found) {
            System.out.print("No pairs found");
        }
        sc.close();
    }
}
/*
3
1 2 3
4
(1,3) (2,2) (3,1) 
*/