import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> hashSet = new HashSet<>();

        while (n-- > 0) {
            hashSet.add(sc.nextInt());
        }

        int k = sc.nextInt();

        while (k-- > 0) {
            System.out.print(hashSet.contains(sc.nextInt()) ? 1 + " " : 0 + " ");
        }

    }
}