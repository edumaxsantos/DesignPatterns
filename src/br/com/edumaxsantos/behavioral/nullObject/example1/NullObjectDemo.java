package br.com.edumaxsantos.behavioral.nullObject.example1;

public class NullObjectDemo {

    public static void main(String[] args) {
        Application app = new Application(new NullPrintStream());
        app.doSomething();
    }
}
