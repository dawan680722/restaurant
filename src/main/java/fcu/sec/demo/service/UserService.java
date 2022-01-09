package fcu.sec.demo.service;

import fcu.sec.demo.database.Sql2oDbHandler;
import fcu.sec.demo.model.Restaurant;
import fcu.sec.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.math.BigInteger;
import java.util.List;

/**
 * The service used to access the data related to client.
 */
@Service
public class UserService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  /**
   * Register a client.
   *
   * @param newClient input client
   * @return client with given id
   */
  public User loginUser(User newUser) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "SELECT ID, password "
          + "from restaurant.user where ID = :ID and password = :password";
      connection.createQuery(query)
          .addParameter("ID", newUser.getID())
          .addParameter("password", newUser.getpassword())
          .executeAndFetch(User.class);
      return newUser;
    }
  }
}
