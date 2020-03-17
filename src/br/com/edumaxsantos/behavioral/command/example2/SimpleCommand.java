package br.com.edumaxsantos.behavioral.command.example2;

public class SimpleCommand {
    private int state;

    public SimpleCommand(int state) {
        this.state = state;
    }

    public void add(Integer value) {
        state += value;
    }

    public void addTwoOperands(Integer firstValue, Integer secondValue) {
        state = state + firstValue + secondValue;
    }

    public int getState() {
        return state;
    }
}
