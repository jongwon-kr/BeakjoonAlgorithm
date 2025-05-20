import java.io.*;
import java.util.*;

public class Main {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void printlnPoint() {
            System.out.println(x + " " + y);
        }
    }

    static int N;
    static ArrayList<Point> board = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Point newPoint = new Point(x, y);
            board.add(newPoint);
        }

        board.sort(Comparator.comparingInt((Point p) -> p.y).thenComparingInt((Point p) -> p.x));

        board.stream().forEach(Point::printlnPoint);
    }
}
