package hackkerrank;

import java.util.Scanner;

public class KareoMatrixProblem {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("please enter sise of matrix for row and column");
	int row=sc.nextInt();
	int column =sc.nextInt();
	int matrix[][]= new int[row][column];
	System.out.println("enter elements of matrix for "+ row +" "+column);
	
	for(int i =0;i<=row-1;i++){
		
		for(int j =0;j<=column-1;j++){
			
		matrix[i][j]=sc.nextInt();
		}
	}
	System.out.println(" original  matrix print ");
	
	for(int i=0;i<=row-1;i++){
		for(int j =0;j<=column-1;j++){
			
			System.out.print(matrix[i][j]+"\t");
		}
		System.out.println();	
	}
	System.out.println("elements change between row and column,except digonal");
	for(int i=0;i<=row-1;i++){
		for(int j=0;j<=column-1;j++){
			{
				int temp =matrix[i][j];
				matrix[i][j]=temp;
				temp=matrix[j][i];
				System.out.print(matrix[j][i]+"\t");
			}	
		}System.out.println();
			}
}
}


