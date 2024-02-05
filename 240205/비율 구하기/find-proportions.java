import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = n;

        Map<String, Integer> treeMap = new TreeMap<>();

        while (n-- > 0) {
            String key = sc.next();
            treeMap.put(key, treeMap.getOrDefault(key, 0) + 1);
        }

        for (String key : treeMap.keySet()) {
            System.out.printf("%s %.4f\n", key, (double) treeMap.get(key) / (double) total * 100);
        }

    }
}