package baekjoon.day20160117;
import java.util.Scanner;

public class p2506_calculateGrade {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int grade = 0;
		int cnt = 0;
		
		for(int i=0; i<n; i++){
			int input = sc.nextInt();
			if(input == 0) cnt = 0;
			else {
				cnt ++;
				grade += cnt;
			}
		}
		
		System.out.println(grade);
	}

	public static void main(String[] args) {
		new p2506_calculateGrade().solve();
	}
}

