import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();

        TreeSet<Point> treeSet = new TreeSet<>();

        while (n-- > 0) {
            treeSet.add(new Point(sc.nextLong(), sc.nextLong()));
        }

        while (m-- > 0) {
            Point ceiling = treeSet.ceiling(new Point(sc.nextLong(), 0));

            if (ceiling == null) {
                System.out.println("-1 -1");
                continue;
            }
            treeSet.remove(ceiling);
            System.out.println(ceiling.print());
        }
    }
}

class Point implements Comparable<Point>{
    long x;
    long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {

        if (this.x == o.x) {
            return (int) (this.y- o.y);
        }
        else{
            return (int) (this.x - o.x);
        }
    }

    public String print() {
        return this.x + " " + this.y;
    }
}