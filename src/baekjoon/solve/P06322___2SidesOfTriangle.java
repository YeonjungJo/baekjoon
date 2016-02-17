package baekjoon.solve;
import java.util.Scanner;

public class P06322___2SidesOfTriangle {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		for (int k = 1;; k++) {
			int[] triangle = new int[3];

			int t = -1;
			for (int i = 0; i < 3; i++) {
				triangle[i] = sc.nextInt();
				if (triangle[i] == -1) t = i;
			}

			if (t == -1) return;

			System.out.println("Triangle #" + k);

			if (t == 0) getAngle('a', triangle[1], triangle[2]);
			if (t == 1) getAngle('b', triangle[0], triangle[2]);
			if (t == 2) getAngle('c', triangle[0], triangle[1]);
			
			System.out.println();
		}
	}

	private void getAngle(char c, int i, int j) {
		double result;

		if (c == 'c') {
			result = Math.sqrt(i * i + j * j);
		} else {
			result = Math.sqrt(j * j - i * i);
		}

		if (Double.isNaN(result)) System.out.println("Impossible.");
		else System.out.printf(c + " = %.3f\n", result);
	}

	public static void main(String[] args) {
		new P06322___2SidesOfTriangle().solve();
	}
}
