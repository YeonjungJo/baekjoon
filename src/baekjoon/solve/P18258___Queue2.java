package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P18258___Queue2 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        List<Integer> queue = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int head = 0;
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            switch (s[0]) {
                case "push":
                    queue.add(Integer.parseInt(s[1]));
                    break;
                case "pop":
                    boolean isEmpty = queue.size() <= head;
                    stringBuilder.append(isEmpty ? -1 : queue.get(head)).append("\n");
                    head = isEmpty ? head : head + 1;
                    break;
                case "size":
                    stringBuilder.append(queue.size() - head).append("\n");
                    break;
                case "empty":
                    stringBuilder.append(queue.size() <= head ? 1 : 0).append("\n");
                    break;
                case "front":
                    stringBuilder.append(queue.size() <= head ? -1 : queue.get(head)).append("\n");
                    break;
                case "back":
                    stringBuilder.append(queue.size() <= head ? -1 : queue.get(queue.size() - 1)).append("\n");
                    break;
            }
        }
        System.out.print(stringBuilder);
    }

    public static void main(String[] args) throws IOException {
        new P18258___Queue2().solve();
    }
}
