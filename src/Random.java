import java.util.Scanner;

public class Random {
	private static final Scanner sc = new Scanner(System.in);

	private void rand() {
		System.out.println((int) (Math.random() * 10873) + 1000);
	}

	public static void main(String[] args) {
		new Random().rand();
	}
}