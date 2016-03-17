package baekjoon.solve;
import java.util.Scanner;

public class P05586___JoiAndIoi {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.next();
		int joi = (s.length() - s.replaceAll("JOI", "").length()) / 3;
		int ioi = 0;
		while (s.contains("IOI")) {
			s = s.replaceFirst("IOI", "I");
			ioi++;
		}
		System.out.println(joi);
		System.out.println(ioi);
	}

	public static void main(String[] args) {
		new P05586___JoiAndIoi().solve();
	}
}
