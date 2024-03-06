import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> treeSet = new TreeSet<>();
        while (m > 0) {
            treeSet.add(m--);
        }

        int result = 0;

        while (n-- > 0) {
            Integer floor = treeSet.floor(sc.nextInt());
            if (floor == null) {
                break;
            }
            treeSet.remove(floor);
            result++;
        }

        System.out.println(result);

    }
}