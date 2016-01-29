package baekjoon.day20160117;
import java.util.Scanner;

public class p2747_fibonacci {
	
	private int[] fibo= new int[46];

	private void solve() {
		Scanner sc = new Scanner(System.in);

		fibo[0] = 0;
		fibo[1] = 1;
		
		int n = sc.nextInt();
		
		System.out.println(fibo(n));
	}
	
	private int fibo(int i){
		if(i == 0) return 0;
		if(i == 1) return 1;
		if(fibo[i] != 0) return fibo[i];
		
		fibo[i] = fibo(i-2) + fibo(i-1);
		
		return fibo[i];
	}

	public static void main(String[] args) {
		new p2747_fibonacci().solve();
	}
}

