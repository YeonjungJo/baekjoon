package baekjoon.solve;
import java.util.Scanner;

public class P11966___SquareOf2 {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String bin = Integer.toBinaryString(sc.nextInt());
		System.out.println(bin.length() - bin.replaceAll("1", "").length() > 1 ? 0 : 1);
	}

	public static void main(String[] args) {
		new P11966___SquareOf2().solve();
	}
}
