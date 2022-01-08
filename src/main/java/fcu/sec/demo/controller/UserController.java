package fcu.sec.demo.controller;

import fcu.sec.demo.model.User;
import fcu.sec.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**RestController.
 *
 */
@RestController
public class UserController {


  @Autowired
  UserService userManager;


  @GetMapping("/restaurants/users/{ID}/{mypassword}")
  public List<User> getRestaurantuser(@PathVariable("ID")String ID,@PathVariable("mypassword")String mypassword){
    return userManager.getRestaurantuser(ID,mypassword);
  }
}
