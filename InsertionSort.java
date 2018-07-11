class InsertionSort {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){ 
	long start = System.currentTimeMillis();   
       	int b = (int)Math.pow(2, 16);
        int[] arr1 = new int[b];
    	for (int i=0; i<b; i++){
        	int n = (int)(Math.random()*b + 1);
        	arr1[i] = n;	
 	}    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }
	long end = System.currentTimeMillis();
	
	System.out.print("Execution time is " + (end - start) + " miliseconds");    
    }    
}  

