public class Not implements Strategy{
    Strategy strategy;

    public  Not(Strategy strategy){
        this.strategy = strategy;
    }

    @Override
    public boolean check(String word) {
        return !strategy.check(word);
    }
}
