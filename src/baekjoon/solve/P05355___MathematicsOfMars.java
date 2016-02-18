package baekjoon.solve;
import java.util.Scanner;

public class P05355___MathematicsOfMars {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 0; t < testcase; t++) {
			String[] s = sc.nextLine().split(" ");
			double result = Double.parseDouble(s[0]);
			for (int i = 1; i < s.length; i++) {
				if (s[i].equals("@")) result *= 3;
				if (s[i].equals("%")) result += 5;
				if (s[i].equals("#")) result -= 7;
			}

			System.out.printf("%.02f\n", result);
		}
	}

	public static void main(String[] args) {
		new P05355___MathematicsOfMars().solve();
	}
}
