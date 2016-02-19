package baekjoon.todo;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class T01744___WrappingNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int[] data = new int[n];

		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}

		Arrays.sort(data);

		BigInteger result = new BigInteger("0");

		int tmp = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (data[i] > 1 && tmp == 0) {
				tmp += data[i];
			} else if (data[i] > 1 && tmp != 0) {
				result = result.add(BigInteger.valueOf(tmp * data[i]));
				// result += tmp * data[i];
				tmp = 0;
			} else if (data[i] >= 0 && data[i] <= 1 && tmp == 0) {
				result = result.add(BigInteger.valueOf(data[i]));
				// result += data[i];
				tmp = 0;
			} else if (data[i] >= 0 && data[i] <= 1 && tmp != 0) {
				result = result.add(BigInteger.valueOf(tmp));
				// result += tmp;
				tmp = 0;
			} else if (data[i] < 0 && tmp == 0) tmp += data[i];
			else if (data[i] < 0 && tmp != 0) {
				result = result.add(BigInteger.valueOf(tmp * data[i]));
				// result += tmp * data[i];
				tmp = 0;
			}
		}

		// if (tmp != 0) result += tmp;
		if (tmp != 0) result = result.add(BigInteger.valueOf(tmp));

		System.out.println(result);
	}

	public static void main(String[] args) {
		new T01744___WrappingNumber().solve();
	}
}
