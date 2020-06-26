package strategyimplementation;

public class Superman extends Superhero {
  @Override
  public void introduceMyself() {
    System.out.println("My name is Superman!");
  }

  public Superman() {
    flyAbility = new SuperFastFly();
    invisibilityAbility = new InvisibilityImpossible();
  }
}
