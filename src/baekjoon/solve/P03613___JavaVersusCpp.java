package baekjoon.solve;
import java.util.Scanner;

public class P03613___JavaVersusCpp {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();

		if (s.matches("[^a-zA-Z_]")) {
			System.out.println("Error!");
			return;
		}

		if (s.toLowerCase().equals(s)) toJava(s);
		else toC(s);
	}

	private void toC(String s) {
		if (s.contains("_") || Character.isUpperCase(s.charAt(0))) {
			System.out.println("Error!");
			return;
		}
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) strBuilder.append("_");
			strBuilder.append(s.charAt(i));
		}
		System.out.println(strBuilder.toString().toLowerCase());
	}

	private void toJava(String s) {
		if (s.charAt(0) == '_' || s.charAt(s.length() - 1) == '_' || s.contains("__")) {
			System.out.println("Error!");
			return;
		}
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '_') strBuilder.append(Character.toUpperCase(s.charAt(++i)));
			else strBuilder.append(s.charAt(i));
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P03613___JavaVersusCpp().solve();
	}
}
