package fcu.sec.demo.service;

import fcu.sec.demo.database.Sql2oDbHandler;
import fcu.sec.demo.model.Order;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;


/**
 * The service used to access the data related to client.
 */
@Service
public class OrderService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public OrderService() {

  }

  /**
   * The service used to access the data related to client.
   */
  public List<Order> getOrders() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select orderName orderName, "
          +
          "restaurantName restaurantName, people people, "
          +
          "orderDate orderDate, orderTime orderTime, phone phone"
          + " from ordercsv";

      return connection.createQuery(query).executeAndFetch(Order.class);
    }
  }

  /**
   * The service used to access the data related to client.
   */
  public List<Order> getOrderp(String phonenum) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select orderName orderName, "
          +
          "restaurantName restaurantName, "
          +
          "people people, orderDate orderDate, orderTime orderTime, phone phone"
          + " from ordercsv where phone like : phonenum";

      return connection.createQuery(query)
          .addParameter("phonenum", Integer.parseInt(phonenum))
          .executeAndFetch(Order.class);
    }
  }
}
