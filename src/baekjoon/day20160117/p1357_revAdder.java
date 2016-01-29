package baekjoon.day20160117;
import java.util.Scanner;

public class p1357_revAdder {

	private void solve() {
		scan();
	}
	
	private void scan(){
		Scanner sc = new Scanner(System.in);
		System.out.println(reverse(reverse(sc.nextInt()) + reverse(sc.nextInt()))); 
	}

	private int reverse(int n){
		int result = 0;
		while(n > 0){
			result = result * 10 + n % 10;
			n /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		new p1357_revAdder().solve();
	}
}

