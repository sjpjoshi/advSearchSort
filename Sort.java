//Mr. Kahn
//Modified: 2/2/2021
//Sort.java
//Sort interface to be implemented by various Sort algorithm classes

import java.util.ArrayList;

public interface Sort
{
  //INPUT: an integer array
  //RESULT: arr is now sorted in ascending order
  public void runSort(int[] arr);

  //INPUT: an ArrayList of Strings
  //RESULT: arr is now sorted in ascending order
  public void runSort(ArrayList<String> arr);
}