package baekjoon.day20160117;
import java.util.Scanner;

public class p2942_fergusonApple {

	private void solve() {
		scan();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		operate(sc.nextInt(), sc.nextInt());
	}

	private void operate(int red, int green) {
		for (int i = 1; i <= (red > green ? green : red) ; i++) {
			if (red % i == 0 && green % i == 0){
				System.out.println(i + " " + red/i + " " + green/i);
			}
		}
	}

	public static void main(String[] args) {
		new p2942_fergusonApple().solve();
	}
}
