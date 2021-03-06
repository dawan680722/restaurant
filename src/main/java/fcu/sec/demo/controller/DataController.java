package fcu.sec.demo.controller;

import fcu.sec.demo.model.Data;
import fcu.sec.demo.service.DataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



/**RestController.
 *
 */
@RestController
public class DataController {


  @Autowired
  DataService dataManager;

  @GetMapping("/datas")
    public List<Data> getDatas() {
    return dataManager.getDatas();
  }
  //   @GetMapping("/restaurants/{keyword}")
  //    public List<Restaurant> getRestaurantk(@PathVariable("keyword")String keyword){
  //        return restaurantManager.getRestaurantk(keyword);
  //    }
  //    @GetMapping("/restaurants/area/{areas}")
  //    public List<Restaurant> getRestaurantarea(@PathVariable("areas")String areas){
  //        return restaurantManager.getRestaurantarea(areas);
  //    }
  //    @GetMapping("/restaurants/sort/a/{sorts}")
  //    public List<Restaurant> getRestaurantsort(@PathVariable("sorts")String sorts){
  //        return restaurantManager.getRestaurantsort(sorts);
  //    }
  //    @GetMapping("/restaurants/price/1/{prices}")
  //    public List<Restaurant> getRestaurantprice1(@PathVariable("prices")String prices){
  //        return restaurantManager.getRestaurantprice1(prices);
  //    }
  //    @GetMapping("/restaurants/price/2/{prices}")
  //    public List<Restaurant> getRestaurantprice2(@PathVariable("prices")String prices){
  //        return restaurantManager.getRestaurantprice2(prices);
  //    }
  //    @GetMapping("/restaurants/price/3/{prices}")
  //    public List<Restaurant> getRestaurantprice3(@PathVariable("prices")String prices){
  //        return restaurantManager.getRestaurantprice3(prices);
  //    }
  //    @GetMapping("/restaurants/price/4/{prices}")
  //    public List<Restaurant> getRestaurantprice4(@PathVariable("prices")String prices){
  //        return restaurantManager.getRestaurantprice4(prices);
  // }
}
