package baekjoon.day20160122;
import java.util.Scanner;

public class P10039__Average {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		
		int grade = 0;
		
		for(int i=0; i<5; i++){
			int tmp = sc.nextInt();
			grade += tmp > 40 ? tmp : 40;
		}
		
		System.out.println(grade / 5);
	}

	public static void main(String[] args) {
		new P10039__Average().solve();
	}
}

