package br.com.edumaxsantos.behavioral.state.example1;

public class Off extends State {
    public void pull(Chain wrapper) {
        wrapper.setState(new Low());
        System.out.println("  low speed");
    }
}
