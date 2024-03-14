import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        while (n-- > 0) {
            String next = sc.next();

            if (next.equals("push")) {
                priorityQueue.add(sc.nextInt());
            }

            if (next.equals("pop")) {
                System.out.println(priorityQueue.poll());
            }

            if (next.equals("size")) {
                System.out.println(priorityQueue.size());
            }

            if (next.equals("empty")) {
                System.out.println(priorityQueue.isEmpty() ? 1 : 0);
            }

            if (next.equals("top")) {
                System.out.println(priorityQueue.peek());
            }
        }
    }

}