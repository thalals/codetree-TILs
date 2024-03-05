import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        TreeSet<Pair> treeSet = new TreeSet<>();

        while (n-- > 0) {
            treeSet.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        while (m-- > 0) {
            Pair pair = new Pair(sc.nextInt(), sc.nextInt());
            Pair ceiling = treeSet.ceiling(pair);
            System.out.println(Objects.isNull(ceiling) ? "-1 -1" : ceiling.print());
        }

    }
}

class Pair implements Comparable<Pair> {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair p) {          // (키, 몸무게) 순 오름차순 정렬
        if(this.x != p.x)         // 키가 다르다면
            return this.x - p.x;  // 키를 기준으로 오름차순 정렬을 진행합니다.
        else                                // 키가 같다면
            return this.y - p.y;  // 몸무게 기준으로 오름차순 정렬을 진행합니다.
    }

    public String print() {
        return x + " " + y;
    }
};