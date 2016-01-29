package baekjoon.day20160118;
import java.util.Scanner;

public class P10372 {

	private static final int[] SEVEN_SEGMENT = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int segment = sc.nextInt();

		for (int hour = 0; hour < 24; hour++) {
			for (int min = 0; min < 60; min++) {
				if(getSegment(hour) + getSegment(min) == segment) {
					String fHour = String.format("%02d", hour);
					String fMin = String.format("%02d", min);
					System.out.println(fHour + ":" + fMin);
					return;
				}
			}
		}
		System.out.println("Impossible");
	}
	
	private int getSegment(int time){
		int result = 0;
		result += SEVEN_SEGMENT[time % 10];
		time /= 10;
		result += SEVEN_SEGMENT[time];
		return result;
	}

	public static void main(String[] args) {
		new P10372().solve();
	}
}
