package baekjoon.solve;
import java.util.Scanner;

public class P10769___WhetherHappyOrSad {

	private static final Scanner sc = new Scanner(System.in);

	private static final String HAPPY = ":-[)]";
	private static final String SAD = ":-[(]";

	private void solve() {
		String s = sc.nextLine();
		int happy = s.length() - s.replaceAll(HAPPY, "").length();
		int sad = s.length() - s.replaceAll(SAD, "").length();

		if (happy == sad && happy == 0) System.out.println("none");
		else if (happy == sad) System.out.println("unsure");
		else if (happy > sad) System.out.println("happy");
		else if (happy < sad) System.out.println("sad");
	}

	public static void main(String[] args) {
		new P10769___WhetherHappyOrSad().solve();
	}
}
