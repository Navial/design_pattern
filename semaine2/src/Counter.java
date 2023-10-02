public class Counter implements Strategy {

    private int counter;
    private Strategy strategy;

    public Counter(Strategy strategy){
        this.counter = 0;
        this.strategy = strategy;
    }

    @Override
    public boolean check(String word) {
        if(strategy.check(word)){
            this.counter ++;
            return true;
        }
        return false;
    }

    public int getCounter(){
        return this.counter;
    }
}
