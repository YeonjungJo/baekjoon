package baekjoon.solve;
import java.util.Scanner;

public class P02576___OddNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int min = 100;
		int sum = 0;
		for (int i = 0; i < 7; i++) {
			int tmp = sc.nextInt();
			if (tmp % 2 == 1) {
				sum += tmp;
				min = min > tmp ? tmp : min;
			}
		}
		if(sum != 0){
			System.out.println(sum);
			System.out.println(min);
		} else{
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		new P02576___OddNumber().solve();
	}
}
