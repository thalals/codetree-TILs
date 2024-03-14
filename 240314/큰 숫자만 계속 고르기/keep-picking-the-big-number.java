import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        while (n-- > 0) {
            priorityQueue.add(-sc.nextInt());
        }
        while (m-- > 0) {
            priorityQueue.add(priorityQueue.poll() + 1);
        }

        System.out.println(-priorityQueue.poll());
    }

}