package baekjoon.solve;
import java.util.Arrays;
import java.util.Scanner;

public class P10825___KoreanEnglishMath {

	private static final Scanner sc = new Scanner(System.in);

	private void solve() {
		int n = sc.nextInt();

		Student[] student = new Student[n];
		for (int i = 0; i < n; i++) {
			student[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(student);
		for (int i = 0; i < n; i++) {
			System.out.println(student[i].getName());
		}
	}

	private class Student implements Comparable<Student> {
		private String name;
		private int korean;
		private int english;
		private int math;

		public Student(String name, int korean, int english, int math) {
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}

		@Override
		public int compareTo(Student o) {
			if (getKorean() > o.getKorean()) return -1;
			if (getKorean() < o.getKorean()) return 1;
			if (getEnglish() < o.getEnglish()) return -1;
			if (getEnglish() > o.getEnglish()) return 1;
			if (getMath() > o.getMath()) return -1;
			if (getMath() < o.getMath()) return 1;
			return name.compareTo(o.getName());
		}

		public int getEnglish() {
			return english;
		}

		public int getKorean() {
			return korean;
		}

		public int getMath() {
			return math;
		}

		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) {
		new P10825___KoreanEnglishMath().solve();
	}
}
