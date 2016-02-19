import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] file = new int[n];
		for (int i = 0; i < n; i++) {
			file[i] = sc.nextInt();
		}
		float cluster = sc.nextInt();

		int count = 0;
		for (int i = 0; i < n; i++) {
			count += Math.ceil(file[i] / cluster);
		}

		System.out.println(cluster * count);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
