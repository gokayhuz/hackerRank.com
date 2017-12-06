package com.hackerrank.knightlOnChessboard;

import java.util.*;

class Point {
    int x;
    int y;
    int step;

    Point(int x, int y, int step) {
        this.x = x;
        this.y = y;
        this.step = step;
    }
}

public class Solution {
    public static boolean isValid(int x, int y, int n, boolean[][] visited) {
        if (x <= n && y <= n && x >= 1 && y >= 1 && !visited[x][y]) {
            return true;
        }
        return false;
    }

    /**
     * @return
     * 1 if we have reached (n,n)
     * 0 if we have made a change
     * -1 not valid
     */
    public static int processPoint(Point p, int i, int j, boolean[][] visited, int n, LinkedList<Point> points) {

        if (isValid(p.x, p.y, n, visited)) {
            if (p.x == n && p.y == n) {
                return 1;
            }
            visited[p.x ][p.y] = true;
            points.add(new Point(p.x, p.y, p.step));
            return 0;

        }
        return -1;
    }
    /**
     * @return
     * 1 if we have reached (n,n)
     * -1 if (n,n) cannot be reached
     * 0 otherwise
     */
    public static int checkPoints(Point p, int i, int j, boolean[][] visited, int n, LinkedList<Point> points, int step) {
        boolean more = false;
        int result;

        result = processPoint(new Point(p.x + i, p.y + j, step), i, j, visited, n, points);
        if (result == 1) return 1;
        if (result == 0) more = true;

        result = processPoint(new Point(p.x + i, p.y - j, step), i, j, visited, n, points);
        if (result == 1) return 1;
        if (result == 0) more = true;

        result = processPoint(new Point(p.x - i, p.y + j, step), i, j, visited, n, points);
        if (result == 1) return 1;
        if (result == 0) more = true;

        result = processPoint(new Point(p.x - i, p.y - j, step), i, j, visited, n, points);
        if (result == 1) return 1;
        if (result == 0) more = true;

        result = processPoint(new Point(p.x + j, p.y + i, step), i, i, visited, n, points);
        if (result == 1) return 1;
        if (result == 0) more = true;

        result = processPoint(new Point(p.x + j, p.y - i, step), i, i, visited, n, points);
        if (result == 1) return 1;
        if (result == 0) more = true;

        result = processPoint(new Point(p.x - j, p.y + i, step), i, i, visited, n, points);
        if (result == 1) return 1;
        if (result == 0) more = true;

        result = processPoint(new Point(p.x - j, p.y - i, step), i, i, visited, n, points);
        if (result == 1) return 1;
        if (result == 0) more = true;

        if (more) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                LinkedList<Point> points= new LinkedList<>();
                points.add(new Point(1,1 , 0));

                boolean[][] visited = new boolean[n+1][n+1];
                visited[1][1] = true;

                int step;
                int result = 0;
                while (!points.isEmpty()) {
                    Point curPoint = points.poll();
                    step = curPoint.step + 1;
                    result = checkPoints(curPoint, i, j, visited, n, points, step);
                    if (result == 1) {
                        sb.append(step).append(" ");
                        break;
                    }
                }
                if (points.isEmpty() && result != 1) sb.append("-1 ");

            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
