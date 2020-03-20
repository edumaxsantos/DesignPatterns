package br.com.edumaxsantos.structural.composite.example1;

public class Product extends Entity {
    private int value;

    public Product(int value) {
        this.value = value;
    }

    public void traverse(int[] levels) {
        if(printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
        }
    }
}
