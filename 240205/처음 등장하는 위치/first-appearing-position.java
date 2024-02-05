import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> treeMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String key = sc.next();
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, i);
            }
        }

        for (String key : treeMap.keySet()) {
            System.out.println(key +" " +treeMap.get(key));
        }
    }
}