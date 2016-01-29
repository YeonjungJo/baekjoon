package baekjoon.day20160117;
import java.util.Arrays;
import java.util.Scanner;

public class p7510_advancedMath {

	private void solve() {
		scan();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int n = 1; n <= testcase; n++) {
			int[] arr = new int[3];
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			Arrays.sort(arr);
			
			System.out.println("Scenario #" + n+":");
			if (discriminant(arr))
				System.out.println("yes\n");
			else
				System.out.println("no\n");
		}
	}

	private boolean discriminant(int[] arr) {
		double i = Math.pow(arr[0], 2) + Math.pow(arr[1], 2);
		double j = Math.pow(arr[2], 2);

		if (i == j)
			return true;
		return false;
	}

	public static void main(String[] args) {
		new p7510_advancedMath().solve();
	}
}
