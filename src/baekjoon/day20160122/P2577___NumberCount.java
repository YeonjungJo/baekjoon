package baekjoon.day20160122;
import java.util.Scanner;

public class P2577___NumberCount {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		char[] result = Integer.toString(sc.nextInt() * sc.nextInt() * sc.nextInt()).toCharArray();
		int[] cnt = new int[10];
		
		for(int i=0; i<result.length; i++){
			cnt[Character.getNumericValue(result[i])]++;
		}
		
		for(int i=0; i<=9; i++){
			System.out.println(cnt[i]);
		}
	}

	public static void main(String[] args) {
		new P2577___NumberCount().solve();
	}
}
