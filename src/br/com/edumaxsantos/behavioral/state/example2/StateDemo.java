package br.com.edumaxsantos.behavioral.state.example2;

import java.io.IOException;
import java.io.InputStreamReader;

/*
State design pattern - an FSM with two states and one event
(distributed transition logic - logic in the derived state classes)
1. Create a "wrapper" class that models the state machine
2. The wrapper class maintains a "current" state object
3. All client requests are simply delegated to the current state object
    and the wrapper object's "this" pointer is passed
4. Create a state base class that makes the concrete states interchangeable
5. The State base class specifies any useful "default" behavior
6. The State derived classes only override the messages they need to
7. The State methods will change the "current" state in the "wrapper"
 */
public class StateDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        Button btn = new Button();
        while(true) {
            System.out.println("Press 'Enter'");
            is.read();
            btn.push();
        }
    }
}
