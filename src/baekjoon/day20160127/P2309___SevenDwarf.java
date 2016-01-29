package baekjoon.day20160127;
import java.util.Arrays;
import java.util.Scanner;

public class P2309___SevenDwarf {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int[] dwarf = new int[9];

		int sum = 0;
		for (int i = 0; i < 9; i++) {
			dwarf[i] = sc.nextInt();
			sum += dwarf[i];
		}

		Arrays.sort(dwarf);

		int diff = sum - 100;

		for (int i = 0; i < dwarf.length - 1; i++) {
			for (int j = i + 1; j < dwarf.length; j++) {
				if (dwarf[i] + dwarf[j] == diff)
					dwarf[i] = dwarf[j] = -1;
			}
		}

		for (int i = 0; i < dwarf.length; i++) {
			if (dwarf[i] > 0)
				System.out.println(dwarf[i]);
		}
	}

	public static void main(String[] args) {
		new P2309___SevenDwarf().solve();
	}
}
