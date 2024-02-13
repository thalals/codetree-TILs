import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        HashSet[] setArrays = new HashSet[n + 1];
        for (int i = 0; i < setArrays.length; i++) {
            setArrays[i] = new HashSet<Integer>();
            setArrays[i].add(i);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, i);
        }

        int[] routine = new int[k * 2];
        for (int i = 0; i < k * 2; i++) {
            routine[i] = sc.nextInt();
        }

        for (int q = 0; q < 3; q++) {
            for (int i = 0; i < k*2;) {
                int aIndex = routine[i++];
                int bIndex = routine[i++];

                int a1 = map.get(aIndex);
                int b1 = map.get(bIndex);

                setArrays[a1].add(bIndex);
                setArrays[b1].add(aIndex);

                //바꿔
                map.put(aIndex, b1);
                map.put(bIndex, a1);

            }
        }

        for (int i = 1; i < setArrays.length; i++) {
            System.out.println(setArrays[i].size());
        }
    }
}