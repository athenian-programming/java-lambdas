package org.athenian.lambdas._6_streams;

import java.util.List;
import java.util.stream.Collectors;

public class ListStreamExample0 {

  public static void main(String[] args) {

    List<String> names = List.of("Bill", "Mary", "Ted", "Abdul", "Al", "Andy", "Alexander", "Bo");

    // All names with more than 3 chars starting with A
    List<String> vals0 =
        names.stream()
             .filter(s -> s.length() > 3)
             .filter(s -> s.startsWith("A"))
             .collect(Collectors.toList());
    System.out.println(String.format("Names starting with A: %s", vals0));

    // Does list have name "Ted"
    boolean hasTed = names.stream().anyMatch(s -> s.equals("Ted"));
    System.out.println(String.format("Contains name Ted: %s", hasTed));

    // Length of longest name in list
    int maxLen =
        names.stream()
             .mapToInt(s -> s.length())
             .max()
             .orElse(-1);
    System.out.println(String.format("Longest name char count: %d", maxLen));

    // Longest name in list
    String longestName =
        names.stream()
             .sorted((o1, o2) -> o2.length() - o1.length())
             .findFirst()
             .orElse("");
    System.out.println(String.format("Longest name: %s", longestName));

    // Char count of all names longer than 2 chars long
    int len =
        names.stream()
             .filter(s -> s.length() > 2)
             .mapToInt(s -> s.length())
             .sum();
    System.out.println(String.format("Char count of names longer than 3 letters: %d", len));

    // All names up until "Al"
    List<String> beforeAl =
        names.stream()
             .takeWhile(s -> !s.equals("Al"))
             .collect(Collectors.toList());
    System.out.println(String.format("Names before Al: %s", beforeAl));

    // First 5 names
    List<String> first5Names = names.stream().limit(5).collect(Collectors.toList());
    System.out.println(String.format("First 4 names: %s", first5Names));

    // Last 5 names
    List<String> last5Names = names.stream().skip(names.size() - 5).collect(Collectors.toList());
    System.out.println(String.format("Last 5 names: %s", last5Names));
  }
}
