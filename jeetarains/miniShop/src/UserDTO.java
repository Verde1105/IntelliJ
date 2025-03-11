public class UserDTO  {

    private String id = "";
    private String pw = "";
    private String name = "";
    private String 회원번호 = "";

    public String get회원번호() {
        return 회원번호;
    }

    public void set회원번호(String 회원번호) {
        this.회원번호 = 회원번호;
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
}
