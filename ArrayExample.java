package Arrays;

import java.util.Scanner;

public class ArrayExample {

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
    for(int i=0;i<size;i++) System.out.print(arr[i]+" ");
    
	}

}
