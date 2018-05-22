package multidimension.array;

import java.util.Scanner;

public class Transpose {

	public void printTranspose(int[][] twoD){
		
	}
	public static void main(String[] args) {
	Transpose transpose = new Transpose();
	System.out.println("Enter total rows and columns: ");
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	int column = sc.nextInt();
	int twoD[][]= new int[row][column];
	
	System.out.println("Enter elements for matrix ");
	for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			twoD[i][j]=sc.nextInt();
			System.out.print(" ");
		}
	}
	System.out.println("Original matrix ");
	for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			System.out.print(twoD[i][j]+" ");
		}System.out.print(" ");
	}
	System.out.println		("Transpose matrix ");
	for(int i=0;i<row;i++){
		for(int j=0;j<column;j++){
			System.out.print(twoD[j][i]+" ");
		}System.out.print(" ");
	}
	}

}
