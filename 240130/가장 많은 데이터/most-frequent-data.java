import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
//        String[] str = reader.readLine().split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = reader.readLine();

            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        System.out.println(map.values().stream().mapToInt(Integer::intValue).max().getAsInt());


    }

}