package br.com.edumaxsantos.behavioral.state.example3;

public class A extends State {
    public void on() {
        System.out.println("A + on = C");
    }

    public void off() {
        System.out.println("A + off = B");
    }

    public void ack() {
        System.out.println("A + ack = A");
    }
}
