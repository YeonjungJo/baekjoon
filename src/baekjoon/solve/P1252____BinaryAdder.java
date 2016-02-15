package baekjoon.solve;
import java.util.Scanner;

public class P1252____BinaryAdder {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		char[] a = String.format("%80s", sc.next()).toCharArray();
		char[] b = String.format("%80s", sc.next()).toCharArray();

		StringBuilder strBuilder = new StringBuilder();
		int carry = 0;

		for (int k = 79; k >= 0; k--) {
			int i = a[k] == ' ' ? 0 : Character.getNumericValue(a[k]);
			int j = b[k] == ' ' ? 0 : Character.getNumericValue(b[k]);
			int sum = i + j + carry;
			if (sum > 1) {
				carry = 1;
				sum -= 2;
			} else {
				carry = 0;
			}
			strBuilder.insert(0, sum);
		}
		
		strBuilder.insert(0, carry);
		
		String result = strBuilder.toString().replaceFirst("([0]+1)", "1");
		if(!result.contains("1")) System.out.println("0");
		else System.out.println(result);
	}

	public static void main(String[] args) {
		new P1252____BinaryAdder().solve();
	}
}
