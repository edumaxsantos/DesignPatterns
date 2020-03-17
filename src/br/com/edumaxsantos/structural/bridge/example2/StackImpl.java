package br.com.edumaxsantos.structural.bridge.example2;

public interface StackImpl {
    void push(int i);
    int pop();
    int top();
    boolean isEmpty();
    boolean isFull();
}
