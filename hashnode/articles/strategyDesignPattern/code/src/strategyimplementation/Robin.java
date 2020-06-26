package strategyimplementation;

public class Robin extends Superhero {
  @Override
  public void introduceMyself() {
    System.out.println("My name is Robin!");
  }

  public Robin() {
    flyAbility = new NoFlyingPossible();
    invisibilityAbility = new InvisibilityImpossible();
  }
}
