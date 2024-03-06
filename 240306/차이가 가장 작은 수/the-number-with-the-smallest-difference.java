import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();

        TreeSet<Long> treeSet = new TreeSet<>();

        long result = Integer.MAX_VALUE;

        while (n-- > 0) {
            treeSet.add(sc.nextLong());
        }

        Long biggest = treeSet.last();
        Long lower = treeSet.lower(biggest);

        while (!treeSet.isEmpty()) {
            if (biggest < m || lower == null) {
                break;
            }

            long mathResult = biggest - lower;
            if (mathResult >= m) {
                result = Math.min(result, mathResult);

                biggest = treeSet.lower(treeSet.last());
                treeSet.remove(treeSet.last());
                lower = treeSet.lower(biggest);
            }

            if (mathResult < m) {
                lower = treeSet.lower(lower);
            }
        }

        System.out.println(result==Integer.MAX_VALUE?-1 : result);

    }
}