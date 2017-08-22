package lab;


public class lab_work {
	 static void arraySort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;
	                          }
	                 }
	                 }
	                         }  
	public static void main(String[] args) {
		
		 int arr[] ={2,20,13,3,6,4,9};  
         
         System.out.println("Array before sorting");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
         System.out.println();  
           
         arraySort(arr); 
          
         System.out.println("Array After sorting");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
		                          
		                 
		          
		  
	}

}
