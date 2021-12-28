package fcu.sec.demo.service;

import fcu.sec.demo.database.Sql2oDbHandler;
import fcu.sec.demo.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.util.List;

@Service
public class RestaurantService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public RestaurantService() {

  }

  public List<Restaurant> getRestaurants() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select Area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce"
          + " from restaurantcsv";

      return connection.createQuery(query).executeAndFetch(Restaurant.class);
    }
  }
  public List<Restaurant> getRestaurants(String keyword){
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select Area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce"
          + " from restaurantcsv where restaurantName like :keyword";

      return connection.createQuery(query)
          .addParameter("keyword", "%"+keyword+"%")
          .executeAndFetch(Restaurant.class);
    }
  }

  public List<Restaurant> getSouthRestaurants(String keyword){
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select Area area, restaurantName restaurantName, picture picture, priceRange priceRange, restaurantIntroduce restaurantIntroduce"
          + " from restaurantcsv where area like :keyword";

      return connection.createQuery(query)
          .addParameter("keyword", "%"+keyword+"%")
          .executeAndFetch(Restaurant.class);
    }
  }
}
