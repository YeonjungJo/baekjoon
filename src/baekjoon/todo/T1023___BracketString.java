package baekjoon.todo;
import java.util.Scanner;

public class T1023___BracketString {

	private void solve() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long m = sc.nextLong();

		char[] arr = new char[n];
		for (int i = 0; i < n; i++)
			arr[i] = '(';
		
		while (m > 0) {
			if (!next(arr)) {
				System.out.println("-1");
				return;
			}

			String tmp = String.valueOf(arr);
			while (tmp.contains("()"))
				tmp = tmp.replace("()", "");
			if (tmp.length() > 0) m--;
		}
		
		System.out.println(String.valueOf(arr));
	}

	private boolean next(char[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == '(') {
				arr[i] = ')';
				return true;
			} else if (i != 0) {
				arr[i] = '(';
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new T1023___BracketString().solve();
	}
}
