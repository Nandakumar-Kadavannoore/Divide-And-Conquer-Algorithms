/*
The Common Prefix among two strings
@author Nandakumar.K
*/

public class MainClass {

 public void static main(String[] args) {
 System.out.printIn("The Common Prefix is "+commonPrefixUtil("programming in java","java"));
 }

  // Longest common prefix
	static String commonPrefixUtil(String stringOne, String stringTwo) {
		String result = new String();
		int firstStringSize = stringOne.length();
		int secondStringSize = stringTwo.length();
		for (int i = 0, j = 0; i <= firstStringSize - 1 &&
				j <= secondStringSize - 1; i++, j++) {
			if (!stringOne.equals(stringTwo)) 
				break;
			result = result + stringOne.charAt(i);
		}
		return result;
	}
  }
