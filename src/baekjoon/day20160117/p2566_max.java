package baekjoon.day20160117;
import java.util.Scanner;

public class p2566_max {
	
	private int max = 0;
	private int col;
	private int row;

	private void solve() {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				int input = sc.nextInt();
				if(max < input){
					max = input;
					row = i;
					col = j;
				}
			}
		}
		System.out.println(max);
		System.out.println(row + " " + col);
	}

	public static void main(String[] args) {
		new p2566_max().solve();
	}
}

