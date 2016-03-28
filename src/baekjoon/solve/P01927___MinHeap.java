package baekjoon.solve;
import java.util.Scanner;
import java.util.TreeSet;

public class P01927___MinHeap {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		
		TreeSet<Integer> heap = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			if(k == 0){
				if(heap.size() == 0) System.out.println(0);
				else System.out.println(heap.pollFirst());
			} else {
				heap.add(k);
			}
		}
	}

	public static void main(String[] args) {
		new P01927___MinHeap().solve();
	}
}
