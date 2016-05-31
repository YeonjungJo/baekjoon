package baekjoon.todo;
import java.util.Scanner;

public class T05710___EnergyCharge {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			if (a == 0 && b == 0) return;

			long consumption = getConsumption(a);

			System.out.println(binarySearch(b, consumption, 0, consumption / 2));
		}
	}

	private long binarySearch(long dif, long total, long start, long end) {
		if (start > end) return -1;
		long k = (start + end) / 2;

		long x = getCharge(total - k);
		long y = getCharge(k);
		if (x - y > dif) return binarySearch(dif, total, k + 1, end);
		if (x - y < dif) return binarySearch(dif, total, start, k - 1);
		return y;
	}

	private long getCharge(long a) {
		if (a <= 100) return a * 2;
		a -= 100;
		if (a <= 9900) return 200 + a * 3;
		a -= 9900;
		if (a <= 990000) return 29900 + a * 5;
		a -= 990000;
		return 524900 + a * 7;
	}

	private long getConsumption(long a) {
		if (a <= 200) return a / 2;
		a -= 200;
		if (a <= 29700) return 100 + a / 3;
		a -= 29700;
		if (a <= 495000) return 10000 + a / 5;
		a -= 495000;
		return 1000000 + a / 7;
	}

	public static void main(String[] args) {
		new T05710___EnergyCharge().solve();
	}
}
