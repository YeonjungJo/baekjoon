package baekjoon.solve;
import java.util.Scanner;

public class P10873___HowToQuestion {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			query(Integer.parseInt(sc.nextLine()), sc.nextLine());
		}
	}

	private void query(int number, String keyword) {
		switch (number) {
		case 1:
			System.out.printf("how to install %s\n", keyword);
			return;
		case 2:
			System.out.printf("what is %s\n", keyword);
			return;
		case 3:
			System.out.printf("%s not working\n", keyword);
			return;
		case 4:
			System.out.printf("why use %s\n", keyword);
			return;
		case 5:
			System.out.printf("who use %s\n", keyword);
			return;
		case 6:
			System.out.printf("disadvantages of %s\n", keyword);
			return;
		case 7:
			System.out.printf("advantages of %s\n", keyword);
			return;
		case 8:
			System.out.printf("%s open source projects\n", keyword);
			return;
		case 9:
			System.out.printf("%s tutorial\n", keyword);
			return;
		case 10:
			System.out.printf("%s performance\n", keyword);
			return;
		case 11:
			System.out.printf("%s sucks\n", keyword);
			return;
		case 12:
			System.out.printf("getting started %s\n", keyword);
			return;
		case 14:
			System.out.printf("%s reference\n", keyword);
			return;
		case 15:
			System.out.printf("%s solution\n", keyword);
			return;
		case 16:
			System.out.printf("%s example code\n", keyword);
			return;
		case 17:
			System.out.printf("difference between %s and C++\n", keyword);
			return;
		case 18:
			System.out.printf("%s site:acmicpc.net\n", keyword);
			return;
		case 19:
			System.out.printf("%s filetype:pdf\n", keyword);
			return;
		case 20:
			System.out.printf("%s slides\n", keyword);
			return;
		case 21:
			System.out.printf("how to make %s\n", keyword);
			return;
		case 22:
			System.out.printf("%s jobs\n", keyword);
			return;
		case 23:
			System.out.printf("%s time\n", keyword);
			return;
		case 24:
			System.out.printf("best os x %s app\n", keyword);
			return;
		default:
			System.out.println(keyword);
			return;
		}

	}

	public static void main(String[] args) {
		new P10873___HowToQuestion().solve();
	}
}
