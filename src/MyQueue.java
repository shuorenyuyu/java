import java.util.Stack;

public class MyQueue {
    public static void main(String args[]){
        SQueue queue = new SQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // returns 1
        System.out.println(queue.poll()); // returns 1
        System.out.println(queue.empty()); // returns false
    }
    static class SQueue{
        Stack<Integer> input;
        Stack<Integer> output;
         SQueue(){
             input = new Stack<>();
             output = new Stack<>();
        }
        void push(int val){
             input.push(val);
        }
        int poll(){
             while(!input.empty()){
                 output.push(input.pop());
             }
             return output.pop();
        }
        int peek(){
            while(!input.empty()){
                output.push(input.pop());
            }
            return output.peek();
        }
        boolean empty(){
             return input.empty();
        }
    }
}
