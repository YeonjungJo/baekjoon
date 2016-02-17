package baekjoon.solve;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P02822___PointCalculation {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		HashMap<Integer, Integer> point = new HashMap<Integer, Integer>();
		for (int i = 0; i < 8; i++) {
			point.put(sc.nextInt(), i);
		}
		Integer[] arr = point.keySet().toArray(new Integer[point.size()]);
		Arrays.sort(arr);
		int sum = 0;
		int[] result = new int[5];
		for (int i = 0; i < 5; i++) {
			sum += arr[i + 3];
			result[i] = point.get(arr[i + 3]) + 1;
		}
		Arrays.sort(result);
		System.out.println(sum);
		for (int i = 0; i < 5; i++)
			System.out.print(result[i] + " ");
	}

	public static void main(String[] args) {
		new P02822___PointCalculation().solve();
	}
}
