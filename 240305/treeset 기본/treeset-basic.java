import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Integer> treeSet = new TreeSet<>();

        while (n-- > 0) {

            String action = sc.next();

            if (action.equals("add")) {
                treeSet.add(sc.nextInt());
            }

            if (action.equals("remove")) {
                treeSet.remove(sc.nextInt());
            }

            if (action.equals("find")) {
                System.out.println(treeSet.contains(sc.nextInt()));
            }

            if (action.equals("lower_bound")) {
                int nextInt = sc.nextInt();
                Optional<Integer> lower = treeSet.stream().filter(number -> number >= nextInt).findFirst();
                if (lower.isPresent()) {
                    System.out.println(lower.get());
                }
                else System.out.println("None");
            }

            if (action.equals("upper_bound")) {
                int nextInt = sc.nextInt();
                Optional<Integer> upper = treeSet.stream().filter(number -> number > nextInt).findFirst();
                if (upper.isPresent()) {
                    System.out.println(upper.get());
                }
                else System.out.println("None");
            }

            if (action.equals("largest")) {
                if (!treeSet.isEmpty()) {
                    System.out.println(treeSet.last());
                }
                else System.out.println("None");

            }

            if (action.equals("smallest")) {
                if (!treeSet.isEmpty()) {
                    System.out.println(treeSet.first());
                }
                else System.out.println("None");

            }
        }
    }
}