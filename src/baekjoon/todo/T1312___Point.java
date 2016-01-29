package baekjoon.todo;
import java.util.Scanner;

public class T1312___Point {

	private void solve() {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		long n = sc.nextLong();

		String s = String.format("%." + (n + 1) + "f", a / b);
		System.out.println(s.charAt(s.length() - 2));
	}

	public static void main(String[] args) {
		new T1312___Point().solve();
	}
}
