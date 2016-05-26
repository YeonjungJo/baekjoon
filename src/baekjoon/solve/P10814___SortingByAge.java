package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P10814___SortingByAge {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();
		Member[] member = new Member[n];
		for (int i = 0; i < n; i++) {
			member[i] = new Member(sc.nextInt(), sc.next(), i);
		}

		Arrays.sort(member);
		for (int i = 0; i < n; i++) {
			System.out.printf("%d %s\n", member[i].getAge(), member[i].getName());
		}
	}

	private class Member implements Comparable<Member> {
		private int age;
		private String name;
		private int order;

		public Member(int age, String name, int order) {
			this.age = age;
			this.name = name;
			this.order = order;
		}

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}

		public int getOrder() {
			return order;
		}

		@Override
		public int compareTo(Member o) {
			if (this.getAge() < o.getAge()) return -1;
			if (this.getAge() > o.getAge()) return 1;
			if (this.getOrder() < o.getOrder()) return -1;
			if (this.getOrder() > o.getOrder()) return 1;
			return 0;
		}
	}

	public static void main(String[] args) {
		new P10814___SortingByAge().solve();
	}
}
