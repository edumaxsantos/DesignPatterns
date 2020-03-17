package br.com.edumaxsantos.behavioral.observer.example2;

public class CheckList {
    // Template Method design pattern
    public void byTheNumbers() {
        localize();
        isolate();
        identify();
    }

    protected void localize() {
        System.out.println("\t\testablish a perimeter");
    }

    protected void isolate() {
        System.out.println("\t\tisolate the grid");
    }

    protected void identify() {
        System.out.println("\t\tidentify the source");
    }
}
