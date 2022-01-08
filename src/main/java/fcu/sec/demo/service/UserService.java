package fcu.sec.demo.service;

import fcu.sec.demo.database.Sql2oDbHandler;
import fcu.sec.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public UserService() {

  }


  public List<User> getRestaurantuser(String ID,String mypassword){
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select ID ID, mypassword mypassword"
          + " from user where ID = :ID and mypassword = :mypassword";

      return connection.createQuery(query)
          .addParameter("ID","'"+ID+"'","mypassword",Integer.parseInt(mypassword))
          .executeAndFetch(User.class);
    }
  }

}
