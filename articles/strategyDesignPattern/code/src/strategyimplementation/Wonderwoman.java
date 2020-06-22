package strategyimplementation;

public class Wonderwoman extends Superhero {
  @Override
  public void introduceMyself() {
    System.out.println("My name is Wonderwoman!");
  }

  public Wonderwoman() {
    flyAbility = new SuperFastFly();
    invisibilityAbility = new InvisibilityPossible();
  }
}
