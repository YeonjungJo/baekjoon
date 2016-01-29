package baekjoon.day20160122;
import java.util.Scanner;

public class P2869___SnailWannaGoUp {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
		int down = sc.nextInt();
		int goal = sc.nextInt();
		
		int current = up;
		int day = 1;
		for(; current < goal ; day++){
			current -= down;
			current += up;
		}
		
		System.out.println(day);
	}

	public static void main(String[] args) {
		new P2869___SnailWannaGoUp().solve();
	}
}

