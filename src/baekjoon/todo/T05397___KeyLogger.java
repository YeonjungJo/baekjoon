package baekjoon.todo;
import java.util.LinkedList;
import java.util.Scanner;

public class T05397___KeyLogger {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int testcase = sc.nextInt();
		for (int t = 0; t < testcase; t++) {
			String s = sc.next();

			int slength = s.length();

			int length = 0;
			int cursor = 0;

			LinkedList<Character> pw = new LinkedList<>();

			for (int i = 0; i < slength; i++) {
				char c = s.charAt(i);
				switch (c) {
				case '-':
					if (cursor > 0) {
						pw.remove(cursor - 1);
						cursor--;
						length--;
					}
					break;
				case '<':
					if (cursor > 0) cursor--;
					break;
				case '>':
					if (cursor < length) cursor++;
					break;
				default:
					pw.add(cursor, c);
					cursor++;
					length++;
				}
			}

			for (int i = 0; i < length; i++) {
				System.out.print(pw.removeFirst());
			}
		}
	}

	public static void main(String[] args) {
		new T05397___KeyLogger().solve();
	}
}
