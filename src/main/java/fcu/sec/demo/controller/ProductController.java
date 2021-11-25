package fcu.sec.demo.controller;

import fcu.sec.demo.model.Product;
import fcu.sec.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**RestController.
 *
 */
@RestController
public class ProductController {


  @Autowired
    ProductService productManager;

  @GetMapping("/products")
  public List<Product> getProducts(){
    return productManager.getProducts();


  }
}
