package strategyimplementation;

public abstract class Superhero {

  protected FlyAbility flyAbility;

  protected InvisibilityAbility invisibilityAbility;

  public void punch() {
    System.out.println("punch!!");
  }

  public void kick() {
    System.out.println("kick!!");
  }

  public void performFly() {
    flyAbility.fly();
  }

  public void becomeInvisible() {
    invisibilityAbility.becomeInvisible();
  }

  public abstract void introduceMyself();
}
