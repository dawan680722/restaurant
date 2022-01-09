package fcu.sec.demo.controller;

import fcu.sec.demo.model.Restaurant;
import fcu.sec.demo.service.RestaurantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;






/**RestController.
 *
 */
@RestController
public class RestaurantController {


  @Autowired
  RestaurantService restaurantManager;


  @GetMapping("/restaurants")
  public List<Restaurant> getRestaurants() {
    return restaurantManager.getRestaurants();
  }

  @GetMapping("/restaurants/{keyword}")
  public List<Restaurant> getRestaurantk(@PathVariable("keyword")String keyword) {
    return restaurantManager.getRestaurantk(keyword);
  }

  @GetMapping("/restaurants/area/{areas}")
  public List<Restaurant> getRestaurantarea(@PathVariable("areas")String areas) {
    return restaurantManager.getRestaurantarea(areas);
  }

  @GetMapping("/restaurants/sort/a/{sorts}")
  public List<Restaurant> getRestaurantsort(@PathVariable("sorts")String sorts) {
    return restaurantManager.getRestaurantsort(sorts);
  }

  @GetMapping("/restaurants/price/1/{prices}")
  public List<Restaurant> getRestaurantprice1(@PathVariable("prices")String prices) {
    return restaurantManager.getRestaurantprice1(prices);
  }

  @GetMapping("/restaurants/price/2/{prices}")
  public List<Restaurant> getRestaurantprice2(@PathVariable("prices")String prices) {
    return restaurantManager.getRestaurantprice2(prices);
  }

  @GetMapping("/restaurants/price/3/{prices}")
  public List<Restaurant> getRestaurantprice3(@PathVariable("prices")String prices) {
    return restaurantManager.getRestaurantprice3(prices);
  }

  @GetMapping("/restaurants/price/4/{prices}")
  public List<Restaurant> getRestaurantprice4(@PathVariable("prices")String prices) {
    return restaurantManager.getRestaurantprice4(prices);
  }

  /**
   * Register a restaurant.
   *
   * @param area input restaurant
   * @return user object with given id
   */
  @RequestMapping(value = "/restaurantAdd", method = RequestMethod.GET)
  @ResponseBody
  public String restaurantAdd(
      @RequestParam("area")String area,
      @RequestParam("country")String country,
      @RequestParam("restaurantName")String restaurantName,
      @RequestParam("restaurantIntroduce")String restaurantIntroduce,
      @RequestParam("address")String address,
      @RequestParam("phone")String phone,
      @RequestParam("openTime")String openTime,
      @RequestParam("vegetarian")String vegetarian,
      @RequestParam("priceRange ")String priceRange,
      @RequestParam("dietType")String dietType,
      @RequestParam("picture")String picture
  ) {
    return restaurantManager.restaurantAdd(area, country, restaurantName,
        restaurantIntroduce, address, phone, openTime,
        vegetarian, priceRange, dietType, picture);
  }

}
