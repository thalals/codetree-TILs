import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        TreeSet<Long> treeSet = new TreeSet<>();

        while (n-- > 0) {
            treeSet.add(sc.nextLong());
        }

        Deque<Long> result = new ArrayDeque<>();

        while (k-- > 0) {
            Long last = treeSet.last();
            result.add(last);
            treeSet.remove(last);
        }

        result.forEach(a -> System.out.print(a+ " "));
    }
}