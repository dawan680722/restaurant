package fcu.sec.demo.controller;

import fcu.sec.demo.model.User;
import fcu.sec.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
   * @param newClient input user
   * @return user object with given id
   */
  @PostMapping("/Users")
  public User login(@RequestBody User newUser) {
    System.out.println(newUser.getID());
    newUser = userService.loginUser(newUser);
    return newUser;
  }

}
