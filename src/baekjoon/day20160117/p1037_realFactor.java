package baekjoon.day20160117;

import java.util.Scanner;

public class p1037_realFactor {

	private void init() {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		int min = 1000001;
		int max = 1;
		
		for(int i=0; i<testcase; i++){
			int input = sc.nextInt();
			if(input > max) max = input;
			if(input < min) min = input;
		}
		System.out.println(min * max);
	}

	public static void main(String[] args) {
		new p1037_realFactor().init();
	}
}