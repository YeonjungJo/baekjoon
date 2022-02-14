package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P01927___MinHeap {

	private void solve() {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if (input != 0) {
				priorityQueue.add(input);
			} else {
				System.out.println(priorityQueue.isEmpty() ? 0 : priorityQueue.poll());
			}
		}
	}

	public static void main(String[] args) {
		sc.init();
		new P01927___MinHeap().solve();
	}

	static class sc {
		private static BufferedReader br;
		private static StringTokenizer st;

		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		static String next() {
			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}

			return st.nextToken();
		}

		static int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
