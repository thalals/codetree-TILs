import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Map<String, String> map = new HashMap<>();

        while (n-- > 0) {
            String[] str = reader.readLine().split(" ");

            if (str[0].equals("add")) {
                map.put(str[1], str[2]);
            }

            if (str[0].equals("remove")) {
                map.remove(str[1]);
            }

            if (str[0].equals("find")) {
                System.out.println(map.getOrDefault(str[1], "None"));
            }
        }
    }

}