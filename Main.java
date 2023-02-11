import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		final int ARRAY_SIZE = 10;
	    final int MAX_RANDOM_VALUE = 1000;

	    MergeSort merge = new MergeSort(); 
	    QuickSort quick = new QuickSort();
	     
	    BinarySearch bSearch = new BinarySearch();
	    
	    int[] numArr = new int[ARRAY_SIZE];
	    ArrayList<String> strArr = new ArrayList<String>();

	    Scanner kb = new Scanner(System.in);
	    int searchNum;
	    int result = 0;

	    String userInput= "";
	    
	    
//----------------------------------------------------------------------	   
	    //TEST INT SEARCH

	    //generate a random numArr
	    
	    for(int i=0; i<numArr.length; ++i)	{
	    	
	      numArr[i] = (int) (Math.random()*MAX_RANDOM_VALUE);
	      System.out.println("numArr[" + i + "] = " + numArr[i]);
	      
	    } // for

	    System.out.print("Search for: ");
	    searchNum = kb.nextInt();

	    result = bSearch.runSearch(numArr, searchNum);

	    if(result == -999)
	      System.out.println(searchNum + " was not found in the array.");
	    
	    else    
	      System.out.println(searchNum + " was found at index: " + result);
	    	    
	    // MergeSort
	    System.out.println();

	    System.out.println("Running sort()...");
	    merge.runSort(numArr);

	    System.out.println("\nSORTED ARRAY:");
	    
	    for(int i=0; i<numArr.length; ++i) 
	      System.out.println("numArr[" + i + "] = " + numArr[i]);
	    // MergeSort
	    
 //----------------------------------------------------------------------
	    

	    
 //----------------------------------------------------------------------
	    // MergeSort WITH ARRAYLIST
	    
	    
	    System.out.println();

	    System.out.print("strArr[" + strArr.size() + "] = (or \"exit\"): ");
	    userInput = kb.next();

	    while(!userInput.toLowerCase().equals("exit"))	{
	    	
	      strArr.add(userInput);

	      System.out.print("strArr[" + strArr.size() + "] = (or \"exit\"): ");
	      userInput = kb.next();
	      
	    } // while

	    System.out.print("Search for: ");
	    userInput = kb.next();

	  
	    result = bSearch.runSearch(strArr, userInput);

	    if(result == -999)
	      System.out.println(userInput + " was not found in the array.");
	    
	    else
	      System.out.println(userInput + " was found at index: " + result);
	    
	  //MergeSort-------------------------------------------------------
	    
	    System.out.println("Running sort()...");
	    merge.runSort(numArr);

	    System.out.println("\nSORTED ARRAY:");
	    for(int i=0; i<strArr.size(); ++i)
	    {
	      System.out.println("strArr[" + i + "] = " + strArr.get(i));
	    }
	    
	  //MergeSort-------------------------------------------------------

	    System.out.println("");
 //----------------------------------------------------------------------
	    
	    
	    
//-----------------------------------------------------------------------   
	    
	    for(int i=0; i<numArr.length; ++i)	{
	    	
		      numArr[i] = (int) (Math.random()*MAX_RANDOM_VALUE);
		      System.out.println("numArr[" + i + "] = " + numArr[i]);
		      
		    } // for
	    
	    System.out.print("Search for: ");
	    searchNum = kb.nextInt();

	    result = bSearch.runSearch(numArr, searchNum);

	    if(result == -999)
	      System.out.println(searchNum + " was not found in the array.");
	    
	    else    
	      System.out.println(searchNum + " was found at index: " + result);
	    
	    System.out.println();

	    //QuickSort--------------------------------------------------------------
	    System.out.println("Running sort()...");
	    quick.runSort(numArr);
	    
	    System.out.println("\nSORTED ARRAY:");
	    
	    for(int i=0; i<numArr.length; ++i) 
	      System.out.println("numArr[" + i + "] = " + numArr[i]);
	    //QuickSort--------------------------------------------------------------

	    
	    System.out.println("");
	    
//----------------------------------------------------------------------

	    
	    
//----------------------------------------------------------------------	    
	    // QuickSort SORT WITH ARRAYLIST
	    
	    System.out.print("strArr[" + strArr.size() + "] = (or \"exit\"): ");
	    userInput = kb.next();

	    while(!userInput.toLowerCase().equals("exit"))	{
	    	
	      strArr.add(userInput);

	      System.out.print("strArr[" + strArr.size() + "] = (or \"exit\"): ");
	      userInput = kb.next();
	      
	    } // while

	    System.out.print("Search for: ");
	    userInput = kb.next();

	  
	    result = bSearch.runSearch(strArr, userInput);

	    if(result == -999)
	      System.out.println(userInput + " was not found in the array.");
	    
	    else
	      System.out.println(userInput + " was found at index: " + result);
	    
	    //QuickSort------------------------------------------------------------
	    System.out.println("Running sort()...");
	    quick.runSort(numArr);

	    System.out.println("\nSORTED ARRAY:");
	    for(int i=0; i<strArr.size(); ++i)	{
	    	
	      System.out.println("strArr[" + i + "] = " + strArr.get(i));
	      
	    }
	    //QuickSort------------------------------------------------------------
	    
//----------------------------------------------------------------------	    	
	    
	} // main
 	
	
} // Class
