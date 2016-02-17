package baekjoon.solve;
import java.util.Scanner;

public class P05086___DivisorAndMultiple {

	private static final Scanner sc = new Scanner(System.in);
	
	private void solve() {
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) return;
			
			if(b % a == 0) System.out.println("factor");
			else if(a % b == 0) System.out.println("multiple");
			else System.out.println("neither");
			
		}
	}

	public static void main(String[] args) {
		new P05086___DivisorAndMultiple().solve();
	}
}
