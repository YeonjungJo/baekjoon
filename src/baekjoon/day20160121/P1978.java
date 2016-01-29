package baekjoon.day20160121;
import java.util.Scanner;

public class P1978 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i=0; i<n; i++){
			if(isPrime(sc.nextInt())) count++;
		}
		
		System.out.println(count);
	}

	private boolean isPrime(int input) {
		if(input <= 1) return false;
		for(int i=2; i<=Math.sqrt(input); i++){
			if(input % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new P1978().solve();
	}
}

