package baekjoon.day20160117;
import java.util.Scanner;

public class p2490_yut {

	private char[] yut = {'D', 'C', 'B', 'A', 'E'};
	
	private void solve() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++){
			int count = 0;
			for(int j=0; j<4; j++){
				if(sc.nextInt() == 1) count++;
			}
			System.out.println(yut[count]);
		}
	}

	public static void main(String[] args) {
		new p2490_yut().solve();
	}
}

