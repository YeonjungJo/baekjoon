package baekjoon.day20160112;
import java.util.Scanner;

public class p2525_ovenClock {

	private void init() {
		Scanner sc = new Scanner(System.in);
		operate(sc.nextInt(), sc.nextInt(), sc.nextInt());
	}

	private void operate(int hour, int min, int remain) {
		min += remain % 60;
		if (min >= 60) {
			min -= 60;
			hour++;
		}
		hour += remain / 60;
		if (hour >= 24) {
			hour -= 24;
		}
		
		System.out.println(hour + " " + min);
	}

	public static void main(String[] args) {
		new p2525_ovenClock().init();
	}
}