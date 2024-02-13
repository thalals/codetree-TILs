import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> hashSet = new HashSet<>();

        while (n-- > 0) {
            String key = sc.next();

            if (key.equals("find")) {
                System.out.println(hashSet.contains(sc.nextInt()));
            }

            if (key.equals("add")) {
                hashSet.add(sc.nextInt());
            }

            if (key.equals("remove")) {
                hashSet.remove(sc.nextInt());
            }
        }

    }
}