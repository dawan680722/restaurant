package fcu.sec.demo.model;

/**Client.
 *
 */
public class Client {

  private int id;

  private String lastname;

  private String firstname;

  private String email;

  private String mypassword;

  private String birthdayMon;

  private String birthdayDate;

  private String phone;

  public void setId(int id) {
    this.id = id;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMypassword() {
    return mypassword;
  }

  public void setMypassword(String mypassword) {
    this.mypassword = mypassword;
  }

  public String getBirthdayMon() {
    return birthdayMon;
  }

  public void setBirthdayDate(String birthdayDate) {
    this.birthdayDate = birthdayDate;
  }

  public String getBirthdayDate() {
    return birthdayDate;
  }

  public void setBirthdayMon(String birthdayMon) {
    this.birthdayMon = birthdayMon;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}

