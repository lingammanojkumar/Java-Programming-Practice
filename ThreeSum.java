package Codetantrapractice;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of array: ");
   int n=sc.nextInt();
   int[] arr=new int[n];
   for(int i=0;i<n;i++)
   {
	   arr[i]=sc.nextInt();
   }
   Arrays.sort(arr);
   boolean found=false;
   for(int i=0;i<n-1;i++)
   {
	if(i>0 && arr[i]==arr[i-1])
	{
		continue;
	}
	int left=i+1;
	int right=n-1;
	while(left<right)
	{
		int sum=arr[i]+arr[left]+arr[right];
		if(sum==0)
		{
			System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
			found=true;
			while(left<right && arr[left]==arr[left+1])left++;
			while(left<right && arr[right]==arr[right-1]) right--;
			left++;
			right--;
		}else if(sum<0) {
			left++;
		}else {
			right--;
		}
	}
   }
   if(!found) {
	   System.out.println("No Triplets found");
   }
   sc.close();
	}

}
/*
 * Enter the size of array: 
3
0 0 1
No Triplets found
*/
/*
 Enter the size of array: 
8
-3 -2 -1 0 1 2 3 4
-3 -1 4
-3 0 3
-3 1 2
-2 -1 3
-2 0 2
-1 0 1
*/
