package entities;

public class meeting extends commitment{

    private String local;
    private Boolean presence;
    
    public String getLocal() {
        return local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public Boolean getPresence() {
        return presence;
    }
    
    public void setPresence(Boolean presence) {
        this.presence = presence;
    }

    public String toString() {
        return "Subject: " + getSubject() + " - Start/End: " + getStartTime() + "/" + getEndTime() + " - Presence: " + presence;
    }
}
