package baekjoon.solve;
import java.util.Scanner;

public class P5032____Soda {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int e = sc.nextInt() + sc.nextInt();
		int c = sc.nextInt();

		int count = 0;
		
		while (e >= c) {
			count += e / c;
			e = e - ((e / c) * c) + (e / c); 
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		new P5032____Soda().solve();
	}
}
