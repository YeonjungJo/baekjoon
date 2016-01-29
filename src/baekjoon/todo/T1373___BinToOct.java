package baekjoon.todo;

import java.util.Scanner;

public class T1373___BinToOct {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		char[] s = (new StringBuffer(sc.nextLine())).reverse().toString().toCharArray();
		StringBuilder oct = new StringBuilder();

		int number = 0;

		for (int i = 0; i < s.length; i++) {
			int k = i % 3;
			if(k == 0) number = 0;
			number += Character.getNumericValue(s[i]) * Math.pow(2, k);
			if(k == 2 || i == s.length -1) oct.insert(0, number);
		}
		System.out.println(oct.toString());

	}

	public static void main(String[] args) {
		new T1373___BinToOct().solve();
	}
}