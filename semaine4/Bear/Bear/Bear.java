
public class Bear {

    public enum State {
        AWAKE{
            public void attack(Bear b) {
                System.out.println("Grraaww !!");
            }

            public static void wakeup(Bear b) {
                throw new RuntimeException("already not sleeping");
            }
        }, SLEEPING{
            public void attack(Bear b) {
                System.out.println("ZzzzZZZzzzzz");
            }

            public static void sleep(Bear b) {
                throw new RuntimeException("already sleeping");
            }
        };

        abstract void attack(Bear b);

        public static void sleep(Bear b) {
            b.setState(State.SLEEPING);
        }
        public static void wakeup(Bear b) {
            b.setState(State.AWAKE);
        }

    }
    private State state;
    public Bear() {
        setState(State.AWAKE);
    }
    public void attack() {
        state.attack(this);

        // if (state.equals("not sleeping")) System.out.println("GroaaR");
        // if (state.equals("sleeping")) System.out.println("Zzzzzz");
    }

    public void sleep() {
        state.sleep(this);

        // if (state.equals("sleeping")) throw new RuntimeException("already sleeping");
        // else setState(state);
    }

    public void wakeup() {
        state.wakeup(this);
        // if (state.equals("not sleeping")) throw new RuntimeException("already not sleeping");
        // else setState(state);
    }

    public void setState(State state) {
        this.state= state;
    }

    public static void main(String[] args) {
        Bear b= new Bear();
        b.attack();
        b.sleep();
        b.attack();
    }
}