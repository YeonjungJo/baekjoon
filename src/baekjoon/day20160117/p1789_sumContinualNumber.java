package baekjoon.day20160117;
import java.util.Scanner;

public class p1789_sumContinualNumber {

	private void solve() {
		scan();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		operate(sc.nextLong());
	}

	private void operate(long input) {
		long result = (long) ((Math.sqrt(1 + input * 8) - 1)/2);
		System.out.println(result);
	}

	public static void main(String[] args) {
		new p1789_sumContinualNumber().solve();
	}
}
