package org.athenian.lambdas._0_fluent_calls;

public class FluentExample {

  public static void main(String[] args) {

    // Non-fluent calls
    var str1 = "This is a test";
    str1 = str1.toUpperCase();
    str1 = str1.replaceAll("IS", "98");
    str1 = str1.substring(0, 8);

    System.out.println("Non-fluent String: " + str1);


    // Fluent calls
    var str2 =
        "This is a test"
            .toUpperCase()
            .replaceAll("IS", "98")
            .substring(0, 8);

    System.out.println("Fluent String: " + str2);


    // Non-fluent calls
    var bill = new Student();
    bill.setFirstName("Bill");
    bill.setLastName("Jones");
    bill.setStreet("123 Main");
    bill.setCity("Danville");
    bill.setZip("94528");
    bill.setParkingSpot("A23");

    System.out.println("Non-fluent Bill: " + bill);


    // Fluent calls
    var lisa =
        new Student()
            .setFirstName("Lisa")
            .setLastName("Johnson")
            .setStreet("456 Drury")
            .setCity("San Ramon")
            .setZip("94548")
            .setParkingSpot("B55");

    System.out.println("Fluent Lisa: " + lisa);

    var walter =
        new Student()
            .setZip("94565")
            .setStreet("789 Civic")
            .setCity("Dublin")
            .setFirstName("Walter")
            .setLastName("Mullen")
            .setLastName("Thomas")
            .setParkingSpot("A44");

    System.out.println("Fluent Walter: " + walter);
  }
}
