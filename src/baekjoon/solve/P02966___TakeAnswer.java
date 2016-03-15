package baekjoon.solve;
import java.util.Scanner;

public class P02966___TakeAnswer {

	private static final Scanner sc = new Scanner(System.in);

	private static final String ADRIAN = "ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABC";
	private static final String BRUNO = "BABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBAB";
	private static final String GORAN = "CCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBC";

	private void solve() {
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int g = 0;

		String solution = sc.next();
		for (int i = 0; i < n; i++) {
			if (solution.charAt(i) == ADRIAN.charAt(i)) a++;
			if (solution.charAt(i) == BRUNO.charAt(i)) b++;
			if (solution.charAt(i) == GORAN.charAt(i)) g++;
		}

		if (a > b) {
			if (a > g) System.out.printf("%d\n%s\n", a, "Adrian");
			if (a < g) System.out.printf("%d\n%s\n", g, "Goran");
			if (a == g) System.out.printf("%d\n%s\n%s\n", a, "Adrian", "Goran");
		} else if (a == b) {
			if (a > g) System.out.printf("%d\n%s\n%s\n", a, "Adrian", "Bruno");
			if (a < g) System.out.printf("%d\n%s\n", g, "Goran");
			if (a == g) System.out.printf("%d\n%s\n%s\n%s\n", a, "Adrian", "Bruno", "Goran");
		} else {
			if (b > g) System.out.printf("%d\n%s\n", b, "Bruno");
			if (b < g) System.out.printf("%d\n%s\n", g, "Goran");
			if (b == g) System.out.printf("%d\n%s\n%s\n", b, "Bruno", "Goran");
		}
	}

	public static void main(String[] args) {
		new P02966___TakeAnswer().solve();
	}
}
