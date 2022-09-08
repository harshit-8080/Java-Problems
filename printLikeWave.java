/*
  
  For a given two-dimensional integer array/list of size (N x M), 
  print the array/list in a sine wave order, 
  i.e, print the first column top to bottom, next column bottom to top and so on.


Sample Input 1:

1
3 4 
1  2  3  4 
5  6  7  8 
9 10 11 12

Sample Output 1:

1 5 9 10 6 2 3 7 11 12 8 4

 */

 
public class Solution {

	public static void wavePrint(int mat[][]){
		//Your code goes here
        
        int row = mat.length;
        if(row == 0){
            return;
        }
        int col = mat[0].length;
        
        int direction = 0;
        
        for(int i=0; i<col; i++){

        	int j = direction == 0 ? 0 : 1;
            if(j == 0){
                
                while(j<row){
                    System.out.print(mat[j][i]+ " ");
                    j++;
                }
                direction = 1;
            }
            else{
                j = row-1;
                while(j>=0){
                    System.out.print(mat[j][i]+ " ");
                    j--;
                }
                direction = 0;
            }
        
        
        
        }
	}

}