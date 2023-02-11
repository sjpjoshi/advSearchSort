//Mr. Kahn
//Modified: 2/2/2021
//Search.java
//Search interface to be implemented by various Search algorithm classes

import java.util.ArrayList;

public interface Search
{
  //INPUT: an integer array and a search key
  //OUTPUT: last index where search key was found
  //        OR -999 if it was not found
  public int runSearch(int[] arr, int key);

  //INPUT: an ArrayList of Strings and a search key
  //OUTPUT: last index where search key was found
  //        OR -999 if it was not found
  public int runSearch(ArrayList<String> arr, String key);
}