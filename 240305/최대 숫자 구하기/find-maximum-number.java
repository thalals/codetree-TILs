import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        TreeSet<Integer> treeSet = new TreeSet<>();

        while (n > 0) {
            treeSet.add(n);
            n -= 1;
        }

        while (m-- > 0) {
            treeSet.remove(sc.nextInt());
            System.out.println(treeSet.last());
        }


    }
}