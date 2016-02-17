package baekjoon.solve;
import java.util.Scanner;

public class P09012___Bracket {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String s = sc.next();
			while(true){
				if(s.contains("()")) s = s.replace("()", "");
				else if(s.length() == 0){
					System.out.println("YES");
					break;
				} else {
					System.out.println("NO");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		new P09012___Bracket().solve();
	}
}
