package Arrays;

import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of an array: ");
	    int size=sc.nextInt();
	    System.out.println("Enter "+size+" elements");
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Enter k value ");
	    int k=sc.nextInt();
	    int max=Integer.MIN_VALUE;
	    for(int i=0;i<arr.length-k;i++) {
	    	int sum=0;
	    	for(int j=i;j<k+i;j++) {
	    		sum+=arr[i];
	    	}
	    	max=Math.max(max, sum);
	    }
	    System.out.println("Max sum: "+max);
	}

}
