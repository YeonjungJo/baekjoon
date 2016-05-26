package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P01181___SortingWord {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		Word[] w = new Word[n];
		for (int i = 0; i < n; i++) {
			w[i] = new Word(sc.next());
		}
		Arrays.sort(w);

		String tmp = "";
		for (int i = 0; i < n; i++) {
			String s = w[i].getId();
			if (!tmp.equals(s)) {
				System.out.println(s);
				tmp = s;
			}
		}
	}

	public class Word implements Comparable<Word> {
		private String id;

		public Word(String s) {
			this.id = s;
		}

		public String getId() {
			return id;
		}

		@Override
		public int compareTo(Word o) {
			String s = o.getId();
			if (id.length() < s.length()) return -1;
			if (id.length() > s.length()) return 1;
			return id.compareTo(s);
		}
	}

	public static void main(String[] args) {
		new P01181___SortingWord().solve();
	}
}
