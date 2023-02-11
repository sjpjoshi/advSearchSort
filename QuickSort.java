import java.util.ArrayList;

//https://www.geeksforgeeks.org/quick-sort/

public class QuickSort implements Sort {
	
	public void runSort(int[] arr) {
		
		int low = 0;
		int high = arr.length - 1;
		
		sort(arr, low, high);
		
	} // runSort
	
    public static void sort(int[] arr, int low, int high) {
    	
    	if(low < high) {
			
			int temp = partition(arr, low, high);
			sort(arr, low, temp - 1);
			sort(arr, temp + 1, high);
			
		} // if
    	
    }	// sort
    
    static int partition(int[] arr, int low, int high) {
    	
    	int pivot = arr[high];
    	int i = low - 1;
    	
    	for(int j = low; j < high; j++) {
    		
    		if(arr[j] < pivot) {
    			
    			i++;
    			
    			int temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    			
    		} // if
    		
    	} // for
    	
    	int temp = arr[i + 1];
    	arr[i + 1] = arr[high];
    	arr[high] = temp;
    	
		return i + 1;
    	
    } // partition

	public void runSort(ArrayList<String> arr) {
	
		int low = 0;
		int high = arr.size() - 1;
		
		Sort(arr, low, high);
		
	} // runSort
	
	public static void Sort(ArrayList<String> arr, int low, int high) {
    	
    	if(low < high) {
			
			int temp = Partition(arr, low, high);
			Sort(arr, low, temp - 1);
			Sort(arr, temp + 1, high);
			
		} // if
    
    }	// sort
	
	static int Partition(ArrayList<String> arr, int low, int high) {
	    	
	    String pivot = arr.get(high);
	    int i = low - 1;
	    	
	    	for(int j = low; j < high; j++) {
	    		
	    		if(pivot.compareTo(arr.get(j)) > 0) {
	    			
	    			i++;
	    			
	    			String temp = arr.get(i);
	    			arr.set(i, arr.get(j));
	    			arr.set(j, temp);
	    			
	    		} // if
	    		
	    	} // for
	    	
	    	String temp = arr.get(i + 1);
	    	arr.set(i + 1, pivot);
	    	arr.set(high, temp);
	    	
			return i + 1;
	    	
	} // partition

} // class
