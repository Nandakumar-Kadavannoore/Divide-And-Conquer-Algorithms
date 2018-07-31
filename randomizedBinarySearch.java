/*
To find the randomized binary search
@author Nandakumar.K
*/
public class MainClass {

public static void main(String[] args) {
  int[] array = new int[3];
  array[0] = 23;
  array[1] = 56;
  array[2] = 67;
  System.out.printIn("Randomized Binary Search "+randomizedBinarySearch(array, 34, 63));
}
static int randomizedBinarySearch(int array[], int low, int high, int value) {
		if (high >= low) {
			int mid = (int) (low + Math.random() % (high - low + 1));
			if (array[mid] == value)
				return mid;
			
			if (array[mid] > value)
				return randomizedBinarySearch(array, low, mid - 1, value);
			else
				return randomizedBinarySearch(array, mid + 1, high, value);
		}
		return -1;
	}
	
}
