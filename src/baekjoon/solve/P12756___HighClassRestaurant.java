package baekjoon.solve;
import java.util.Scanner;

public class P12756___HighClassRestaurant {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int aAttack = sc.nextInt();
		int aLife = sc.nextInt();
		int bAttack = sc.nextInt();
		int bLife = sc.nextInt();

		int n = bLife / aAttack + (bLife % aAttack == 0 ? 0 : 1);
		int m = aLife / bAttack + (aLife % bAttack == 0 ? 0 : 1);
		if (n == m) System.out.println("DRAW");
		else if (n < m) System.out.println("PLAYER A");
		else System.out.println("PLAYER B");
	}

	public static void main(String[] args) {
		new P12756___HighClassRestaurant().solve();
	}
}
