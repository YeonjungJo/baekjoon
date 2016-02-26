package baekjoon.solve;
import java.util.Scanner;

public class P10569___Polyhedra {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			System.out.println(2 - sc.nextInt() + sc.nextInt());
		}
	}

	public static void main(String[] args) {
		new P10569___Polyhedra().solve();
	}
}
