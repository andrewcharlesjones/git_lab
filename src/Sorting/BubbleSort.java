package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param array		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
  public static int[] bubble(int array[]) {
    boolean unsorted = true;
    int holder;
    
    while (unsorted) {
      unsorted = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          holder = array[i];
          array[i] = array[i + 1];
          array[i + 1] = holder;
          unsorted = true;
        }
      }
    }

    return array;
  }
}
