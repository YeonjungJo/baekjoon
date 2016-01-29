package baekjoon.day20160122;
import java.util.Scanner;

public class P5724___Feynman {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int size = sc.nextInt();
			if(size == 0) return;
			
			int count = 0;
			for (int i = 1; i <= size; i++) {
				count += i * i;
			}
			
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		new P5724___Feynman().solve();
	}
}
