package br.com.edumaxsantos.behavioral.state.example1;

public class Chain {
    private State current;

    public Chain() {
        current = new Off();
    }

    public void setState(State state) {
        current = state;
    }

    public void pull() {
        current.pull(this);
    }
}
