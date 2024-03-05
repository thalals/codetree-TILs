import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(0);

        int min = 100001;
        while (n-- > 0) {
            int nextInt = sc.nextInt();
            treeSet.add(nextInt);

            Integer lower = treeSet.lower(nextInt);
            if (lower != null) {
                min = Math.min(min, nextInt - lower);
            }

            Integer higher = treeSet.higher(nextInt);
            if (higher != null) {
                min = Math.min(min, higher - nextInt);
            }

            System.out.println(min);
        }


    }
}