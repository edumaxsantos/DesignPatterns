package br.com.edumaxsantos.behavioral.command.example1;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static List<Command> produceRequests() {
        List<Command> queue = new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    public static void workOffRequests(List<Command> queue) {
        queue.forEach(Command::execute);
    }

    public static void main(String[] args) {
        List<Command> queue = produceRequests();
        workOffRequests(queue);
    }
}
