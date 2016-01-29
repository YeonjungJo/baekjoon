package baekjoon.day20160127;

import java.util.Scanner;

public class P1676___Factorial0Count {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		int two = 0;
		int five = 0;

		for (int i = 2; i <= n; i++) {
			two += getElement(i, 2);
			five += getElement(i, 5);
		}
		
		System.out.println(two > five ? five : two);
	}

	private int getElement(int i, int element) {
		int count = 0;
		while(i > 0){
			if(i % element == 0){
				count++;
				i /= element;
			}
			else return count;
		}
		return 0;
	}

	public static void main(String[] args) {
		new P1676___Factorial0Count().solve();
	}
}
