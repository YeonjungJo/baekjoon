package baekjoon.solve;
import java.util.Scanner;

public class P12813___BinaryOperation {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();

		StringBuilder and = new StringBuilder();
		StringBuilder or = new StringBuilder();
		StringBuilder xor = new StringBuilder();
		StringBuilder nota = new StringBuilder();
		StringBuilder notb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			and.append(a[i] == '1' && b[i] == '1' ? 1 : 0);
			or.append(a[i] == '1' || b[i] == '1' ? 1 : 0);
			xor.append(a[i] != b[i] ? 1 : 0);
			nota.append(a[i] == '0' ? 1 : 0);
			notb.append(b[i] == '0' ? 1 : 0);
		}

		System.out.println(and.toString());
		System.out.println(or.toString());
		System.out.println(xor.toString());
		System.out.println(nota.toString());
		System.out.println(notb.toString());
	}

	public static void main(String[] args) {
		new P12813___BinaryOperation().solve();
	}
}
