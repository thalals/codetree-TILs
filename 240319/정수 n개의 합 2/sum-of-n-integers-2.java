import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] map = new int[n];
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            map[i] = sc.nextInt();
            if (i == 0) {
                sum[i] = map[i];
            }
            else{
                sum[i] = sum[i - 1] + map[i];
            }
        }

        //result
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n - k; i++) {
            result = Math.max(result, sum[i + k] - sum[i]);
        }

        System.out.println(result);
    }

}