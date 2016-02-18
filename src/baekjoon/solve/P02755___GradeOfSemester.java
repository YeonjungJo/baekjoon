package baekjoon.solve;
import java.util.Scanner;

public class P02755___GradeOfSemester {

	private static final Scanner sc = new Scanner(System.in);
	private static final String GRADE = "FDCBA";

	private void solve() {
		int n = sc.nextInt();

		double grade = 0;
		int totalCredit = 0;

		for (int i = 0; i < n; i++) {
			sc.next();
			int credit = sc.nextInt();
			String result = sc.next();

			totalCredit += credit;
			grade += getGrade(credit, result);
		}

		System.out.printf("%.2f", grade / totalCredit);
	}

	private double getGrade(int credit, String result) {
		double grade;
		if (result.equals("F")) grade = 0.0;
		else {
			grade = GRADE.indexOf(result.charAt(0));
			switch (result.charAt(1)) {
			case '+':
				grade += 0.3;
				break;
			case '-':
				grade -= 0.3;
				break;
			}
		}
		return grade * credit;
	}

	public static void main(String[] args) {
		new P02755___GradeOfSemester().solve();
	}
}
