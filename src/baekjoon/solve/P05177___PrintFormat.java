package baekjoon.solve;
import java.util.Scanner;

public class P05177___PrintFormat {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = Integer.parseInt(sc.nextLine());
		for (int t = 1; t <= testcase; t++) {
			String a = sc.nextLine().toLowerCase().replaceAll("[ ]+", " ").replaceAll("^[ ]+|[ ]+$", "");
			String b = sc.nextLine().toLowerCase().replaceAll("[ ]+", " ").replaceAll("^[ ]+|[ ]+$", "");
			a = a.replace("{", "-").replace("[", "-").replace("(", "-").replace(")", "_").replace("]", "_").replace("}", "_").replace(",", ";");
			b = b.replace("{", "-").replace("[", "-").replace("(", "-").replace(")", "_").replace("]", "_").replace("}", "_").replace(",", ";");
			a = a.replaceAll("[ ]*-[ ]*", "-").replaceAll("[ ]*_[ ]*", "_").replaceAll("[ ]*;[ ]*", ";");
			b = b.replaceAll("[ ]*-[ ]*", "-").replaceAll("[ ]*_[ ]*", "_").replaceAll("[ ]*;[ ]*", ";");
			a = a.replaceAll("[ ]*[.][ ]*", ".").replaceAll("[ ]*[:][ ]*", ":");
			b = b.replaceAll("[ ]*[.][ ]*", ".").replaceAll("[ ]*[:][ ]*", ":");

			System.out.printf("Data Set %d: %s\n\n", t, a.equals(b) ? "equal" : "not equal");
		}
	}

	public static void main(String[] args) {
		new P05177___PrintFormat().solve();
	}
}
