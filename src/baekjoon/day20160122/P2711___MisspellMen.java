package baekjoon.day20160122;
import java.util.Scanner;

public class P2711___MisspellMen {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int position = sc.nextInt()-1;
			String word = sc.next();
			for(int j=0; j<word.length(); j++){
				if(j != position) System.out.print(word.charAt(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new P2711___MisspellMen().solve();
	}
}
