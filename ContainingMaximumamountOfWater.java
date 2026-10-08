package Codetantrapractice;
//Write a program to find the maximum amount of water that can be stored between two vertical lines using the two-pointer technique. 
//You are given an array where each element represents the height of a vertical line drawn at that index. 
//Choose any two lines such that together with the x-axis they form a container. 
//Find the maximum amount of water the container can store.
import java.util.*;
public class ContainingMaximumamountOfWater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Two-pointer approach
        int left = 0;
        int right = n - 1;
        int maxWater = 0;

        while (left < right) {
            // Calculate height and width of current container
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            
            // Calculate water area
            int currentWater = height * width;
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer pointing to the shorter line
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(maxWater);
        sc.close();
    }
}
/*
Enter the size of an array: 
9
1 8 6 2 5 4 8 3 7
49
*/