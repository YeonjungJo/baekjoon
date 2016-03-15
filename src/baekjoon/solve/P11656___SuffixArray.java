package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P11656___SuffixArray {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String s = sc.nextLine();
		String[] suffix = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			suffix[i] = s.substring(i);
		}
		Arrays.sort(suffix);
		for(int i=0; i<s.length(); i++){
			System.out.println(suffix[i]);
		}
	}

	public static void main(String[] args) {
		new P11656___SuffixArray().solve();
	}
}
