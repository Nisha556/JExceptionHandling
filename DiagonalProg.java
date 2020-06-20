package myfirstproject;



	
import java.util.*;

class DiagonalProg
{  

	public static void main(String args[])
	 {
	 Scanner sc = new Scanner(System.in);
	 
	         int i,j,n; 
	         float sum=0, sum1=0, ratio=0;  
	         
	        		 
	 System.out.println("Enter the number of rows:");
	 n = sc.nextInt();
	 System.out.println("Enter the number of columns:");
	 n = sc.nextInt();
	 
	 int[][] mat = new int[n][n];
	 
	     System.out.println("Enter the elements of the matrix") ;
	     for(i=0;i<n;i++)
	     { 
	      for(j=0;j<n;j++)
	      { 
	          mat[i][j] = sc.nextInt();
	     }
	 }
	 
	     System.out.println("The elements of the matrix") ;
	     for(i=0;i<n;i++)
	     { 
	      for(j=0;j<n;j++)
	      { 
	        System.out.print(mat[i][j]+"\t");
	     }
	       System.out.println("");
	 }
	 
	     for(i=0;i<n;i++)
	     { 
	      for(j=0;j<n;j++)
	      { 
	 if(i==j) 
	 {
	 sum = sum + mat[i][j];
	 }
	 if(i == n-j-1)
{
		 sum1 = sum1 + mat[i][j]; 
}
	     }
	      ratio = (sum/sum1);
	      
	      
	 }
	 
	     
	     
	     System.out.println("SUM of DIAGONAL elements of the matrix = "+sum) ;
	     
	     System.out.println("SUM of DIAGONAL of the matrix = "+sum1) ;
	   
	     System.out.println("Ratio DIAGONAL of the matrix = "+ratio) ;
	     printPrincipalDiagonal(mat, n); 
	 	printSecondaryDiagonal(mat, n); 
	 	printBoundary(mat, n, n);
	 } 
	
	static void printPrincipalDiagonal(int mat[][], int n) 
 	{ 
 		System.out.print("Principal Diagonal: "); 

 		for (int i = 0; i < n; i++) { 
 			for (int j = 0; j < n; j++) { 

 				
 				if (i == j) { 
 					System.out.print(mat[i][j] + ", "); 
 				} 
 			} 
 		} 
 		System.out.println(""); 
 	} 
	static void printSecondaryDiagonal(int mat[][], int n) 
	{ 
		System.out.print("Secondary Diagonal: "); 

		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) { 

				
				if ((i + j) == (n - 1)) { 
					System.out.print(mat[i][j] + ", "); 
				} 
			} 
		} 
		System.out.println(""); 
			} 
	public static void printBoundary(int a[][], int m, 
			int n) 
{ 
for (int i = 0; i < m; i++) { 
for (int j = 0; j < n; j++) { 
if (i == 0) 
System.out.print(a[i][j] + " "); 
else if (i == m - 1) 
System.out.print(a[i][j] + " "); 
else if (j == 0) 
System.out.print(a[i][j] + " "); 
else if (j == n - 1) 
System.out.print(a[i][j] + " "); 
else
System.out.print(" "); 
} 
System.out.println(""); 
} 
}
	 
}



   
