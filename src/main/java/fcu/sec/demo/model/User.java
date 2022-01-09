package fcu.sec.demo.model;

/**Product.
 *
 */
public class User {

  private String  ID;

  private String password;

  public User() {
  }

  /**Product.
   *
   * @param id .
   * @param name .
   * @param imageUrl .
   * @param price .
   * @param description .
   */
  public User(String ID, String password) {
    this.ID = ID;
    this.password = password;
  }

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getpassword() {
    return password;
  }

  public void setpassword(String password) {
    this.password = password;
  }

}