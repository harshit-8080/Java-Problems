/*
 For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. 
 That is, you need to print in the order followed for every iteration:

Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16

Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 

 */


public class Solution {

	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        if(matrix.length == 0){
            return;
        }
        int rs = 0;
        int re = matrix.length - 1;
        
        int cs = 0;
        int ce = matrix[0].length - 1;
        
        //System.out.println(re + "   " + ce);
        int count = 0;
        while(count<matrix.length * matrix[0].length){
			
            for(int i = cs; count<matrix.length * matrix[0].length && i<=ce; i++){
				System.out.print(matrix[rs][i]+ " ");
                count++;
            }
            
        	rs++;
            
            for(int i = rs; count<matrix.length * matrix[0].length && i<=re; i++ ){
				System.out.print(matrix[i][ce] + " ");
                count++;
            }
             
            ce--;
            
            for(int i = ce; count<matrix.length * matrix[0].length && i>=cs; i--){
				System.out.print(matrix[re][i] + " ");
                count++;
            }
             
            re--;
            
            
            for(int i = re; count<matrix.length * matrix[0].length && i>=rs; i--){
				System.out.print(matrix[i][cs] + " ");
                count++;
            }
            
            cs++;           
        }
	}
}