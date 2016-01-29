package baekjoon.day20160117;
import java.util.Scanner;

public class p2501_commonFactor {

	private void solve() {
		scan();
	}
	
	private void scan(){
		Scanner sc = new Scanner(System.in);
		operate(sc.nextInt(), sc.nextInt());
	}

	private void operate(int n, int k) {
		int count = 0;
		for(int i=1; i<=n; i++){
			if(n % i == 0) count++;
			if(count == k) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	public static void main(String[] args) {
		new p2501_commonFactor().solve();
	}
}

