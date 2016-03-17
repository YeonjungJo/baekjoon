package baekjoon.solve;
import java.util.Scanner;

public class P04388___Carry {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 0 && b == 0) return;
			getCarry(a, b);
		}
	}

	private void getCarry(int a, int b) {
		String i = String.format("%010d", a);
		String j = String.format("%010d", b);
		int count = 0;
		int carry = 0;
		for (int k = 9; k >= 0; k--) {
			if (Character.getNumericValue(i.charAt(k)) + Character.getNumericValue(j.charAt(k)) + carry >= 10) {
				count++;
				carry = 1;
			} else {
				carry = 0;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new P04388___Carry().solve();
	}
}
