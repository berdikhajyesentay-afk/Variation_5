import java.util.Stack;

public class StackSorter {
    public Stack<Integer> sortStack(Stack<Integer> original) {
        Stack<Integer> temp = new Stack<>();
        while (!original.isEmpty()) {
            int current = original.pop();
            while (!temp.isEmpty() && temp.peek() < current) {
                original.push(temp.pop());
            }
            temp.push(current);
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30); s.push(10); s.push(50); s.push(20);
        
        StackSorter sorter = new StackSorter();
        Stack<Integer> result = sorter.sortStack(s);
        System.out.println(result);
    }
}