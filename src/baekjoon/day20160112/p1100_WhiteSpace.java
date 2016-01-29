package baekjoon.day20160112;
import java.util.Scanner;

public class p1100_WhiteSpace {

	private void init() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i=0; i<8; i++){
			char[] input = sc.nextLine().toCharArray();
			for(int j=0; j<8; j++){
				if(((i + j)%2 == 0) && input[j] == 'F') count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new p1100_WhiteSpace().init();
	}
}