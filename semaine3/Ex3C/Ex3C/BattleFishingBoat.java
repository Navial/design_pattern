// Adapter :
//  - Adapter : BattleFishingBoat
//  - Adaptee : FishingBoat
//  - Client : App
//  - MethodA() : fire() / move()
//  - MethodB() : fish() / sail()
//  - DoWork() : main()

public class BattleFishingBoat implements BattleShip {

  private FishingBoat boat;

  public BattleFishingBoat() {
    boat = new FishingBoat();
  }

  @Override
  public void fire() {
    boat.fish();
  }

  @Override
  public void move(Distance distance) {
    boat.sail(distance);
  }
}
