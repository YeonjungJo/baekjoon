package baekjoon.todo;
import java.util.Scanner;

public class T09095___123Sum {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		int[] d = { 0, 1, 2, 4, 7, 12, 24, 44, 81, 149, 274 };
		for (int i = 0; i < testcase; i++)
			System.out.println(d[sc.nextInt()]);
	}

	public static void main(String[] args) {
		new T09095___123Sum().solve();
	}
}
