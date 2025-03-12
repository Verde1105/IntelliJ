public class UserDTO {

  //판매자 회원  seller
  //구매자 회원 buyer
  //관리자 회원 manager
  private String userType = "seller";
  private String id = "";
  private String pw = "";
  private String name = "";
  private String userNum = "";

  public UserDTO() {
  }

  public String getUserNum() {
    return userNum;
  }

  public void setUserNum(String userNum) {
    this.userNum = userNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPw() {
    return pw;
  }

  public void setPw(String pw) {
    this.pw = pw;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }
}
