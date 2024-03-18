import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        while (n-- > 0) {
            int nextInt = sc.nextInt();

            if (nextInt == 0) {
                if (priorityQueue.isEmpty()) {
                    System.out.println(0);
                }
                else System.out.println(priorityQueue.poll());
            } else priorityQueue.add(nextInt);
        }

    }

}