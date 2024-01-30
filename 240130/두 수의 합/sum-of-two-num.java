import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");
        Integer[] numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            List<Integer> indexList = map.getOrDefault(numbers[i], new ArrayList<>());
            indexList.add(i);
            map.put(numbers[i], indexList);
        }

        int result = 0;
        int k = Integer.parseInt(str[1]);

        for(int i=0;i < numbers.length;i++){
            int findNumber = k - numbers[i];

            if (map.containsKey(findNumber)) {
                int index = i;
                result += (int) map.get(findNumber).parallelStream().filter(value -> value > index).count();
            }
        }

        System.out.println(result);

    }

}