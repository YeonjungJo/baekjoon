package baekjoon.todo;
import java.util.Scanner;

public class T11723 {

	public enum command {
		add, remove, check, toggle, all, empty
	}

	private boolean[] list = new boolean[21];
	
	private boolean init = false;

	private void init() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		for (; i > 0; i--) {
			switch (command.valueOf(sc.next())) {
				case add:
					add(sc.nextInt());
					break;
				case remove:
					remove(sc.nextInt());
					break;
				case check:
					check(sc.nextInt());
					break;
				case toggle:
					toggle(sc.nextInt());
					break;
				case all:
					all();
					break;
				case empty:
					empty();
					break;
			}
		}
	}

	private void add(int i) {
		list[i] = !init;
	}

	private void remove(int i) {
		list[i] = init;
	}

	private void check(int i) {
		if (list[i]^init) System.out.println("1");
		else System.out.println("0");
	}

	private void toggle(int i) {
		list[i] = !list[i];
	}

	private void all() {
		list = new boolean[21];
		init = true;
	}

	private void empty() {
		list = new boolean[21];
		init = false;
	}

	public static void main(String[] args) {
		new T11723().init();
	}
}