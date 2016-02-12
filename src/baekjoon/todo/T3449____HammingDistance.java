package baekjoon.todo;
import java.util.Scanner;

public class T3449____HammingDistance {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int t = sc.nextInt();
		for (int testcase = 0; testcase < t; testcase++) {
			char[] a = sc.next().toCharArray();
			char[] b = sc.next().toCharArray();
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) cnt++;
			}
			System.out.println("Hamming distance is " + cnt);
		}
	}

	public static void main(String[] args) {
		new T3449____HammingDistance().solve();
	}
}
