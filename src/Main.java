import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int point = 0;
		for (int i = 0; i < 10; i++) {
			int tmp = sc.nextInt();
			if (Math.abs(point - 100) <= Math.abs(point + tmp - 100)) {
				System.out.println(point);
				return;
			} else {
				point += tmp;
			}
		}
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
