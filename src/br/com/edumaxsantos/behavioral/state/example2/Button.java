package br.com.edumaxsantos.behavioral.state.example2;

// 1. The "wrapper" class
public class Button {
    // 2. The "current" state object
    private State current;

    public Button() {
        current = OFF.instance();
    }

    public void setCurrent(State s) {
        current = s;
    }

    // 3. The "wrapper" always delegates to the "wrappee"
    public void push() {
        current.push(this);
    }
}
