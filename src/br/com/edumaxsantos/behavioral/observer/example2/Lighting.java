package br.com.edumaxsantos.behavioral.observer.example2;

public class Lighting implements AlarmListener {
    public void alarm() {
        System.out.println("lights up");
    }
}
