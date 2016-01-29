package baekjoon.day20160122;
import java.util.Scanner;

public class P10797__10thDayNoDrivingSystem {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int cnt = 0;
		for(int i=0; i<5; i++){
			if(date == sc.nextInt()) cnt++;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new P10797__10thDayNoDrivingSystem().solve();
	}
}

