package favoritelambdas;

public class Superhero {
  private String name;
  private String superPower;

  public Superhero(String name, String superPower) {
    this.name = name;
    this.superPower = superPower;
  }

  @Override
  public String toString() {
    return "Superhero{" +
        "name='" + name + '\'' +
        ", superPower='" + superPower + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSuperPower() {
    return superPower;
  }

  public void setSuperPower(String superPower) {
    this.superPower = superPower;
  }
}
