package baekjoon.solve;
import java.util.Scanner;

public class P02846___UphillRoad {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		int max = 0;
		int before = sc.nextInt();
		int road = 0;
		for (int i = 1; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp > before) road += tmp - before;
			else {
				if (max < road) max = road;
				road = 0;
			}
//			System.out.printf("before = %d, tmp : %d, road : %d\n", before, tmp, road);
			before = tmp;
		}

		if (road > max) max = road;

		System.out.println(max);
	}

	public static void main(String[] args) {
		new P02846___UphillRoad().solve();
	}
}
