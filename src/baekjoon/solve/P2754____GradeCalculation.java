package baekjoon.solve;
import java.util.Scanner;

public class P2754____GradeCalculation {

	private static final Scanner sc = new Scanner(System.in);

	private static final String GRADE = "FDCBA";

	private void solve() {
		String input = sc.next();

		double grade = 0;

		if (input.equals("F")) System.out.println(0.0);
		else {
			grade = GRADE.indexOf(input.charAt(0));
			switch (input.charAt(1)) {
			case '+':
				grade += 0.3;
				break;
			case '-':
				grade -= 0.3;
				break;
			}
			System.out.println(String.format("%.1f", grade));
		}
	}

	public static void main(String[] args) {
		new P2754____GradeCalculation().solve();
	}
}
