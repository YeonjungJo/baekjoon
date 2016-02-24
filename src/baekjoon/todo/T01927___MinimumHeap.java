package baekjoon.todo;
import java.util.LinkedList;
import java.util.Scanner;

public class T01927___MinimumHeap {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		LinkedList<Integer> heap = new LinkedList<>();

		Loop1: for (int i = 0; i < n; i++) {
			int operator = sc.nextInt();

			if (operator == 0) {
				if (heap.size() == 0) System.out.println(0);
				else System.out.println(heap.pop());
			} else {
				for (int j = 0; j < heap.size(); j++) {
					if (heap.get(j) > operator) {
						heap.add(j, operator);
						continue Loop1;
					}
				}
				heap.add(operator);
			}
		}
	}

	public static void main(String[] args) {
		new T01927___MinimumHeap().solve();
	}
}
