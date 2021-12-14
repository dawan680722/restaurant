package fcu.sec.demo.controller;

import fcu.sec.demo.model.Restaurant;
import fcu.sec.demo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**RestController.
 *
 */
@RestController
public class RestaurantController {


  @Autowired
  RestaurantService restaurantManager;

  @GetMapping("/restaurants")
  public List<Restaurant> getRestaurants(){
    return restaurantManager.getRestaurants();
  }
  @GetMapping("/restaurants/{keyword}")
  public List<Restaurant> getRestaurants(@PathVariable("keyword")String keyword){
    return restaurantManager.getRestaurants(keyword);
  }
}
