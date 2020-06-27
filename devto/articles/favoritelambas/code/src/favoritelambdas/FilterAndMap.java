package favoritelambdas;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {

  public static void filterByCoolnessAndTransformIntoSuperheroes() {
    List<Superhero> coolSuperheroes =
        Person.createPersonList().stream()
            .filter(Person::isPersonCool)
            .map(coolPeople -> new Superhero(coolPeople.getAge(), coolPeople.getName(), "be invisible"))
            .collect(Collectors.toList());

    PrintHelper.printListInOneLine("Filter by coolness and map to superheroes:",  coolSuperheroes);
  }
}
