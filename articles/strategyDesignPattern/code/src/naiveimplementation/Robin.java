package naiveimplementation;

public class Robin extends Superhero {

  @Override
  public void fly() {
    System.out.println("I cannot fly!");
  }

  @Override
  public void introduceMyself() {
    System.out.println("My name is Robin!");
  }
}
