import java.util.ArrayList;

public class BinarySearch implements Search {

	QuickSort bSort = new QuickSort(); 
	
	public int runSearch(int[] arr, int key) {
		
		  bSort.runSort(arr);
	        
	        int result = -999;
	        
	        int fHalf = 0, sHalf = arr.length - 1;
	        
	        int mOfArray =  0; // had to modify this for some reason 
	        while(fHalf <= sHalf) {
	           
	        	 mOfArray = (fHalf + sHalf)/2;
	        	
	            if(key > arr[mOfArray] ) 
	                fHalf = mOfArray + 1;
	            
	            else if(key == arr[mOfArray])
	                return mOfArray;
	            
	            else 
	                sHalf = mOfArray - 1;
	        
	        } // while
	        
	            return result;

	} // runSearch

	public int runSearch(ArrayList<String> arr, String key) {

		bSort.runSort(arr);
		
		int result = -999;
		
		int fHalf = 0, sHalf = arr.size() - 1;
		
		int mOfArray =  0; 
		
		while(fHalf <= sHalf) {
			
			mOfArray = (fHalf + sHalf)/2;
			
			if(key.compareTo(arr.get(mOfArray)) > 0) 
				fHalf = mOfArray + 1;
			
			else if(key.equals(arr.get(mOfArray)) )
				return mOfArray;
			
			else 
				sHalf = mOfArray - 1;
	
		} // while
		
		return result;
		
	} // runSearch

} //class
