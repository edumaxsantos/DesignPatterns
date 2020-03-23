package br.com.edumaxsantos.behavioral.state.example3;

public class B extends State {
    public void on() {
        System.out.println("B + on = A");
    }

    public void off() {
        System.out.println("B + off = C");
    }
}
