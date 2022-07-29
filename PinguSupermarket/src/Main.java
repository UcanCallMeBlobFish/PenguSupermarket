import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         LinkedStack<Integer> first = new LinkedStack<Integer>();

         first.push(5);
         first.push(10);
         first.pop();
        System.out.println(first);
    }
}