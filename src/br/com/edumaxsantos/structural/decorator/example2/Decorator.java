package br.com.edumaxsantos.structural.decorator.example2;

public abstract class Decorator implements Widget {

    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void draw() {
        widget.draw();
    }
}
