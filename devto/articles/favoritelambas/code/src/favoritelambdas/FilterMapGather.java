package favoritelambdas;

import java.util.OptionalDouble;

public class FilterMapGather {

  public static void filterByCoolnessTransformIntoSuperheroCalculageAgeAverage() {
    OptionalDouble averageAge = Person.createPersonList().stream()
        .filter(Person::isPersonCool)
        .map(coolPeople -> new Superhero(coolPeople.getAge(), coolPeople.getName(), "be invisible"))
        .mapToInt(Superhero::getAge)
        .average();

    PrintHelper.printValue("Filter by coolness, map to Superhero and calculate age mean", averageAge.getAsDouble());
  }
}
