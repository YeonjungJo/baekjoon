import java.util.Scanner;

public class P02875___ContestAndIntern {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int female = sc.nextInt();
		int male = sc.nextInt();
		int intern = sc.nextInt();

		if (2 * male > female) {
			int t = male - female / 2;
			male -= t;
			intern -= t;
		} else if (2 * male < female) {
			int t = female - 2 * male;
			female -= t;
			intern -= t;
		}
		if (female % 2 == 1) {
			female--;
			intern--;
		}

//		System.out.printf("female : %d, male : %d, intern : %d\n", female, male, intern);

		if (intern > 0) {
			System.out.println((int) (male - (intern / 3.0)));
		} else {
			System.out.println(male);
		}
	}

	public static void main(String[] args) {
		new P02875___ContestAndIntern().solve();
	}
}
