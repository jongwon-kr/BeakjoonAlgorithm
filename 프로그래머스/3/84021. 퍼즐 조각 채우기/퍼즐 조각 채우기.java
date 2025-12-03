import java.util.*;
import java.io.*;

class Solution {
    
    class Point implements Comparable<Point> {
        int r, c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public int compareTo(Point o) {
            if (this.r != o.r) {
                return this.r - o.r;
            }
            return this.c - o.c;
        }
    }
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};
    
    public int solution(int[][] game_board, int[][] table) {
        int answer = 0;
        int size = game_board.length;

        List<List<Point>> emptySpaces = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (game_board[i][j] == 0) {
                    emptySpaces.add(bfs(game_board, i, j, 0));
                }
            }
        }

        List<List<Point>> puzzles = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (table[i][j] == 1) {
                    puzzles.add(bfs(table, i, j, 1));
                }
            }
        }

        boolean[] visitedPuzzles = new boolean[puzzles.size()];

        for (List<Point> space : emptySpaces) {
            for (int i = 0; i < puzzles.size(); i++) {
                if (visitedPuzzles[i]) continue;

                List<Point> puzzle = puzzles.get(i);

                if (space.size() != puzzle.size()) continue;

                if (isMatch(space, puzzle)) {
                    answer += space.size();
                    visitedPuzzles[i] = true;
                    break;
                }
            }
        }

        return answer;
    }

    private boolean isMatch(List<Point> space, List<Point> puzzle) {
        List<Point> currentPuzzle = new ArrayList<>();
        for (Point p : puzzle) {
            currentPuzzle.add(new Point(p.r, p.c));
        }

        for (int i = 0; i < 4; i++) {
            normalize(currentPuzzle);
            Collections.sort(currentPuzzle);

            if (checkSame(space, currentPuzzle)) {
                return true;
            }

            rotate(currentPuzzle);
        }
        return false;
    }

    private boolean checkSame(List<Point> space, List<Point> puzzle) {
        for (int i = 0; i < space.size(); i++) {
            Point p1 = space.get(i);
            Point p2 = puzzle.get(i);
            if (p1.r != p2.r || p1.c != p2.c) {
                return false;
            }
        }
        return true;
    }

    private void normalize(List<Point> points) {
        int minR = Integer.MAX_VALUE;
        int minC = Integer.MAX_VALUE;

        for (Point p : points) {
            minR = Math.min(minR, p.r);
            minC = Math.min(minC, p.c);
        }

        for (Point p : points) {
            p.r -= minR;
            p.c -= minC;
        }
    }

    private void rotate(List<Point> points) {
        for (Point p : points) {
            int temp = p.r;
            p.r = p.c;
            p.c = -temp;
        }
    }

    private List<Point> bfs(int[][] board, int x, int y, int target) {
        List<Point> shape = new ArrayList<>();
        Queue<Point> q = new LinkedList<>();

        q.offer(new Point(x, y));
        board[x][y] = -1;
        shape.add(new Point(x, y));

        int n = board.length;

        while (!q.isEmpty()) {
            Point curr = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = curr.r + dr[i];
                int nc = curr.c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < n && nc < n) {
                    if (board[nr][nc] == target) {
                        board[nr][nc] = -1; // 방문 처리
                        q.offer(new Point(nr, nc));
                        shape.add(new Point(nr, nc));
                    }
                }
            }
        }

        normalize(shape);
        Collections.sort(shape);
        return shape;
    }
}