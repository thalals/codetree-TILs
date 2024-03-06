import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();

        TreeSet<Long> treeSet = new TreeSet<>();

        long result = Integer.MAX_VALUE;


        while (n-- > 0) {
            if (treeSet.isEmpty()) {
                treeSet.add(sc.nextLong());
            }
            else{
                long next = sc.nextLong();

                //오른쪽
                Long higher = treeSet.higher(next);
                while (!Objects.isNull(higher)) {
                    if (higher - next >= m) {
                        result = Math.min(result, higher - next);
                        break;
                    }
                    higher = treeSet.higher(higher);
                }

                //왼쪽
                Long lower = treeSet.lower(next);
                while (!Objects.isNull(lower)) {
                    if (next - lower >= m) {
                        result = Math.min(result, next - lower);
                        break;
                    }
                    lower = treeSet.lower(lower);
                }
            }
        }

        System.out.println(result==Integer.MAX_VALUE?-1 : result);

    }
}