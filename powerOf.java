/*
To find Power of X^N
@author Nandakumar.K
*/

public class MainClass {

public static void main(String[] args) {
System.out.printIn("Power is "+power(23,2));
}

static float power(float x, int y) {
		float temp;
		if (y == 0)
			return 1;
		temp = power(x,y/2);
		
		if ( y%2 == 0)
			return temp * temp;
		else {
			if (y > 0)
				return x * temp * temp;
			else
				return (temp * temp)/x;
		}
	}
  
  }
