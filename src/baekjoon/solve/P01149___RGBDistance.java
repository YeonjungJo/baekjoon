package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.min;

public class P01149___RGBDistance {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static final int R = 0;
	private static final int G = 1;
	private static final int B = 2;

	private void solve() throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[][] rgb = new int[n][3];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				rgb[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][] d = new int[n][3];

		for (int i = 0; i < 3; i++) {
			d[0][i] = rgb[0][i];
		}

		for (int i = 1; i < n; i++) {
			d[i][R] = min(d[i - 1][G], d[i - 1][B]) + rgb[i][R];
			d[i][G] = min(d[i - 1][R], d[i - 1][B]) + rgb[i][G];
			d[i][B] = min(d[i - 1][R], d[i - 1][G]) + rgb[i][B];
		}

		System.out.println(min(min(d[n - 1][R], d[n - 1][G]), d[n - 1][B]));
	}

	public static void main(String[] args) throws IOException {
		new P01149___RGBDistance().solve();
	}
}
