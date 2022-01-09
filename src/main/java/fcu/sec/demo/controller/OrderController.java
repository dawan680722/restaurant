package fcu.sec.demo.controller;
import fcu.sec.demo.model.Order;
import fcu.sec.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**RestController.
 *
 */
@RestController
public class OrderController {

  @Autowired
  OrderService orderManager;

  @GetMapping("/orders")
  public List<Order> getOrders(){
    return orderManager.getOrders();
  }

  @GetMapping("/orders/{keyword}")
  public List<Order> getOrderp(@PathVariable("keyword")String keyword){
    return orderManager.getOrderp(keyword);
  }
}
