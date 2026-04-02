import java.util.Stack;
public class stack {

    public static void main(String[] args) {
        Stack<String> ex  = new Stack<>();
        ex.push("hi");
        ex.push("bye");
        System.out.println(ex);
        ex.pop();
        System.out.println(ex);
    }
}