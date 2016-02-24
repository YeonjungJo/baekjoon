package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P10610___30 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.nextLine();
		int tmp = 0;
		for (int i = 0; i < s.length(); i++) {
			tmp += Character.getNumericValue(s.charAt(i));
		}
		if (!s.contains("0") || tmp % 3 != 0) {
			System.out.println("-1");
			return;
		}

		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		new P10610___30().solve();
	}
}
