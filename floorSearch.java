/*
To find the floor value in an array
@author Nandakumar.K
*/

public class MainClass {

public static void main(String[] args) {
  int[] array = new int[3];
  array[0] = 3;
  array[1] = 7;
  array[2] = 8;
  System.out.printIn("The floor value is "+floorSearch(array, array.length, 3));
}

static int floorSearch(int array[], int size, int value) {
		if (value >= array[size-1])
			return size - 1;
		
		if (value < array[0])
			return -1;
		
		for (int i = 1; i < size; i++)
			if (array[i] > value)
				return (i-1);
		
		return -1;
	}
}
