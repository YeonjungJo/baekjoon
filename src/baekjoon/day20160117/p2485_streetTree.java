package baekjoon.day20160117;
import java.util.Arrays;
import java.util.Scanner;

public class p2485_streetTree {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int common = 1;
		
		Loop1 : for(int i=2; i<arr[1]; i++){
			for(int j=1; j<n; j++){
				if((arr[j] - arr[0]) % i != 0) continue Loop1;
			}
			common = i;
		}

		int count = 0;
		for(int i=1; i<n; i++){
			count += (arr[i] - arr[i-1])/common - 1;
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		new p2485_streetTree().solve();
	}
}
