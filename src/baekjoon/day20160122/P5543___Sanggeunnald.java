package baekjoon.day20160122;
import java.util.Scanner;

public class P5543___Sanggeunnald {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int hamburger = 2001;
		int juice = 2001;
		
		for(int i=0; i<3; i++){
			int tmp = sc.nextInt();
			if(tmp < hamburger) hamburger = tmp;
		}
		
		for(int i=0; i<2; i++){
			int tmp = sc.nextInt();
			if(tmp < juice) juice = tmp;
		}
		
		System.out.println(hamburger + juice - 50);
	}

	public static void main(String[] args) {
		new P5543___Sanggeunnald().solve();
	}
}

