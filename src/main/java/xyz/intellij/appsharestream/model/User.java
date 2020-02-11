package xyz.intellij.appsharestream.model;


public class User {

  private long userId;
  private String userNikename;
  private String userPwd;
  private String userEmail;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserNikename() {
    return userNikename;
  }

  public void setUserNikename(String userNikename) {
    this.userNikename = userNikename;
  }


  public String getUserPwd() {
    return userPwd;
  }

  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

}
