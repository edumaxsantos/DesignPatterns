package br.com.edumaxsantos.structural.composite.example2;

/*
1. Create a "lowest common denominator" that makes classes interchangeable
2. All concrete classes declare an "isa" relationship to the interface
3. All "container" classes couple themselves to the interface
4. "Container" classes use polymorphism as they delegate to their children
 */
public class CompositeDemo {

    public static void main(String[] args) {
        Composite first = new Row(1);
        Composite second = new Column(2);
        Composite third = new Column(3);
        Composite fourth = new Row(4);
        Composite fifth = new Row(5);
        first.add(second);
        first.add(third);
        third.add(fourth);
        third.add(fifth);
        first.add(new Primitive(6));
        second.add(new Primitive(7));
        third.add(new Primitive(8));
        fourth.add(new Primitive(9));
        fifth.add(new Primitive(10));
        first.traverse();
    }
}
