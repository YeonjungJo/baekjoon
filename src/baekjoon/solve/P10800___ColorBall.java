package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class P10800___ColorBall {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());

        List<Ball> balls = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Ball ball = new Ball(i, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            balls.add(ball);
        }

        int[] result = new int[n];
        List<Ball> sortedBalls = balls.stream()
                .sorted()
                .collect(Collectors.toList());

        Map<Integer, Integer> sumOfEachGroup = new HashMap<>();
        int totalSum = 0;
        Ball before = null;
        int currentSizeSum = 0;
        for (Ball ball : sortedBalls) {
            if (before == null) {
                result[ball.index] = 0;
            } else if (ball.size == before.size && ball.color == before.color) {
                result[ball.index] = result[before.index];
            } else if (ball.size == before.size) {
                result[ball.index] = totalSum - sumOfEachGroup.getOrDefault(ball.color, 0) - currentSizeSum;
            } else {
                result[ball.index] = totalSum - sumOfEachGroup.getOrDefault(ball.color, 0);
            }
            sumOfEachGroup.put(ball.color, sumOfEachGroup.getOrDefault(ball.color, 0) + ball.size);
            totalSum += ball.size;
            if (before != null && before.size == ball.size) {
                currentSizeSum += ball.size;
            } else {
                currentSizeSum = ball.size;
            }
            before = ball;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(result[i]).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public class Ball implements Comparable<Ball> {

        int index;
        int color;
        int size;

        public Ball(int index, int color, int size) {
            this.index = index;
            this.color = color;
            this.size = size;
        }

        @Override
        public int compareTo(Ball other) {
            if (size == other.size) {
                return Integer.compare(color, other.color);
            }
            return Integer.compare(size, other.size);
        }
    }

    public static void main(String[] args) throws IOException {
        new P10800___ColorBall().solve();
    }
}
