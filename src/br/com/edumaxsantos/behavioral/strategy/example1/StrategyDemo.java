package br.com.edumaxsantos.behavioral.strategy.example1;

import java.util.List;
/*
1. Define the interface of an interchangeable family of algorithms
2. Bury algorithm implementation details in derived classes
3. Derived classes could be implemented using the Template Method pattern
4. Clients of the algorithm couple themselves strictly to the interface
 */

// 4. Clients couple strictly to the interface
public class StrategyDemo {
    // client code here
    private static void execute(Strategy strategy) {
        strategy.solve();
    }

    public static void main(String[] args) {
        List<Strategy> algorithms = List.of(new FOO(), new BAR());
        algorithms.forEach(StrategyDemo::execute);
    }
}
