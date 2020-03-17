package br.com.edumaxsantos.behavioral.observer.example1;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    public void update() {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}
