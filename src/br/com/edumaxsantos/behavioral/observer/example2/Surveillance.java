package br.com.edumaxsantos.behavioral.observer.example2;

// class inherit.
// type inheritance
public class Surveillance extends CheckList implements AlarmListener {
    public void alarm() {
        System.out.println("Surveillance - by the numbers:");
        byTheNumbers();
    }

    protected void isolate() {
        System.out.println("\t\ttrain the cameras");
    }
}
