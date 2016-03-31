package baekjoon.solve;
import java.math.BigDecimal;
import java.util.Scanner;

public class P02052___ExponentationOperation {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		System.out.println(BigDecimal.ONE.divide(BigDecimal.valueOf(2).pow(sc.nextInt())).toPlainString());
	}

	public static void main(String[] args) {
		new P02052___ExponentationOperation().solve();
	}
}
