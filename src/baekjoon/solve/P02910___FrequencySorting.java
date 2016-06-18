package baekjoon.solve;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P02910___FrequencySorting {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		sc.nextInt();

		HashMap<Integer, Number> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();

			if (map.containsKey(tmp)) map.get(tmp).appear();
			else map.put(tmp, new Number(tmp, i));
		}

		Number[] number = map.values().toArray(new Number[map.size()]);
		Arrays.sort(number);

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].getFreq(); j++) {
				System.out.print(number[i].getId() + " ");
			}
		}
	}

	private class Number implements Comparable<Number> {

		private int id;
		private int freq;
		private int appearTime;

		public Number(int id, int time) {
			this.id = id;
			this.freq = 1;
			this.appearTime = time;
		}

		public void appear() {
			freq++;
		}

		public int getFreq() {
			return freq;
		}

		public int getId() {
			return id;
		}

		public int getAppearTime() {
			return appearTime;
		}

		@Override
		public int compareTo(Number o) {
			if (this.getFreq() < o.getFreq()) return +1;
			if (this.getFreq() > o.getFreq()) return -1;
			if (this.getAppearTime() < o.getAppearTime()) return -1;
			if (this.getAppearTime() > o.getAppearTime()) return +1;
			return 0;
		}
	}

	public static void main(String[] args) {
		new P02910___FrequencySorting().solve();
	}
}
