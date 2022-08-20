/*

input = 7

output =>

G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG

 */

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		//Your code goes here
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int i = 1; 
        
        while(i<=n)
        {
            char ch = (char)('A' + n - i);
            
            int j = 1;
            
            while(j<=i){
                
                System.out.print(ch);
                
                ch = (char)(ch + 1);
                
                
                j++;
                
            }
            
            
            i++;
            System.out.println();
        }
	}
}