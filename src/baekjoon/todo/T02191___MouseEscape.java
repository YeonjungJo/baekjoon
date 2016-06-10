package baekjoon.todo;
import java.util.Scanner;

public class T02191___MouseEscape {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int v = sc.nextInt();

		Position[] mouse = new Position[n];
		for (int i = 0; i < n; i++) {
			mouse[i] = new Position(sc.nextDouble(), sc.nextDouble());
		}

		Position[] tunnel = new Position[m];
		for (int i = 0; i < m; i++) {
			tunnel[i] = new Position(sc.nextDouble(), sc.nextDouble());
		}

		boolean[][] a = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = mouse[i].distance(tunnel[j]) / (double) v <= s ? true : false;
			}
		}

		
	}

	private class Position {
		double x;
		double y;

		public Position(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double distance(Position p) {
			return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
		}
	}

	public static void main(String[] args) {
		new T02191___MouseEscape().solve();
	}
}
