package baekjoon.day20160128;
import java.util.Scanner;

public class P8741___SumBinary {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		StringBuilder strBuilder = new StringBuilder();
		for(int i=0; i<k; i++){
			strBuilder.append(1);
		}
		for(int i=1; i<k; i++){
			strBuilder.append(0);
		}
		System.out.println(strBuilder.toString());
	}

	public static void main(String[] args) {
		new P8741___SumBinary().solve();
	}
}

