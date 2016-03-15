import java.util.Scanner;

public class P01731___Inference {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int p;

		boolean isArithmeticProgression;
		if (b - a == c - b) {
			isArithmeticProgression = true;
			p = b - a;
		} else {
			isArithmeticProgression = false;
			p = b / a;
		}

		if (isArithmeticProgression) System.out.println(a + n * p);
		else System.out.println(a * (int) Math.pow(p, n));
	}

	public static void main(String[] args) {
		new P01731___Inference().solve();
	}
}
