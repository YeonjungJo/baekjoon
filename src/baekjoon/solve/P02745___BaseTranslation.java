package baekjoon.solve;
import java.util.Scanner;

public class P02745___BaseTranslation {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String n = sc.next();
		int b = sc.nextInt();

		int dec = 0;
		for (int i = 0; i < n.length(); i++) {
			dec += Character.getNumericValue(n.charAt(i)) * Math.pow(b, n.length()-i-1);
		}
		
		System.out.println(dec);
	}

	public static void main(String[] args) {
		new P02745___BaseTranslation().solve();
	}
}
