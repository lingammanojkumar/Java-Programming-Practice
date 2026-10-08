package Codetantrapractice;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number: ");
    int n=sc.nextInt();
    int[][] matrix=new int[n][n];
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    		matrix[i][j]=sc.nextInt();
    	}
    }
    boolean isSymmetric=true;
    for(int i=0;i<n;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    		if(matrix[i][j]!=matrix[j][i])
    		{
    			isSymmetric=false;
    			break;
    		}
    	}
    	if(!isSymmetric)
    	{
    		break;
    	}
    }
    if(isSymmetric) {
    	System.out.println("Symmetric Matrix");
    }else {
    	System.out.println("Not a Symmetric Matrix");
    }
    sc.close();
	}

}
/*
enter a number: 
3
1 2 3
2 4 5
3 5 6
Symmetric Matrix
*/