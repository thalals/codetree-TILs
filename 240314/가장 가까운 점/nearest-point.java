import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Point> priorityQueue = new PriorityQueue<>();

        while (n-- > 0) {
            priorityQueue.add(new Point(sc.nextLong(), sc.nextLong()));
        }

        while (m-- > 0) {
            Point poll = priorityQueue.poll();
            poll.plus();
            priorityQueue.add(poll);
        }
        System.out.println(priorityQueue.poll().print());
    }

}

class Point implements Comparable<Point> {
    long x;
    long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getDistance() {
        return Math.abs(x) + Math.abs(y);
    }

    public void plus() {
        x += 2;
        y += 2;
    }

    @Override
    public int compareTo(Point o) {
        if (this.getDistance() == o.getDistance()) {
            if (o.x == this.x) {
                return (int) (this.y - o.y);
            }
            return (int) (this.x - o.x);
        }

        return (int) (this.getDistance() - o.getDistance());
    }

    public String print() {
        return x + " " + y;
    }
}