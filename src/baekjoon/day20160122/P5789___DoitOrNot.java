package baekjoon.day20160122;
import java.util.Scanner;

public class P5789___DoitOrNot {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			char[] input = sc.next().toCharArray();
			if(input[input.length/2 -1] == input[input.length/2]) System.out.println("Do-it");
			else System.out.println("Do-it-Not");
		}
	}

	public static void main(String[] args) {
		new P5789___DoitOrNot().solve();
	}
}

