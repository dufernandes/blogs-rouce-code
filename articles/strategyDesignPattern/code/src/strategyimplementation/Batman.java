package strategyimplementation;

public class Batman extends Superhero {
  @Override
  public void introduceMyself() {
    System.out.println("My name is Batman!!");
  }

  public Batman() {
    flyAbility = new NoFlyingPossible();
    invisibilityAbility = new InvisibilityImpossible();
  }
}
