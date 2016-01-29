package baekjoon.day20160122;
import java.util.Scanner;

public class P8958___OXQuiz {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			getGrade(sc.next().toCharArray());
		}
	}

	private void getGrade(char[] scoreResult) {
		int grade = 0;
		int tmp = 0;
		for(int i=0; i<scoreResult.length; i++){
			if(scoreResult[i] == 'O'){
				tmp ++;
				grade += tmp;
			} else {
				tmp = 0;
			}
		}
		
		System.out.println(grade);
	}

	public static void main(String[] args) {
		new P8958___OXQuiz().solve();
	}
}
