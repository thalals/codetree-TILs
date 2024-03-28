import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] map = new int[n+1][n+1];
        int[][] sum = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = sc.nextInt();

                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + map[i][j];
            }
        }

        //result

        int result = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < k || j < k) {
                    continue;
                }
                result = Math.max(result, sum[i][j] + sum[i-k][j-k] - sum[i-k][j]-sum[i][j-k]);
            }
        }

        System.out.println(result);
    }

}