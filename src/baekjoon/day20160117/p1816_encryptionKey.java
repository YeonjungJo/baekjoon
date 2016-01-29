package baekjoon.day20160117;
import java.util.Scanner;

public class p1816_encryptionKey {

	private void solve() {
		scan();
	}
	
	private void scan(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			if(operate(sc.nextLong())) System.out.println("YES");
			else System.out.println("NO");
		}
	}

	private boolean operate(long input) {
		for(long i=2; i<= Math.pow(10, 6); i++){
			if(input % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new p1816_encryptionKey().solve();
	}
}

