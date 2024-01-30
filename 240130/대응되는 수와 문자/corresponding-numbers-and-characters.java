import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(reader.readLine());
        String[] str = reader.readLine().split(" ");

        Map<String, String> map = new HashMap<>();

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        for (int i = 1; i <= n; i++) {
            String s = reader.readLine();
            map.put(s, i + "");
            map.put(i + "",s);
        }

        while (m-- > 0) {
            System.out.println(map.get(reader.readLine()));
        }
    }

}