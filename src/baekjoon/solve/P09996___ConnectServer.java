package baekjoon.solve;

import java.util.Scanner;

public class P09996___ConnectServer {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		String regex = sc.next().replace("*", "[a-z]*");
		for (int t = 0; t < testcase; t++) {
			if(sc.next().matches(regex)) System.out.println("DA");
			else System.out.println("NE");
		}
	}

	public static void main(String[] args) {
		new P09996___ConnectServer().solve();
	}
}
