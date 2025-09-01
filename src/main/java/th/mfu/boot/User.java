package th.mfu.boot;

public class User {
    private String username;
    private String displayname;
    private String email;
    
    public User() {}

    public User(String username, String displayname, String email){
        this.username = username;
        this.displayname = displayname;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getDisplayname() {
        return displayname;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}