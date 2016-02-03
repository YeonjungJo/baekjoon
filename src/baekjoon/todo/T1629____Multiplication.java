package baekjoon.todo;
import java.util.Scanner;

public class T1629____Multiplication {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		long result = a;
		for (int i = 0; i < b; i++) {
			result = (result * a) % c;
		}

		System.out.println((int) result);
	}

	public static void main(String[] args) {
		new T1629____Multiplication().solve();
	}
}
