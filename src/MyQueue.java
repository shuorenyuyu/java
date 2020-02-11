import java.util.Stack;

class MyQueue{
    public static void main(String args[]){
        Squeue q = new Squeue();
        q.put(1);
        System.out.println(q.poll());
        q.put(2);
        System.out.println(q.top());
        q.put(3);
    }
    static class Squeue{
        Stack<Integer> input;
        Stack<Integer> output;
        Squeue(){
            input = new Stack<>();
            output = new Stack<>();
        }
        void put(int val){
            input.push(val);
        }
        int poll(){
            if(output.empty()){
                while(!input.empty()){
                    output.push(input.pop());
                }
            }
            return output.pop();
        }
        int top(){
            if(output.empty()){
                while(!input.empty()){
                    output.push(input.pop());
                }
            }
            return output.peek();
        }
        boolean isEmpty(){
            return input.empty()&&output.empty();
        }
    }
}