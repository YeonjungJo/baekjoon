package baekjoon.solve;
import java.util.Scanner;
 
public class P02594___Diary {
 
    private static final Scanner sc = new Scanner(System.in);
 
    private void solve() {
        String s = sc.nextLine();
        s = s.replaceAll("apa", "a");
        s = s.replaceAll("epe", "e");
        s = s.replaceAll("ipi", "i");
        s = s.replaceAll("opo", "o");
        s = s.replaceAll("upu", "u");
        System.out.println(s);
    }
 
    public static void main(String[] args) {
        new P02594___Diary().solve();
    }
}