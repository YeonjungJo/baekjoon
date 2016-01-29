package baekjoon.todo;
import java.util.Scanner;

public class T1371 {

	private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private int[] freq = new int[26];

	private static final String regex = "[a-z]";

	private void solve() {
		
		new Input().start();
		
		int max = 0;
		String freqAlphabet = "";
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > max) {
				max = freq[i];
				freqAlphabet = Character.toString(alphabet.charAt(i));
			} else if (freq[i] == max) {
				freqAlphabet.concat(Character.toString(alphabet.charAt(i)));
			}
		}
		System.out.println(freqAlphabet);
	}

	private class Input extends Thread {
		double startTime = System.currentTimeMillis();
		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			while (true) {
				double time = System.currentTimeMillis();
				if(!(time - startTime > 5000))
					getFreqency(sc.next());
				else 
					return;
			}
		}
	}

	private void getFreqency(String s) {
		System.out.println(s);
		s = s.replace(" ", "");
		for (int i = 0; i < s.length(); i++) {
			freq[alphabet.indexOf(s.charAt(i))]++;
		}
	}

	public static void main(String[] args) {
		new T1371().solve();
	}
}
