/*
1
22
333
4444

*/



import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int i = 1;
        
        while(i<=n){
            
            int j = 1;
            
            while(j<=i){
                
                System.out.print(i);
                j++;
            }
            
            i++;
            System.out.println();
        }
		
	}

}
