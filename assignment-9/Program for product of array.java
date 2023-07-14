class Solution {
  public static void main (String[] args)
  {
      
    // array Elements
    int arr[] = { 1, 2, 3, 4, 5 };
    int product = 1;
  
    // initialize start and last pointers
    int i = 0;
    int j = arr.length- 1;
  
    // add first and last simultaneously
    while (i < j) {
      product *= arr[i] * arr[j];
      i++;
      j--;
    }
  
    // multiply only one element
    if (i == j) {
      product *= arr[i];
    }
  
    // printing product
    System.out.println( product);
  }
}