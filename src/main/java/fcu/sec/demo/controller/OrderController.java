package fcu.sec.demo.controller;

import fcu.sec.demo.model.Order;
import fcu.sec.demo.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**RestController.
 *
 */
@RestController
public class OrderController {


  @Autowired
  OrderService orderManager;

  @GetMapping("/orders")
  public List<Order> getOrders() {
    return orderManager.getOrders();
  }

  @GetMapping("/orders/{phonenum}")
  public List<Order> getOrderp(@PathVariable("phonenum")String phonenum) {
    return orderManager.getOrderp(phonenum);
  }
}
