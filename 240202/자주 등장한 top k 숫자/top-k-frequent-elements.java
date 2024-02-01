import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        while (n-- > 0) {
            int number = sc.nextInt();

            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        //result

        TreeSet<Point> set = new TreeSet<>();
        for (int key : map.keySet()) {
            set.add(new Point(key, map.get(key)));
        }

        set.stream().limit(k).forEach(point -> System.out.print(point.number + " "));
    }
}

class Point implements Comparable<Point> {
    int number;
    int count;

    public Point(int number, int count) {
        this.number = number;
        this.count = count;
    }

    @Override
    public int compareTo(Point o) {
        if (this.count == o.count) {
            return o.number - this.number;
        }
        return o.count - this.count;
    }

}