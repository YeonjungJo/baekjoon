package baekjoon.solve;
import java.util.Scanner;

public class P01969___DNA {

	private static final Scanner sc = new Scanner(System.in);

	private static final char[] NUCLEOTIDE = { 'A', 'C', 'G', 'T' };

	private void solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();

		char[][] dna = new char[n][m];
		for (int i = 0; i < n; i++) {
			dna[i] = sc.next().toCharArray();
		}

		int hammingDistance = 0;
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < m; i++) {
			int[] nucleotide = findNucleotide(dna, n, m, i);
			char tmp = NUCLEOTIDE[0];
			int max = nucleotide[0];
			for (int j = 1; j < 4; j++) {
				if (nucleotide[j] > max) {
					tmp = NUCLEOTIDE[j];
					max = nucleotide[j];
				}
			}
			strBuilder.append(tmp);
			hammingDistance += n - max;
		}
		
		System.out.println(strBuilder.toString());
		System.out.println(hammingDistance);
	}

	private int[] findNucleotide(char[][] dna, int n, int m, int k) {
		int[] nucleotide = new int[4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				if (dna[i][k] == NUCLEOTIDE[j]) nucleotide[j]++;
			}
		}
		return nucleotide;
	}

	private int max(int i, int j, int k, int l) {
		if (i >= j && i >= k && i >= l) return i;
		if (j >= i && j >= k && j >= l) return i;
		if (k >= i && k >= j && k >= l) return i;
		return l;
	}

	public static void main(String[] args) {
		new P01969___DNA().solve();
	}
}
