package baekjoon.solve;
import java.math.BigDecimal;
import java.util.Scanner;

public class P10827___APowB {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		BigDecimal a = new BigDecimal(sc.next());
		System.out.println(a.pow(sc.nextInt()).toPlainString());
	}

	public static void main(String[] args) {
		new P10827___APowB().solve();
	}
}
