import java.util.ArrayList;

public class MergeSort implements Sort{

	//https://www.geeksforgeeks.org/java-program-for-merge-sort/
	
	public void runSort(int[] arr) {
		
		int l = 0;
		int r = arr.length - 1;
		
		sort(arr, l, r);
		
	} // runSort
	
	public static void sort(int arr[], int l, int r) {
		
		if(l < r) {
			
			int middle = (l + r)/2;
			
			sort(arr, l, middle);
			sort(arr, middle + 1, r);
			
			merge(arr, l, middle, r);
			
		} // if
		
	} // sort
	
	static void merge(int arr[], int l, int m, int r) {
		
		 	int n1 = m - l + 1; 
	        int n2 = r - m; 
	 
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[l + i]; 
	        
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	  
	        int i = 0, j = 0; 
	  
	        int k = l; 
	        
	        while (i < n1 && j < n2) { 
	        	
	            if (L[i] <= R[j]) {
	            	
	                arr[k] = L[i]; 
	                i++;
	                
	            } else {
	            	
	                arr[k] = R[j]; 
	                j++;
	                
	            } //else 
	            
	            k++; 
	            
	        } // while
	  
	        while (i < n1) { 
	        	
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	            
	        } // while
	  
	      
	        while (j < n2) {
	        	
	            arr[k] = R[j]; 
	            j++; 
	            k++;
	            
	        } // while
		
	} // merge

	public void runSort(ArrayList<String> arr) {
		
		int l = 0;
		int r = arr.size() - 1;
		
		Sort(arr, l, r);
		
	} //runSort
	
	public static void Sort(ArrayList<String> arr, int l, int r) {
		
		ArrayList<String> temp = new ArrayList<String>();
		
		if(l < r) {
			
			int middle = (l + r)/2;
			
			Sort(arr, l, middle);
			Sort(arr, middle + 1, r);
			
			Merge(arr, temp, l, middle, r);
			
		} // if
		
	} // sort
	
	static void Merge(ArrayList<String> arr, ArrayList<String> temp, int l, int m, int r) {
		
		// help from harvey, for some unknown reason it works and we both have no idea why
		
		 for(int i = 0; i < arr.size(); ++i)
             temp.add(new String());
         
         for(int i = l; i <= r; i++)
             temp.set(i, arr.get(i));
         

         int i = l;
         int j = m + 1;
         int k = l;

         while(i <= m && j <= r) {
        	 
             if(temp.get(i).toLowerCase().compareTo(temp.get(j).toLowerCase()) < 0) {
                 arr.set(k, temp.get(i));
                 i++;
                 
             } else  {
            	 
                 arr.set(k, temp.get(j));
                 j++;
                 
             } // else
             
             k++;
             
         } // while

         while(i <= m) {
        	 
             arr.set(k, temp.get(i));
             k++;
             i++;
             
         } // while
	 	
	} // merge
	
} //class
