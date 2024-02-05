import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> treeMap = new TreeMap<>();

        while (n-- > 0) {
            String key = sc.next();
            treeMap.put(key, treeMap.getOrDefault(key, 0) + 1);
        }

        treeMap.keySet().forEach(key -> System.out.println(key + " " + treeMap.get(key)));
    }
}