import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		boolean[] n = new boolean[b.subtract(a).intValue() + 1];
		
		
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}