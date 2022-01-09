package fcu.sec.demo.service;

import fcu.sec.demo.database.Sql2oDbHandler;
import fcu.sec.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.math.BigInteger;
import java.util.List;

/**
 * The service used to access the data related to client.
 */
@Service
public class ClientService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  /**
   * Register a client.
   *
   * @param newClient input client
   * @return client with given id
   */
  public Client registerClient(Client newClient) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "INSERT INTO restaurant.registerdata (lastname,firstname, email,mypassword,birthdayMon,birthdayDate,phone) "
          + "VALUES (:lastname,:firstname,:email,:mypassword,:birthdayMon,:birthdayDate,:phone)";
     connection.createQuery(query)
          .addParameter("firstname", newClient.getFirstname())
          .addParameter("lastname", newClient.getLastname())
          .addParameter("mypassword", newClient.getMypassword())
          .addParameter("birthdayDate", newClient.getBirthdayDate())
          .addParameter("birthdayMon", newClient.getBirthdayMon())
          .addParameter("email", newClient.getEmail())
          .addParameter("phone", newClient.getPhone())
          .executeUpdate();
      return newClient;
    }
  }
}
