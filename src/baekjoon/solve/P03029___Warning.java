package baekjoon.solve;
import java.util.Scanner;

public class P03029___Warning {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String[] current = sc.nextLine().split(":");
		String[] goal = sc.nextLine().split(":");

		int currentTime = Integer.parseInt(current[0]) * 3600 + Integer.parseInt(current[1]) * 60 + Integer.parseInt(current[2]);
		int goalTime = Integer.parseInt(goal[0]) * 3600 + Integer.parseInt(goal[1]) * 60 + Integer.parseInt(goal[2]);

		int remainTime = goalTime > currentTime ? goalTime - currentTime : 86400 - currentTime + goalTime;

		System.out.print(String.format("%02d:", remainTime / 3600));
		System.out.print(String.format("%02d:", (remainTime % 3600) / 60));
		System.out.print(String.format("%02d", (remainTime % 3600) % 60));
	}

	public static void main(String[] args) {
		new P03029___Warning().solve();
	}
}
