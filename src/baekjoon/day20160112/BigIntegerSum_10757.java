package baekjoon.day20160112;
import java.util.Scanner;

public class BigIntegerSum_10757 {

	private char[] a = new char[10001];
	private char[] b = new char[10001];
	private int[] result;
	private int size;

	public BigIntegerSum_10757() {
		scan();
		result();
		for (int i = result.length - 1; i > 0; i--) {
			if(i == result.length - 1 && result[i] == 0) continue;
			System.out.print(result[i]);
		}
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		a = sc.next().toCharArray();
		b = sc.next().toCharArray();
		size = a.length > b.length ? a.length : b.length;
		result = new int[size + 2];
	}

	private int carry = 0;

	private void result() {
		for (int i = 1; i <= size; i++) {
			int partA = 0;
			int partB = 0;
			if (a.length >= i) partA = Character.getNumericValue(a[a.length - i]);
			if (b.length >= i) partB = Character.getNumericValue(b[b.length - i]);
			
			int sum = partA + partB + carry;
			if (sum >= 10) carry = 1;
			else carry = 0;
			result[i] = sum % 10;
		}
		result[size + 1] = carry;
	}

	public static void main(String[] args) {
		new BigIntegerSum_10757();
	}
}