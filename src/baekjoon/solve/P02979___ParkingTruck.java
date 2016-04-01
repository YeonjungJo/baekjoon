package baekjoon.solve;
import java.util.Scanner;

public class P02979___ParkingTruck {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int[] cost = new int[4];
		for (int i = 1; i < 4; i++) {
			cost[i] = sc.nextInt();
		}

		int[] park = new int[101];
		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = a; j < b; j++) {
				park[j]++;
			}
		}

		int bill = 0;
		for (int i = 0; i < 101; i++) {
			bill += cost[park[i]] * park[i];
		}
		System.out.println(bill);
	}

	public static void main(String[] args) {
		new P02979___ParkingTruck().solve();
	}
}
