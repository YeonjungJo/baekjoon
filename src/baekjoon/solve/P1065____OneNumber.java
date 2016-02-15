package baekjoon.solve;
import java.util.Scanner;

public class P1065____OneNumber {

	private static final Scanner sc = new Scanner(System.in);

	private static final int[] DATA = { 
			111, 123, 135, 147, 159, 
			210, 222, 234, 246, 258,
			321, 333, 345, 357, 369, 
			420, 432, 444, 456, 468, 
			531, 543, 555, 567, 579, 
			630, 642, 654, 666, 678, 
			741, 753, 765, 777, 789,
			840, 852, 864, 876, 888, 
			954, 963, 975, 987, 999 };

	private void solve() {
		int n = sc.nextInt();
		int result = 99;
		if (n < 100) result = n;
		else {
			for(int i=0; i < DATA.length ;i++){
				if(n >= DATA[i]) result ++;
				else break;
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		new P1065____OneNumber().solve();
	}
}
