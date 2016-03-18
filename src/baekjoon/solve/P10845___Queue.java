package baekjoon.solve;
import java.util.LinkedList;
import java.util.Scanner;

public class P10845___Queue {

	private static final Scanner sc = new Scanner(System.in);

	enum Operator {
		push, pop, size, empty, front, back;
	}

	private void solve() {
		int n = sc.nextInt();

		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			operate(queue, Operator.valueOf(sc.next()));
		}
	}

	private void operate(LinkedList<Integer> queue, Operator o) {
		switch (o) {
		case back:
			if (queue.size() == 0) System.out.println(-1);
			else System.out.println(queue.peekLast());
			break;
		case empty:
			System.out.println(queue.isEmpty() ? 1 : 0);
			break;
		case front:
			if (queue.size() == 0) System.out.println(-1);
			else System.out.println(queue.peekFirst());
			break;
		case pop:
			if (queue.size() == 0) System.out.println(-1);
			else System.out.println(queue.pollFirst());
			break;
		case push:
			queue.add(sc.nextInt());
			break;
		case size:
			System.out.println(queue.size());
			break;
		}
	}

	public static void main(String[] args) {
		new P10845___Queue().solve();
	}
}
