package baekjoon.solve;
import java.util.Scanner;

public class P05575___TimeCard {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		Employee[] employee = new Employee[3];
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()), new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}

		for (int i = 0; i < employee.length; i++) {
			int[] officeTime = employee[i].getOfficeTime();
			System.out.println(String.format("%d %d %d", officeTime[0], officeTime[1], officeTime[2]));
		}
	}

	public class Employee {
		private Time start;
		private Time end;

		public Employee(Time start, Time end) {
			this.start = start;
			this.end = end;
		}

		public int[] getOfficeTime() {
			int second = end.getTimeToSecond() - start.getTimeToSecond();
			int[] t = new int[3];
			t[0] = second / 3600;
			t[1] = (second % 3600) / 60;
			t[2] = second - (t[0] * 3600) - (t[1] * 60);
			return t;
		}
	}

	public class Time {
		private int h;
		private int m;
		private int s;

		public Time(int h, int m, int s) {
			this.h = h;
			this.m = m;
			this.s = s;
		}

		public int getTimeToSecond() {
			return s + (m * 60) + (h * 60 * 60);
		}
	}

	public static void main(String[] args) {
		new P05575___TimeCard().solve();
	}
}
