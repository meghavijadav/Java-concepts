import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
//        Queue<Integer> q = new ArrayDeque<>(); //ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
