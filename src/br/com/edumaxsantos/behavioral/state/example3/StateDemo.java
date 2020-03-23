package br.com.edumaxsantos.behavioral.state.example3;

/*
State design pattern - an FSM with two states and one event
(distributed transition logic - logic in the derived state classes)
1. Create a "wrapper" class that models the state machine
2. The wrapper class contains an array of state concrete objects
3. The wrapper class contains an index to its "current" state
4. The wrapper class contains a state transition table
5. All client requests are simply delegated to the current state object
6. Create a state base class that makes the concrete states interchangeable
7. The State base class specifies default behavior for all messages
8. The State derived classes only override the messages they need to
 */
public class StateDemo {
    public static void main(String[] args) {
        FSM fsm = new FSM();
        int[] msgs = {2, 1, 2, 1, 0, 2, 0, 0};
        for(int msg: msgs) {
            if(msg == 0) {
                fsm.on();
            } else if(msg == 1) {
                fsm.off();
            } else if(msg == 2) {
                fsm.ack();
            }
        }
    }
}
