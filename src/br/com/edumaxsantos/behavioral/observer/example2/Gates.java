package br.com.edumaxsantos.behavioral.observer.example2;

public class Gates implements AlarmListener {
    public void alarm() {
        System.out.println("gates close");
    }
}
