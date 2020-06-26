package favoritelambdas;

import java.util.Arrays;
import java.util.List;

public class PrintHelper {
  public static <T> void printListInOneLine(String title, List<T> filteredElements) {
    System.out.println(title + " " + Arrays.toString(filteredElements.toArray()));
  }

  public static <T> void printValue(String title, T value) {
    System.out.println(title + " " + value);
  }
}
