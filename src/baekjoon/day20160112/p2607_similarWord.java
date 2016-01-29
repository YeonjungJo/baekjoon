package baekjoon.day20160112;
import java.util.Scanner;

public class p2607_similarWord {

	private void init() {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		String standard = sc.next();

		int count = 0;

		for (int i = 0; i < testcase - 1; i++) {
			if (operate(standard, sc.next())) count++;
		}
		System.out.println(count);
	}

	private boolean operate(String standard, String input) {
		String x = standard.length() <= input.length() ? standard : input;
		String y = standard.length() > input.length() ? standard : input;
		
		if (y.length() - x.length() > 1) return false;
		for (int i = 0; i < x.length(); i++) {
			CharSequence tmp = x.subSequence(i, i + 1);
			if (y.contains(tmp)) y = y.replaceFirst((String) tmp, "");
		}
		if (y.length() <= 1) return true;
		return false;
	}

	public static void main(String[] args) {
		new p2607_similarWord().init();
	}
}
