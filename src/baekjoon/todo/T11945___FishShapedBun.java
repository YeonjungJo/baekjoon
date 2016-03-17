package baekjoon.todo;
import java.util.Scanner;

public class T11945___FishShapedBun {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int r = Integer.parseInt(sc.nextLine().split(" ")[0]);
		for (int i = 0; i < r; i++) {
			System.out.println(new StringBuilder(sc.nextLine()).reverse().toString());
		}
	}

	public static void main(String[] args) {
		new T11945___FishShapedBun().solve();
	}
}
