package baekjoon.day20160117;
import java.util.Arrays;
import java.util.Scanner;

public class p2592_representativeValue {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		
		int avg = 0;
		int mode = 0;
		
		int[] input = new int[10];
		
		for(int i=0; i<10; i++){
			input[i] = sc.nextInt();
		}
		
		int tmp = 0;
		int count = 0;
		int max = 0;
		
		Arrays.sort(input);
		
		for(int i=0; i<10; i++){
			avg += input[i];
			if(tmp != input[i]) {
				if(count > max){
					max = count;
					mode = tmp;
				}
				tmp = input[i];
				count = 1;
			} else {
				count ++;
			}
		}
		
		System.out.println(avg / 10);
		System.out.println(mode);
	}

	public static void main(String[] args) {
		new p2592_representativeValue().solve();
	}
}

