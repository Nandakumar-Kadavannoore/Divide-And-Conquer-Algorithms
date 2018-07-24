/*
To find Multiply product of polynomials
@author Nandakumar.K
*/
public class MainClass {

public void static main(String[] args) {
  int[] firstArray = new int[3];
  firstArray[0] = 12;
  firstArray[1] = 34;
  firstArray[2] = 45;
  int[] secondArray = new int[3];
  secondArray[0] = 14;
  secondArray[1] = 23;
  secondArray[2] = 47;
  System.out.printIn("The Polynomial Product is "+multiply(firstArray, secondArray, firstArray.length, secondArray.length));
}

static int[] multiply(int first[],int second[], int firstLength, int secondLength) {
		int[] product = new int[firstLength + secondLength + 1];
		for (int i = 0; i < firstLength + secondLength + 1; i++)
			product[i] = 0;
		for (int i = 0; i < firstLength; i++) {
			for (int j = 0; j < secondLength; j++)
				product[i+j] += first[i]*second[j];
		}
		

}
}
