package baekjoon.solve;

import java.util.Scanner;

public class P10807___Count {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		sc.nextLine();
		String[] input = sc.nextLine().split(" ");
		String goal = sc.nextLine();
		int cnt = 0;
		for(int i=0; i<input.length; i++) if(input[i].equals(goal)) cnt++;
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new P10807___Count().solve();
	}
}
