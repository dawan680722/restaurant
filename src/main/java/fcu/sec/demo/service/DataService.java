package fcu.sec.demo.service;

import fcu.sec.demo.database.Sql2oDbHandler;
import fcu.sec.demo.model.Data;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

/**Product.
 *
 */
@Service
public class DataService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public DataService() {
  }

  /**Restaurant.
  *
  */
  public List<Data> getDatas() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select orderName orderName , "
          +
                "restaurantName restaurantName, people people, "
          +
                "orderDate orderDate, orderTime orderTime, phone phone"
          +
                " from ordercsv";

      return connection.createQuery(query).executeAndFetch(Data.class);
    }
  }

}
