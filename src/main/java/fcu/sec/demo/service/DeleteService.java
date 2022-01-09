package fcu.sec.demo.service;

import fcu.sec.demo.database.Sql2oDbHandler;
import fcu.sec.demo.model.Restaurant;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;


/**
 * The service used to access the data related to client.
 */
@Service
public class DeleteService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  /**
   * Register a client.
   *
   * @param deleterestaurant input client
   * @return client with given id
   */
  public Restaurant deleterestau(Restaurant deleterestaurant) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "DELETE FROM restaurant.restaurantcsv "
          + "where restaurantName = :restaurantName";
      connection.createQuery(query)
          .addParameter("restaurantName", deleterestaurant.getRestaurantName())
          .executeUpdate();
      return deleterestaurant;
    }
  }
}
