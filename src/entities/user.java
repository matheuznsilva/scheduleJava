package entities;

public class user {
    private String nameUser;
    private String emailUser;
    private String passwordUser;
    private Integer id;
    
    public user(String nameUser, String emailUser, String passwordUser, Integer id) {
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
        this.id = id;
    }
    
    public String getNameUser() {
        return nameUser;
    }
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public String getEmailUser() {
        return emailUser;
    }
    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }
    public String getPasswordUser() {
        return passwordUser;
    }
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return "user [emailUser=" + emailUser + ", id=" + id + ", nameUser=" + nameUser + ", passwordUser="
                + passwordUser + "]";
    }
    
}
