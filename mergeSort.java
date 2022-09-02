

class Solution {
    
    public static void merge(int arr1[], int arr2[], int arr[]){
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(j<arr1.length && k<arr2.length){
            
            if(arr1[j]<=arr2[k]){
                arr[i] = arr1[j];
                i++;
                j++;  
            }
            
            else{
                arr[i] = arr2[k];
                i++;
                k++; 
            }
        }
        
        if(j<arr1.length){
            
            while(j<arr1.length){
                arr[i] = arr1[j];
                i++;
                j++;
            }
        }
        else{
            
            while(k<arr2.length){
                arr[i] = arr2[k];
                i++;
                k++;
            }
            
        }
    }
    
    public static void mergeSort(int a[]){
        
        // base case
        if(a.length<=1){
            return;
        }
        
        int middle = a.length / 2;
        
        int firstHalf[] = new int[middle];
        int secondHalf[] = new int[a.length - middle];
        
        for(int i = 0; i<firstHalf.length; i++){
            firstHalf[i] = a[i];
        }
        
        for(int i = 0; i<secondHalf.length; i++){
            secondHalf[i] = a[middle];
            middle++;
        }
        
        mergeSort(firstHalf);
        mergeSort(secondHalf);
        
        merge(firstHalf, secondHalf, a);
         
    }
    
    
    public static void main(String[] args) {
        
        int arr[] = {10, 4, 5, 9, 8, 6, 12, 46, 56, 8};
        mergeSort(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
