import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Integer> treeSet = new TreeSet<>();

        while (n-- > 0) {
            treeSet.add(sc.nextInt());
        }

        while (m-- > 0) {
            Integer ceiling = treeSet.ceiling(sc.nextInt());

            System.out.println(Objects.isNull(ceiling) ? -1 : ceiling);
        }
    }
}