package fcu.sec.demo.controller;

import fcu.sec.demo.model.Client;
import fcu.sec.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**RestController.
 *
 */
@RestController
public class ClientController {

  @Autowired
  private ClientService clientService;

  /**
   * Register a user.
   *
   * @param newClient input user
   * @return user object with given id
   */
  @PostMapping("/register")
  public Client register(@RequestBody Client newClient) {
    System.out.println(newClient.getFirstname());
    newClient = clientService.registerClient(newClient);
    return newClient;
  }

}
