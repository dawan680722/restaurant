package fcu.sec.demo.model;

public class Data {
    private String orderName;

    private String restaurantName;

    private String people;

    private String orderData;

    private String orderTime;

    private String phone;

    public Data() {
    }

    public Data(String orderName, String restaurantName, String people, String orderData, String orderTime, String phone, String openTime, String vegetarian, String priceRange, String dietType, String picture) {
        this.orderName = orderName;
        this.restaurantName = restaurantName;
        this.people = people;
        this.orderData = orderData;
        this.orderTime = orderTime;
        this.phone = phone;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName; }

    public String getOrderName() {
        return orderName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;}

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getPeople() { return people;}

    public void setOrderData(String orderData) {
        this.orderData = orderData;
    }

    public String getOrderData() {
        return orderData;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }


}
