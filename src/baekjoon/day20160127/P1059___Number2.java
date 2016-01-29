package baekjoon.day20160127;
import java.util.Arrays;
import java.util.Scanner;

public class P1059___Number2 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] lucky = new int[l];
		for (int i = 0; i < l; i++) {
			lucky[i] = sc.nextInt();
		}
		int n = sc.nextInt();

		Arrays.sort(lucky);

		if(lucky[0] > n){
			System.out.println(n * (lucky[0] - n) - 1);
			return;
		}
		
		for (int i = 0; i < l - 1; i++) {
			if (lucky[i] == n || lucky[i+1] == n) {
				System.out.println("0");
				return;
			}
			if (lucky[i] < n && lucky[i + 1] > n) {
				System.out.println((n - lucky[i]) * (lucky[i + 1] - n) - 1);
				return;
			}
		}
	}

	public static void main(String[] args) {
		new P1059___Number2().solve();
	}
}
