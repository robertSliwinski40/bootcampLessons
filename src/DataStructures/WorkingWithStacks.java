package DataStructures;
/*
LIFO
pop, push, peak
 */

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(22);
        stack.push(33);

        System.out.println(stack.peek());
        System.out.println("size is: "+stack.size());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println("size is: "+stack.size());
        System.out.println(stack.isEmpty());


    }



}
