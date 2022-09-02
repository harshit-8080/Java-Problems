// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Solution {
    public static boolean search(int arr[] ,int s, int e, int x){
        
        if(arr[(s+e)/2] == x){
             return true;
        }
         if(s>=e){
             return false;
         }
        
        if(arr[(s+e)/2] < x){
            
            s = (s+e)/2 + 1;
            return search(arr,s, e, x);
            
        }
        else{
            
            e = (s+e)/2 - 1;
            return search(arr,s, e, x);
        }
           
    }
    public static void main(String[] args) {
        int arr[] ={ 1,12,32,54,95,800,};
        System.out.println(search(arr, 0, arr.length, 91));
        
    }
}
