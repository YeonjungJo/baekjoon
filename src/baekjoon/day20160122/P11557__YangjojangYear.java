package baekjoon.day20160122;
import java.util.Scanner;

public class P11557__YangjojangYear {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String univ = "";
			int max = 0;
			for (int j = 0; j < n; j++) {
				String tmp = sc.next();
				int drink = sc.nextInt();
				if(max < drink) { 
					univ = tmp;
					max = drink;
				}
			}
			System.out.println(univ);
		}
	}

	public static void main(String[] args) {
		new P11557__YangjojangYear().solve();
	}
}
