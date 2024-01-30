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

        Map<Integer, Queue<Integer>> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            Queue<Integer> queue = map.getOrDefault(numbers[i], new LinkedList<>());
            queue.add(i);
            map.put(numbers[i], queue);
        }

        int result = 0;
        int k = Integer.parseInt(str[1]);

        for(int i=0;i < numbers.length;i++){
            int findNumber = k - numbers[i];

            if (map.containsKey(findNumber)) {
                Queue<Integer> queue = map.get(findNumber);

                while (!queue.isEmpty() && queue.peek() <= i) {
                    queue.poll();
                }

                result += queue.size();
            }
        }

        System.out.println(result);

    }

}