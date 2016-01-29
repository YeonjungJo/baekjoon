package baekjoon.day20160122;
import java.util.Scanner;

public class P9506 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int t = sc.nextInt();
			if (t == -1) return;
			else {
				isPerfect(t);
			}
		}
	}

	private void isPerfect(int t) {
		StringBuilder strBuilder = new StringBuilder(t + " = 1");
		StringBuilder strBuilderLast = new StringBuilder();
		int sum = 1;

		for (int i = 2; i <= Math.sqrt(t); i++) {
			if (t % i == 0) {
				strBuilder.append(" + " + i);
				strBuilderLast.insert(0, " + " + (t / i));
				sum += i + (t / i);
			}
		}
		
		if(sum == t){
			System.out.println(strBuilder.toString() + strBuilderLast.toString());
		} else{
			System.out.println(t + " is NOT perfect.");
		}
			
	}

	public static void main(String[] args) {
		new P9506().solve();
	}
}
