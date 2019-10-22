import java.util.Queue;
import java.util.*;

public class MyStack {
    public static void main(String args[]){
        QStack stack = new QStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());   // returns 2
        System.out.println(stack.pop());   // returns 2
        System.out.println(stack.empty());  // returns false
    }
    static class QStack{
        Queue<Integer> input;
         QStack(){
            input = new LinkedList<>();
        }

        void push(int val){
             input.offer(val);
             for(int i=0; i<input.size()-1;i++){
                 input.offer(input.poll());
             }
        }
        int pop(){
             return input.poll();
        }
        int top(){
             return input.peek();
        }
        boolean empty(){
             return input.isEmpty();
        }
    }
}
