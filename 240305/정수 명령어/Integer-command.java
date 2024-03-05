import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            TreeSet<Integer> treeSet = new TreeSet<>();

            int k = sc.nextInt();
            while (k-- > 0) {
                String action = sc.next();
                if (action.equals("I")) {
                    treeSet.add(sc.nextInt());
                } else {
                    if (sc.nextInt() == 1) {
                        if(!treeSet.isEmpty())
                            treeSet.remove(treeSet.last());
                    } else {
                        if(!treeSet.isEmpty())
                            treeSet.remove(treeSet.first());
                    }
                }
            }

            if (treeSet.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(treeSet.last() + " " + treeSet.first());
            }
        }


    }
}