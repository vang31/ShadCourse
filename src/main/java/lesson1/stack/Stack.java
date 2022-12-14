package lesson1.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack implements StackInter {

    private List<Integer> stack = new ArrayList<>();

    public Stack() {
    }


    /**
     * delete element from stack
     */
    @Override
    public void pop(int el) {
        int indexOfEl = 0;

        for(int i = 0; i < stack.size(); i++) {
            if(stack.get(i) == el) {
                indexOfEl = i;
            }
        }

        if(indexOfEl != 0) {
            stack.remove(indexOfEl);
        }
    }


    /**
     * add element to Stack
     * Stack work LIFO last in first out;
     */
    @Override
    public void push(int el) {
        stack.add(el);
    }

    public void print() {
        for(int i : stack) {
            System.out.println(i);
        }
    }


}