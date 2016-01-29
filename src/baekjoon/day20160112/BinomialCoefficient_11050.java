package baekjoon.day20160112;
import java.util.Scanner;

public class BinomialCoefficient_11050 {

	private int N;
	private int K;
	private int result = 1;

	public BinomialCoefficient_11050() {
		scan();
		operate();
		print();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
	}

	private void operate() {
		K = N - K < K ? N - K : K;
		for (int i = N; i >= 1; i--) {
			if (i > N-K) {
				result *= i;
			} else if(i <= K){
				result /= i;
			}
		}
	}

	private void print() {
		System.out.println(result);
	}

	public static void main(String[] args) {
		new BinomialCoefficient_11050();
	}
}
