package com.moonskyer.offer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Offer13 {

    public static void main(String[] args) {
        new Offer13().movingCount(3, 2, 17);
    }

    public int movingCount(int m, int n, int k) {
        Queue<Pair> queue = new ArrayDeque<Pair>();
        queue.add(new Pair(0, 0));
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        int ans = 1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        while (!queue.isEmpty()) {
            Pair node = queue.poll();
            for (int kk = 0; kk < 4; kk++) {
                int x = dx[kk] + node.x;
                int y = dy[kk] + node.y;
                if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y]) {
                    Pair pair = new Pair(x, y);
                    visited[x][y] = true;
                    if (pair.isLessThan(k)) {
                        queue.add(pair);
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

     class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        boolean isLessThan(int k) {
            int count = 0;
            int x=this.x;
            int y=this.y;
            while (x > 0) {
                count += x % 10;
                x /= 10;
            }
            while (y > 0) {
                count += y % 10;
                y /= 10;
            }
            return count <= k;
        }
    }
}
