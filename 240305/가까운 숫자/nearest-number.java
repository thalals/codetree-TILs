import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Long> treeSet = new TreeSet<>();
        treeSet.add(0L);

        long min = Long.MAX_VALUE;
        while (n-- > 0) {
            long nextInt = sc.nextLong();
            treeSet.add(nextInt);

            Long lower = treeSet.lower(nextInt);
            if (lower != null) {
                min = Math.min(min, nextInt - lower);
            }

            Long higher = treeSet.higher(nextInt);
            if (higher != null) {
                min = Math.min(min, higher - nextInt);
            }

            System.out.println(min);
        }


    }
}