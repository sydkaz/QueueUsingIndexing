import java.util.Arrays;
import java.util.stream.IntStream;

class Queue {
    int[] queue;
    int start = -1;
    int end = -1;

    public Queue(int capacity) {
        this.queue = new int[capacity];
    }

    public void addToQueue(int element) {
        if(start == -1) { /*only for first element*/
            start++;
            end++;
            queue[start] = element;
        } else {
            end = ++end % queue.length;
            queue[end] = element;
        }
    }

    public int pop() {
       int element = 0;

        element = queue[start++ % queue.length];
        start = start % queue.length;
       return element;
    }
    public void display(){
        System.out.println("**********************");
        System.out.println("Start: "+start+" End:"+end);
        if(start>end){
            System.out.println("**********************");
        }
        IntStream.rangeClosed(start,end).forEach(e-> System.out.println("queue at "+e+" : "+queue[e]));
        System.out.println("**********************");
    }


}
public class Main {
    public static void main(String[] args) {
        Queue q= new Queue(5);
        q.addToQueue(100);
        q.addToQueue(200);
        q.addToQueue(300);
        q.addToQueue(400);
        q.display();
        System.out.println(q.pop());
        q.display();

        q.addToQueue(500);
        q.addToQueue(600);
        q.display();

        System.out.println(q.pop());
        System.out.println(q.pop());
        q.addToQueue(700);
        q.addToQueue(800);
        q.display();

        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.display();
    }
}
