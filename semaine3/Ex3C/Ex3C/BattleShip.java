// Decorator :
//  - Component = BattleShip
//  - ConcreteComponent = BattleFishingBoat
//  - ConcreteDecorator = Captain
//

public interface BattleShip {

  void fire();

  void move(Distance distance);

}
