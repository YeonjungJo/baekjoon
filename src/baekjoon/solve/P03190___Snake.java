package baekjoon.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class P03190___Snake {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    public static final int APPLE = -1;
    public static final int BODY = 1;
    public static final int EMPTY = 0;

    private void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];

        for (int i = 0; i < k; i++) {
            String[] apple = br.readLine().split(" ");
            board[Integer.parseInt(apple[0]) - 1][Integer.parseInt(apple[1]) - 1] = APPLE;
        }

        int l = Integer.parseInt(br.readLine());
        Map<Integer, String> changeDir = new HashMap<>();
        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split(" ");
            changeDir.put(Integer.parseInt(s[0]), s[1]);
        }

        List<Position> snake = new LinkedList<>();
        snake.add(new Position(0, 0));
        board[0][0] = 1;
        int dir = 0;
        int time = 0;
        while (true) {
            Position head = snake.get(0);

            String change = changeDir.get(time);
            if (change != null) {
                dir = getDir(dir, change);
            }

            int nextX = head.x + dx[dir];
            int nextY = head.y + dy[dir];
            if (nextX == n || nextY == n || nextX < 0 || nextY < 0) {
                break;
            }
            if (board[nextX][nextY] == BODY) {
                break;
            }

            snake.add(0, new Position(nextX, nextY));
            if (board[nextX][nextY] != APPLE) {
                Position remove = snake.remove(snake.size() - 1);
                board[remove.x][remove.y] = EMPTY;
            }
            board[nextX][nextY] = BODY;

            time++;
        }

        System.out.println(time + 1);
    }

    private int getDir(int dir, String change) {
        if (change.equals("L")) {
            dir--;
        } else {
            dir++;
        }

        if (dir == -1) {
            return dx.length - 1;
        }
        if (dir == dx.length) {
            return 0;
        }
        return dir;
    }

    class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        new P03190___Snake().solve();
    }
}
