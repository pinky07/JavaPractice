package multidimension.array;

public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board [][] = new int[3][3];
		for(int row=0;row<board.length;row++){
			for(int col =0;col<board.length;col++){
				board[row][col]= row+col;
			}
		}
		for(int[] pr:board){
			for(int i:pr){
				System.out.print(i + "\t");
			}
			System.out.println("\n");
		}
	}

}
