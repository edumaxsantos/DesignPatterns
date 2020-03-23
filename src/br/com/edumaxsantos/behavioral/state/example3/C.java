package br.com.edumaxsantos.behavioral.state.example3;

public class C extends State {
    // 8. The State derived classes only override the messages they need to
    public void on() {
        System.out.println("C + on = B");
    }
}
