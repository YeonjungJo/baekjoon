package baekjoon.day20160117;
import java.util.Scanner;

public class p2562_max {
	
	private int max = 0;
	private int index;

	private void solve() {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=9; i++){
			int input = sc.nextInt();
			if(max < input){
				max = input;
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
	
	public static void main(String[] args) {
		new p2562_max().solve();
	}
}

