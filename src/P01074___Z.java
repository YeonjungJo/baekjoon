import java.util.Scanner;

public class P01074___Z {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			int c = sc.nextInt();

			int m = (int) Math.pow(2, n);
			search(r, c, 0, m - 1, 0, m - 1, 0);
		}
	}

	private void search(int r, int c, int rStart, int rEnd, int cStart, int cEnd, double cost) {
//		System.out.printf("r[ %d, %d ], c[ %d, %d ] : %d\n", rStart, rEnd, cStart, cEnd, (int) cost);
		if (rStart == rEnd && cStart == cEnd) {
			System.out.println((int) cost);
			return;
		}
		if (r <= (rStart + rEnd) / 2) {
			if (c <= (cStart + cEnd) / 2) {
				search(r, c, rStart, (rStart + rEnd) / 2, cStart, (cStart + cEnd) / 2, cost);
			} else {
				search(r, c, rStart, (rStart + rEnd) / 2, (cStart + cEnd) / 2 + 1, cEnd, cost + (cEnd - cStart + 1) / 2 * (rEnd - rStart + 1) / 2);
			}
		} else {
			if (c <= (cStart + cEnd) / 2) {
				search(r, c, (rStart + rEnd) / 2 + 1, rEnd, cStart, (cStart + cEnd) / 2, cost + 2 * (cEnd - cStart + 1) / 2 * (rEnd - rStart + 1) / 2);
			} else {
				search(r, c, (rStart + rEnd) / 2 + 1, rEnd, (cStart + cEnd) / 2 + 1, cEnd, cost + 3 * (cEnd - cStart + 1) / 2 * (rEnd - rStart + 1) / 2);
			}
		}
	}

	public static void main(String[] args) {
		new P01074___Z().solve();
	}
}
