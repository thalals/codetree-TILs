import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer, Integer> treeMap = new TreeMap<>();

        while (n-- > 0) {
            String action = sc.next();

            if (action.equals("add")) {
                treeMap.put(sc.nextInt(), sc.nextInt());
            }

            if (action.equals("find")) {
                Optional<Integer> find = Optional.ofNullable(treeMap.get(sc.nextInt()));
                System.out.println(find.isPresent() ? find.get() : "None");
            }

            if (action.equals("remove")) {
                treeMap.remove(sc.nextInt());
            }

            if (action.equals("print_list")) {
                if (treeMap.isEmpty()) {
                    System.out.println("None");
                } else {
                    treeMap.keySet()
                            .forEach(key -> System.out.print(treeMap.get(key) + " "));
                    System.out.println();

                }
            }
        }

    }
}