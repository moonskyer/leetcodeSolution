package com.moonskyer.offer;

import java.util.Stack;

public class Offer09 {


    private Stack<Integer> mainStack;

    private Stack<Integer> tempStack;

    public Offer09() {
        mainStack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void appendTail(int value) {
        while (!mainStack.isEmpty()) {
            tempStack.push(mainStack.pop());
        }
        mainStack.push(value);
        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }
    }

    public int deleteHead() {
        return mainStack.isEmpty() ? -1 : mainStack.pop();
    }
}
