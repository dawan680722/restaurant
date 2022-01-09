package fcu.sec.demo.model;

/**Restaurant.
 *
 */
public class Restaurant {
  private String area;

  private String country;

  private String restaurantName;

  private String restaurantIntroduce;

  private String address;

  private String phone;

  private String openTime;

  private String vegetarian;

  private String priceRange;

  private String dietType;

  private String picture;

  public Restaurant() {

  }

  /**Order.
  *
  */
  public Restaurant(String area, String country,
                      String restaurantName, String restaurantIntroduce,
                      String address, String phone, String openTime,
                      String vegetarian, String priceRange, String dietType, String picture) {
    this.area = area;
    this.country = country;
    this.restaurantName = restaurantName;
    this.restaurantIntroduce = restaurantIntroduce;
    this.address = address;
    this.phone = phone;
    this.openTime = openTime;
    this.vegetarian = vegetarian;
    this.priceRange = priceRange;
    this.dietType = dietType;
    this.picture = picture;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getArea() {
    return area;
  }


  public String getAddress() {
    return address;
  }


  public void setCountry(String country) {
    this.country = country;
  }

  public String getCountry() {
    return country;
  }

  public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
  }

  public String getRestaurantName() {
    return restaurantName;
  }

  public void setRestaurantIntroduce(String restaurantIntroduce) {
    this.restaurantIntroduce = restaurantIntroduce;
  }

  public String getRestaurantIntroduce() {
    return restaurantIntroduce;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getOpenTime() {
    return openTime;
  }

  public void setOpenTime(String openTime) {
    this.openTime = openTime;
  }

  public String getVegetariane() {
    return vegetarian;
  }

  public void setVegetarian(String vegetarian) {
    this.vegetarian = vegetarian;
  }

  public String getPriceRange() {
    return priceRange;
  }

  public void setPriceRange(String priceRange) {
    this.priceRange = priceRange;
  }

  public String getDietType() {
    return dietType;
  }

  public void setDietType(String dietType) {
    this.dietType = dietType;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}
