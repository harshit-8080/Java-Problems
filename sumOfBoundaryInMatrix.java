/*
 For a given two-dimensional square matrix of size (N x N). 
 Find the total sum of elements on both the diagonals and at all the four boundaries.
 

Sample input 1:

1
3
1 2 3
4 5 6
7 8 9

Sample Output 1:

45
*/


public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
        int row = mat.length;
        if(row == 0){
            System.out.print(0);
            return;
        }
        int col = mat[0].length;
        int sum = 0;
        for(int i = 0; i<row; i++){
            
            for(int j = 0; j<col; j++){

            	if( i == 0 || i == row - 1 || j == col - 1 || j == 0){
                    sum+=mat[i][j];
                }

                else if( i == j){
					sum+=mat[i][j];
                }
                else if(i+j == row -1  && i+j == col -1 ){
					
                    sum+=mat[i][j];
                
                }
            
            
            }
        }
        System.out.print(sum);
	}

}