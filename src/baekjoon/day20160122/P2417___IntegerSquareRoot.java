package baekjoon.day20160122;
import java.util.Scanner;

public class P2417___IntegerSquareRoot {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		double result = Math.sqrt(sc.nextLong());
		System.out.println(result == (long) result? (long)result : (long) result + 1);
	}

	public static void main(String[] args) {
		new P2417___IntegerSquareRoot().solve();
	}
}
