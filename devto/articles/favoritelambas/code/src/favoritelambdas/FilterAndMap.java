package favoritelambdas;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {

  public static void filterByCoolnessAndTransformIntoSuperheroes() {
    List<Superhero> coolSuperheroes =
        Person.createPersonList().stream()
            .filter(Person::isPersonCool)
            .map(coolPeople -> new Superhero(coolPeople.getName(), "be invisible"))
            .collect(Collectors.toList());

    ListHelper.printListInOneLine("Filter by coolness and map to superheroes",  coolSuperheroes);
  }
}
