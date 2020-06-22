package strategyimplementation;

public class NoFlyingPossible implements FlyAbility {
  @Override
  public void fly() {
    System.out.println("I cannot fly at all!!!l");
  }
}
