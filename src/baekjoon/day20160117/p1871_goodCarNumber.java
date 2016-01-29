package baekjoon.day20160117;
import java.util.Scanner;

public class p1871_goodCarNumber {
	
	private static final String TWENTY_SIX = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int i=0; i<testcase; i++){
			String[] input = sc.next().split("-");
			if(discriminant(getValue(input[0]), Integer.parseInt(input[1])))
				System.out.println("nice");
			else {
				System.out.println("not nice");
			}
		}
	}
	
	private boolean discriminant(int i, int j){
		if(Math.abs(i-j) <= 100) return true;
		return false;
	}

	private int getValue(String input) {
		int result = 0;
		for(int i=0; i<input.length(); i++){
			char c = input.charAt(input.length() - i - 1);
			int k = TWENTY_SIX.indexOf(c);
			result += k * Math.pow(26, i);
		}
		return result;
	}

	public static void main(String[] args) {
		new p1871_goodCarNumber().solve();
	}
}

