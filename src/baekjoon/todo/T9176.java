package baekjoon.todo;
import java.util.Scanner;

public class T9176 {

	long mersenneK;

	public T9176() {
		scan();
		operate();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		mersenneK = sc.nextInt();
	}

	private void operate() {
		for (int p = 2; p <= mersenneK; p++) {
			if (isPrime(p) == -1) {
				long mersenne = (long) (Math.pow(2, p)) - 1;
				long primeFactor = isPrime(mersenne);
				if (primeFactor != -1) {
					System.out.print(primeFactor);
					while (primeFactor != -1) {
						System.out.print(" * ");
						mersenne /= primeFactor;
						primeFactor = isPrime(mersenne);
						if (primeFactor != -1) System.out.print(primeFactor);
						else System.out.print(mersenne);
					}
					System.out.println(" = " + (long)(Math.pow(2, p) - 1) + " = ( 2 ^ " + p + " ) - 1");
				}
			}
		}
	}

	private long isPrime(long number) {
		if (number == 1) return -1;
		long d = (long) Math.sqrt(number);
		for (int i = 2; i <= d; i++) {
			if (number % i == 0) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		new T9176();
	}
}
