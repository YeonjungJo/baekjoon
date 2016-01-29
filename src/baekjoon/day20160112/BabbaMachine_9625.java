package baekjoon.day20160112;
import java.util.Scanner;

public class BabbaMachine_9625 {

	private int k;
	private int a = 0;
	private int b = 1;

	public BabbaMachine_9625() {
		scan();
		operate();
		print();
	}

	private void scan() {
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
	}

	private void operate() {
		if(k == 0){
			a = 1;
			b = 0;
			return;
		} 
		for (int i = 1; i < k; i++) {
			int tmp = a + b;
			a = b;
			b = tmp;
		}
	}

	private void print() {
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		new BabbaMachine_9625();
	}
}
