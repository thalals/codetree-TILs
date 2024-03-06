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

        for (Long number : treeSet) {
            //오른쪽
            Long ceiling = treeSet.ceiling(m + number);
            if (ceiling != null) {
                result = Math.min(result, ceiling - number);
            }

            //왼쪽
            Long lower = treeSet.lower(number - m);
            if (lower != null) {
                result = Math.min(result, number - lower);
            }
        }

        System.out.println(result == Integer.MAX_VALUE ? -1 : result);

    }
}