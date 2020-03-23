package br.com.edumaxsantos.behavioral.state.example4;

/*
1. Create a "wrapper" class that models the state machine
2. The wrapper class contains an array of state concrete objects
3. The wrapper class contains an index to its "current" state
4. Client requests are delegated to the current state and "this" is passed
5. Create a state base class that makes the concrete states interchangeable
6. The State base class specifies default behavior for all messages
7. The State derived classes only override the messages they need to
8. The derived classes "call back to" the wrapper class to change its current
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
