import java.util.Arrays;
import java.util.Scanner;

public class P11399___ATM {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i] * (n - i);
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		new P11399___ATM().solve();
	}
}
