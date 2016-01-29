package baekjoon.day20160117;
import java.util.Scanner;

public class p7567_bowl {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		
		char[] input = sc.nextLine().toCharArray();
		
		int height = 10;
		char tmp = input[0];
		
		for (int i = 1; i < input.length; i++) {
			if(input[i] == input[i-1]) height += 5;
			else {
				height += 10;
				tmp = input[i];
			}
		}
		
		System.out.println(height);
	}

	public static void main(String[] args) {
		new p7567_bowl().solve();
	}
}
