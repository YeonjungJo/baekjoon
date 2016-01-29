package baekjoon.day20160117;
import java.util.Scanner;

public class p3009_fourthPoint {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		for(int i=0; i<3; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		if(x[0] == x[1]) System.out.print(x[2]);
		else if(x[0] == x[2]) System.out.print(x[1]);
		else System.out.print(x[0]);
		
		System.out.print(" ");
		
		if(y[0] == y[1]) System.out.print(y[2]);
		else if(y[0] == y[2]) System.out.print(y[1]);
		else System.out.print(y[0]);
	}
	
	public static void main(String[] args) {
		new p3009_fourthPoint().solve();
	}
}

