package fcu.sec.demo.model;

public class Order {
  private String orderName;

  private String restaurantName;

  private String people;

  private String orderDate;

  private String orderTime;

  private String phone;

  public Order() {
  }

  public Order(String orderName, String restaurantName, String people, String orderDate, String orderTime, String phone) {
    this.orderName = orderName;
    this.restaurantName = restaurantName;
    this.people = people;
    this.orderDate = orderDate;
    this.orderTime = orderTime;
    this.phone = phone;
  }
  public void setorderName(String orderName) {
    this.orderName = orderName; }

  public String getorderName() {
    return orderName;
  }

  public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
  }

  public String getRestaurantName() {
    return restaurantName;
  }

  public void setpeople(String people) {
    this.people = people;
  }

  public String people() {
    return people;
  }

  public void setorderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public String getorderTime() {
    return orderTime;
  }

  public void setOpenTime(String orderTime) {
    this.orderTime = orderTime;
  }
  public String getorderDate() {
    return orderDate;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getphone() {
    return phone;
  }

}
