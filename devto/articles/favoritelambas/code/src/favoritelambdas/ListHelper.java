package favoritelambdas;

import java.util.Arrays;
import java.util.List;

public class ListHelper {
  public static <T> void printListInOneLine(String title, List<T> filteredElements) {
    System.out.println(title + " " + Arrays.toString(filteredElements.toArray()));
  }
}
