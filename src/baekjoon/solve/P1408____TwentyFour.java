package baekjoon.solve;
import java.util.Scanner;

public class P1408____TwentyFour {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		String[] current = sc.nextLine().split(":");
		String[] start = sc.nextLine().split(":");

		int currentTime = Integer.parseInt(current[0]) * 3600 + Integer.parseInt(current[1]) * 60 + Integer.parseInt(current[2]);
		int startTime = Integer.parseInt(start[0]) * 3600 + Integer.parseInt(start[1]) * 60 + Integer.parseInt(start[2]);
		int costTime = startTime > currentTime ? 86400 - startTime + currentTime : currentTime - startTime;
		int remainTime = 86400 - costTime;
		
		System.out.print(String.format("%02d:", remainTime / 3600));
		System.out.print(String.format("%02d:", (remainTime % 3600) / 60));
		System.out.print(String.format("%02d", (remainTime % 3600) % 60));
	}

	public static void main(String[] args) {
		new P1408____TwentyFour().solve();
	}
}
