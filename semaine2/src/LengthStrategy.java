public class LengthStrategy implements Strategy{

    private int length;

    public LengthStrategy(int length){
        this.length = length;
    }
    @Override
    public boolean check(String word) {
        return word.length() == length;
    }
}
