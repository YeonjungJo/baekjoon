package baekjoon.day20160117;
public class p4673_selfNumber {

	private boolean[] arr = new boolean[10001];

	private void solve() {

		int i = 1;

		while (i <= 10000) {
			if (!arr[i]) {
				System.out.println(i);
				d(i);
			}
			i++;
		}

	}

	private void d(int i) {
		if (i <= 10000)
			arr[i] = true;
		int next = i;
		while (i > 0) {
			next += i % 10;
			i /= 10;
		}
		if(next <= 10000) d(next);
	}

	public static void main(String[] args) {
		new p4673_selfNumber().solve();
	}
}
