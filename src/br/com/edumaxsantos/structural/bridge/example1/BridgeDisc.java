package br.com.edumaxsantos.structural.bridge.example1;

import java.util.List;
import java.util.Random;

public class BridgeDisc {

    public static void main(String[] args) {
        List<StackArray> stacks = List.of(new StackArray(), new StackFIFO(), new StackHanoi());
        StackList stackList = new StackList();
        for(int i = 1; i < 15; i++) {
            stacks.get(0).push(i);
            stackList.push(i);
            stacks.get(1).push(i);
        }

        Random rn = new Random();

        for (int i = 1; i < 15; i++) {
            stacks.get(2).push(rn.nextInt(20));
        }
        while(!stacks.get(0).isEmpty()) {
            System.out.print(stacks.get(0).pop() + " ");
        }
        System.out.println();
        while(!stackList.isEmpty()) {
            System.out.print(stackList.pop() + " ");
        }
        System.out.println();
        while(!stacks.get(1).isEmpty()) {
            System.out.print(stacks.get(1).pop() +  " ");
        }
        System.out.println();
        while(!stacks.get(2).isEmpty()) {
            System.out.print(stacks.get(2).pop() + " ");
        }
        System.out.println();
        System.out.println("total rejected is " + ((StackHanoi) stacks.get(2)).reportRejected());
    }
}
