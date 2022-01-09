package fcu.sec.demo.controller;

import fcu.sec.demo.model.User;
import fcu.sec.demo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**RestController.
 *
 */
@RestController
public class UserController {

  @Autowired
  private UserService userService;

  /**
   * Register a user.
   *
   * @param newUser input user
   * @return user object with given id
   */
  @PostMapping("/Users")
  public User login(@RequestBody User newUser) {
    System.out.println(newUser.getID());
    newUser = userService.loginUser(newUser);
    return newUser;
  }

}
