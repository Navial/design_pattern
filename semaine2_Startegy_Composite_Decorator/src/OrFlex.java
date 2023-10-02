import java.util.ArrayList;

public class OrFlex implements Strategy{

    public Strategy[] strategies;

    public OrFlex(Strategy...strategies){
        this.strategies = strategies;
    }

    @Override
    public boolean check(String word) {
        for(Strategy strat : strategies){
            if(strat.check(word))
                return true;
        }
        return false;
    }
}
