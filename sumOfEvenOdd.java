/*
Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
*/

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        int sumEven = 0;
        int sumOdd= 0;
        int rem = 0;
        
        while(number>0){
            
            rem = number % 10;
            number = number / 10;
            if(rem % 2 ==0){
			
                sumEven = sumEven + rem;
            }
            else{
                
                sumOdd = sumOdd + rem;
            }
            
        }
        System.out.println(sumEven+" "+sumOdd);

	}
}
