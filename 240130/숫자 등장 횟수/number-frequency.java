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
        String[] nList = reader.readLine().split(" ");
        String[] mList = reader.readLine().split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s : nList) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for (String s : mList) {
            System.out.print(map.getOrDefault(s, 0) + " ");
        }



    }

}