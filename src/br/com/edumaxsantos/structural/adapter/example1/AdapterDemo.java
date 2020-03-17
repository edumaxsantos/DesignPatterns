package br.com.edumaxsantos.structural.adapter.example1;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new RectangleAdapter(new Rectangle()), new LineAdapter(new Line()));

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        shapes.forEach(shape -> shape.draw(x1, y1, x2, y2));
    }
}
