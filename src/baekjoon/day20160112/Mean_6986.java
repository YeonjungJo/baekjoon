package baekjoon.day20160112;
import java.util.Arrays;
import java.util.Scanner;

public class Mean_6986 {

	private int N;
	private int K;
	private double[] score;
	private double trimmedMean;
	private double adjustedMean;

	public Mean_6986() {
		scan();
		operate();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		score = new double[N];
		for (int i = 0; i < N; i++) {
			score[i] = sc.nextDouble();
		}
		Arrays.sort(score);
	}

	private void operate() {
		getTrimmedMean();
		getAdjustedMean();
	}

	private void getTrimmedMean() {
		double sum = 0;
		for (int i = K; i < N - K; i++) {
			sum += score[i];
		}
		System.out.format("%.2f%n", sum / (N - 2*K));
	}

	private void getAdjustedMean() {
		double sum = 0;
		for (int i = 0; i < N; i++) {
			if (i < K) {
				sum += score[K];
			} else if (i >= N - K) {
				sum += score[N - K - 1];
			} else {
				sum += score[i];
			}
		}
		System.out.format("%.2f%n", sum / N);
	}

	public static void main(String[] args) {
		new Mean_6986();
	}
}
