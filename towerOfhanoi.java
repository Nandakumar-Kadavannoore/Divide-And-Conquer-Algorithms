/*
Solution for Tower of Hanoi
@author Nandakumar,K
*/

public class MainClass {

	public static void main(String[] args) {
		towerOfHanoi(5, 'A', 'C', 'B');
	}
	
	static void towerOfHanoi(int n, char from, char to, char temp) {
		if (n == 1) {
			System.out.println("Disk 1 Moved from "+ from + " to " + to);
			return;
		}
		towerOfHanoi(n - 1, from, temp, to);
		System.out.println("Disk Moved from "+n+" from rod "+ to);
		towerOfHanoi(n - 1, temp, to, from);
	}	
}
