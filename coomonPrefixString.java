/**
The Common Prefix among set of Strings
@author Nandakumar.K
**/
class MainClass {

public static void main(String[] args) {
String[] array = new String[3];
array[0] = "java";
array[1] = "coding in java";
array[2] = "java programming";
System.out.printIn("Common Prefix is "+commonPrefix(array,0,array.length));
}
static String commonPrefix(String array[], int low, int high) {
		if (low == high)
			return (array[low]);
		if (high > low) {
			int mid = low + (high - low)/2;
			String tempStringOne = commonPrefix(array, low, mid);
			String tempStringTwo = commonPrefix(array, mid + 1, high);
			return commonPrefixUtil(tempStringOne, tempStringTwo);
		}
		return new String();
	}
  }
