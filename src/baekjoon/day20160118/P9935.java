package baekjoon.day20160118;
import java.util.Scanner;

public class P9935 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String segment = sc.nextLine();

		while (input.contains(segment)) {
			input = input.replace(segment, "");
		}
	
		if(input.equals("")) System.out.println("FRULA");
		else System.out.println(input);
	}

	public static void main(String[] args) {
		new P9935().solve();
	}
}
