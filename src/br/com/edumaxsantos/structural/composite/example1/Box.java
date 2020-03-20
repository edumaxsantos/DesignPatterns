package br.com.edumaxsantos.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Box extends Entity {
    private List<Entity> children = new ArrayList<>();
    private int value;

    public Box(int val) {
        value = val;
    }

    public void add(Entity c) {
        children.add(c);
    }

    public void traverse(int[] levels) {
        if(printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
            indent.append("   ");
        }
        level++;
        for(Entity child: children) {
            child.traverse(levels);
        }
        level--;
        if(printThisLevel(levels)) {
            indent.setLength(indent.length() - 3);
        }
    }
}
