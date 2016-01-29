package baekjoon.day20160122;
import java.util.Scanner;

public class P5565___Receipt {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		for(int i=0; i<9; i++){
			sum -= sc.nextInt();
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new P5565___Receipt().solve();
	}
}

