package baekjoon.solve;
import java.util.Scanner;

public class P03447___KingOfBug {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		StringBuilder strBuilder = new StringBuilder();
		while (sc.hasNextLine()) {
			strBuilder.append(sc.nextLine() + "\n");
		}

		String s = strBuilder.toString();

		while (s.contains("BUG")) {
			s = s.replaceAll("BUG", "");
		}
		
		System.out.println(s);
	}

	public static void main(String[] args) {
		new P03447___KingOfBug().solve();
	}
}
