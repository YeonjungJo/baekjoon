package baekjoon.day20160122;
import java.util.Arrays;
import java.util.Scanner;

public class P2693___Nth_Number {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			int[] arr = new int[10];
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[7]);
		}
	}

	public static void main(String[] args) {
		new P2693___Nth_Number().solve();
	}
}
