package org.athenian.lambdas._0_fluent_calls;

public class FluentExample {

  public static void main(String[] args) {

    // Non-fluent calls
    Student bill = new Student();
    bill.setFirstName("Bill");
    bill.setLastName("Jones");
    bill.setStreet("123 Main");
    bill.setCity("Danville");
    bill.setZip("94528");
    bill.setParkingSpot("A23");

    System.out.println(bill);

    // Fluent calls
    Student lisa =
        new Student()
            .setFirstName("Lisa")
            .setLastName("Johnson")
            .setStreet("456 Drury")
            .setCity("San Ramon")
            .setZip("94548")
            .setParkingSpot("B55");

    System.out.println(lisa);

  }
}
