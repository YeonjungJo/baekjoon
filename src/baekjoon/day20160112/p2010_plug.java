package baekjoon.day20160112;
import java.util.Arrays;
import java.util.Scanner;

public class p2010_plug {

	private void init() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] plug = new int[n];
		for(int i=0; i<n; i++){
			plug[i] = sc.nextInt();
		}
		Arrays.sort(plug);
		int computer = 1;
		for(int i=0; i<n; i++){
			computer += plug[i] -1;
		}
		System.out.println(computer);
	}

	public static void main(String[] args) {
		new p2010_plug().init();
	}
}