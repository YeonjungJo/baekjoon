package baekjoon.day20160112;
import java.util.Scanner;

public class PrimeFactorizationBasic_11653 {

	public PrimeFactorizationBasic_11653() {
		scan();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		operate(sc.nextLong());
	}

	private void operate(long number) {
		int i = 2;
		while (number != 1) {
			if(number % i == 0) {
				System.out.println(i);
				number /= i;
			}
			else i++;
		}
	}

	public static void main(String[] args) {
		new PrimeFactorizationBasic_11653();
	}
}
