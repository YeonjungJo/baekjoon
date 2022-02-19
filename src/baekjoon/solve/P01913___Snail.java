package baekjoon.solve;

import java.util.Scanner;

public class P01913___Snail {

    private void init() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int goal = sc.nextInt();
        operate(n, goal);
    }

    private void operate(int n, int goal) {
        int[][] map = new int[n + 2][n + 2];

        for (int i = 0; i < n + 2; i++) {
            map[0][i] = 1;
            map[n + 1][i] = 1;
            map[i][0] = 1;
            map[i][n + 1] = 1;
        }

        int number = n * n;
        int x = 1;
        int y = 1;

        int goalx = 0;
        int goaly = 0;

        int direct = 0;

        while (number > 0) {
            if (number == goal) {
                goaly = y;
                goalx = x;
            }

            map[y][x] = number;
            switch (direct) {
                case 0:
                    if (map[y + 1][x] == 0) {
                        y++;
                        break;
                    } else direct = 1;
                case 1:
                    if (map[y][x + 1] == 0) {
                        x++;
                        break;
                    } else direct = 2;
                case 2:
                    if (map[y - 1][x] == 0) {
                        y--;
                        break;
                    } else direct = 3;
                case 3:
                    if (map[y][x - 1] == 0) {
                        x--;
                        break;
                    } else direct = 0;
                default:
                    if (map[y + 1][x] == 0) {
                        y++;
                        break;
                    } else direct = 1;
            }
            number--;
        }
        print(map, goalx, goaly);
    }

    private void print(int[][] map, int x, int y) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 1; i < map.length-1; i++) {
            for (int j = 1; j < map.length-1; j++) {
                strBuilder.append(map[i][j]).append(" ");
            }
            strBuilder.append("\n");
        }
        strBuilder.append(y).append(" ").append(x);
        System.out.println(strBuilder);
    }

    public static void main(String[] args) {
        new P01913___Snail().init();
    }
}