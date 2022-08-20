/*
A
BC
CDE
DEFG
EFGHI
 */

import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int i = 1;
        
        while(i<=n) {
            
            char ch = (char)('A' + i - 1);
            
            int j = 1;
            
            while(j<=i) {
                
                System.out.print(ch);
                ch = (char)(ch + 1);
                j++;
            }
            
            i++;
            System.out.println();
        }
		
	}

}
