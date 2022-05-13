package entities;

import exceptions.domineException;
import exceptions.emailInvalidException;

public class user {

    private String nameUser;
    private String emailUser;
    private schedule Schedule;

    public user() {
        this.Schedule = new schedule();
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

    public void setEmailUser(String emailUser) throws emailInvalidException, domineException{
        if(!emailUser.contains("@")){
            throw new emailInvalidException(emailUser);
        } else if (!emailUser.contains(".com")){
            throw new domineException(emailUser);
        } else{
            this.emailUser = emailUser;
        }
    }

    public schedule getSchedule() {
        return Schedule;
    }

    public String toString() {
        return "User:" + nameUser + " - Email: " + emailUser;
    }
}
