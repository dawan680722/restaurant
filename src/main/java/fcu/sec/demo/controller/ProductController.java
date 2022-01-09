package fcu.sec.demo.controller;

import fcu.sec.demo.model.Product;
import fcu.sec.demo.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**RestController.
 *
 */
@RestController
public class ProductController {


  @Autowired
    ProductService productManager;

  @GetMapping("/products")
  public List<Product> getProducts() {
    return productManager.getProducts();
  }

  @GetMapping("/products/{keyword}")
  public List<Product> getProducts(@PathVariable("keyword")String keyword) {
    return productManager.getProducts(keyword);
  }
}
