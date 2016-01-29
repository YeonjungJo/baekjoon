package baekjoon.day20160122;
import java.util.Scanner;

public class P5354___JBox {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
			printJBox(sc.nextInt());
		}
	}

	private void printJBox(int size) {
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(i == 0 || j == 0 || i == size-1 || j == size-1){
					System.out.print("#");
				} else {
					System.out.print("J");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new P5354___JBox().solve();
	}
}

