package org.athenian.lambdas._0_fluent_calls;

public class Student {

  private String firstName;
  private String lastName;
  private String street;
  private String city;
  private String zip;
  private String parkingSpot;

  public Student() {
  }

  public String getFirstName() {
    return firstName;
  }

  public Student setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getLastName() {
    return lastName;
  }

  public Student setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getStreet() {
    return street;
  }

  public Student setStreet(String street) {
    this.street = street;
    return this;
  }

  public String getCity() {
    return city;
  }

  public Student setCity(String city) {
    this.city = city;
    return this;
  }

  public String getZip() {
    return zip;
  }

  public Student setZip(String zip) {
    this.zip = zip;
    return this;
  }

  public String getParkingSpot() {
    return parkingSpot;
  }

  public Student setParkingSpot(String parkingSpot) {
    this.parkingSpot = parkingSpot;
    return this;
  }

  @Override
  public String toString() {
    return new StringBuilder("Student{")
        .append("firstName='").append(firstName).append('\'')
        .append(", lastName='").append(lastName).append('\'')
        .append(", street='").append(street).append('\'')
        .append(", city='").append(city).append('\'')
        .append(", zip='").append(zip).append('\'')
        .append(", parkingSpot='").append(parkingSpot).append('\'')
        .append('}')
        .toString();
  }
}
