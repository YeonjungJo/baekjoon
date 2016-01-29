package baekjoon.day20160122;
import java.util.Scanner;

public class P2953___ImCook {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		
		int winner = -1;
		int point = -1;
		
		for (int i = 1; i <= 5; i++) {
			int tmp = 0;
			for (int j = 0; j < 4; j++) {
				tmp += sc.nextInt();
			}
			if(tmp > point){
				point = tmp;
				winner = i;
			}
		}
		
		System.out.println(winner + " " + point);
	}

	public static void main(String[] args) {
		new P2953___ImCook().solve();
	}
}
