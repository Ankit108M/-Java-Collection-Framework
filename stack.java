import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        // Create a stack of Strings
        Stack<String> stack = new Stack<>();

        // Push elements into the stack (add)
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");

        // Print the stack
        System.out.println("Current Stack: " + stack);

        // Peek top element (doesn't remove)
        System.out.println("Top element: " + stack.peek());

        // Pop an element (removes the top one)
        System.out.println("Popped: " + stack.pop());

        // Print stack after pop
        System.out.println("Stack after pop: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}
