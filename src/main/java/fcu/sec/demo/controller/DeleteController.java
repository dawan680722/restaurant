package fcu.sec.demo.controller;

import fcu.sec.demo.model.Restaurant;
import fcu.sec.demo.service.DeleteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



/**RestController.
 *
 */
@RestController
public class DeleteController {

  @Autowired
  private DeleteService deleteService;

  /**
   * Register a user.
   *
   * @param deleterestaurant input user
   * @return user object with given id
   */
  @PostMapping("/delete")
  public Restaurant delete(@RequestBody Restaurant deleterestaurant) {
    System.out.println(deleterestaurant.getRestaurantName());
    deleterestaurant = deleteService.deleterestau(deleterestaurant);
    return deleterestaurant;
  }

}
