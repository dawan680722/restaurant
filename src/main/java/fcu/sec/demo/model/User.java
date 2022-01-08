package fcu.sec.demo.model;

public class User {
  private String ID;

  private String mypassword;

  public User() {
  }

  public User(String ID, String mypassword) {
    this.ID = ID;
    this.mypassword = mypassword;
  }
  public void setID(String ID) {
    this.ID = ID; }

  public String getID() {
    return ID;
  }

  public void setMypassword(String mypassword) {
    this.mypassword = mypassword; }

  public String getMypassword() {
    return mypassword;
  }

  }
