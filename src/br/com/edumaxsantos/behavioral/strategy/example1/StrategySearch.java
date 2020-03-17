package br.com.edumaxsantos.behavioral.strategy.example1;

// 2. Bury implementation
public abstract class StrategySearch implements Strategy {
    // 3. Template Method
    public void solve() {
        while(true) {
            preProcess();
            if(search()) {
                break;
            }
            postProcess();
        }
    }

    abstract void preProcess();
    abstract boolean search();
    abstract void postProcess();
}
