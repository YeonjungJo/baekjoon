package baekjoon.todo;
import java.util.Scanner;

public class T1027___TallBuilding {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long[] building = new long[n];
		for (int i = 0; i < n; i++) {
			building[i] = sc.nextLong();
		}

		int[] sight = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (isSight(building, i, j)) {
					sight[i]++;
					sight[j]++;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = max < sight[i] ? sight[i] : max;
		}
		
		System.out.println(max);
	}

	private boolean isSight(long[] building, int i, int j) {
		double a = (building[i] - building[j]) / (float)(i - j);
		double b = building[i] - a * i;
		for (int k = i + 1; k < j; k++) {
			if (a * k + b <= building[k]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new T1027___TallBuilding().solve();
	}
}
