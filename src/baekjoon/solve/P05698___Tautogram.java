package baekjoon.solve;
import java.util.Scanner;

public class P05698___Tautogram {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (true) {
			String s = sc.nextLine().toLowerCase();
			if (s.equals("*")) return;

			isTautogram(s.split(" "), s.charAt(0));
		}
	}

	private void isTautogram(String[] s, char c) {
		for(int i=1; i<s.length; i++){
			if(s[i].charAt(0) != c){
				System.out.println("N");
				return;
			}
		}
		System.out.println("Y");
	}

	public static void main(String[] args) {
		new P05698___Tautogram().solve();
	}
}
