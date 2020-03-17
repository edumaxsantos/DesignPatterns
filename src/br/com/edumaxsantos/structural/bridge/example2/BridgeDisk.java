package br.com.edumaxsantos.structural.bridge.example2;

import java.util.List;
import java.util.Random;

public class BridgeDisk {
    public static void main(String[] args) {
        List<Stack> stacks = List.of(new Stack("array"), new Stack("list"), new StackFIFO(), new StackHanoi());

        for(int i = 1; i < 15; i++) {
            for (int j = 0; j < 3; j++) {
                stacks.get(j).push(i);
            }
        }

        Random rn = new Random();

        for(int i = 1; i < 15; i++) {
            stacks.get(3).push(rn.nextInt(20));
        }

        for (Stack stack: stacks) {
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
        System.out.println("total rejected is " + ((StackHanoi) stacks.get(3)).reportRejected());
    }
}
