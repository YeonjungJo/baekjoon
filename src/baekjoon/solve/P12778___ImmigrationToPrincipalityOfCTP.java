package baekjoon.solve;
import java.util.Scanner;

public class P12778___ImmigrationToPrincipalityOfCTP {

	private static final Scanner sc = new Scanner(System.in);

	enum Operator {
		C, N;
	}

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int n = sc.nextInt();

			StringBuilder result = new StringBuilder();
			switch (Operator.valueOf(sc.next())) {
			case C:
				for (int i = 0; i < n; i++) {
					result.append(sc.next().toCharArray()[0] - 'A' + 1);
					result.append(" ");
				}
				break;
			case N:
				for (int i = 0; i < n; i++) {
					result.append((char) (sc.nextInt() + 'A' - 1));
					result.append(" ");
				}
				break;
			}
			System.out.println(result.toString());
		}
	}

	public static void main(String[] args) {
		new P12778___ImmigrationToPrincipalityOfCTP().solve();
	}
}
