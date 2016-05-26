package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01431___SerialNumber {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		SerialNumber[] serialNumber = new SerialNumber[n];
		for (int i = 0; i < n; i++) {
			serialNumber[i] = new SerialNumber(sc.next());
		}
		Arrays.sort(serialNumber);
		for (int i = 0; i < n; i++) {
			System.out.println(serialNumber[i].getId());
		}
	}

	private class SerialNumber implements Comparable<SerialNumber> {
		private String id;
		private int numberSum;

		public SerialNumber(String id) {
			this.id = id;
			numberSum = sumNumber();
		}

		private int sumNumber() {
			int sum = 0;
			for (int i = 0; i < id.length(); i++) {
				int tmp = Character.getNumericValue(id.charAt(i));
				if (tmp >= 0 && tmp < 10) sum += tmp;
			}
			return sum;
		}

		public String getId() {
			return id;
		}

		public int getNumberSum() {
			return numberSum;
		}

		@Override
		public int compareTo(SerialNumber o) {
			if (id.length() < o.getId().length()) return -1;
			if (id.length() > o.getId().length()) return 1;
			if (numberSum < o.getNumberSum()) return -1;
			if (numberSum > o.getNumberSum()) return 1;
			return id.compareTo(o.getId());
		}
	}

	public static void main(String[] args) {
		new P01431___SerialNumber().solve();
	}
}
