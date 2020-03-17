package br.com.edumaxsantos.structural.decorator.example2;

public class DecoratorDemo {
    public static void main(String[] args) {
        Widget widget = new BorderDecorator(
                new BorderDecorator(new ScrollDecorator(new TextField(80, 24)))
        );
        widget.draw();
    }
}
