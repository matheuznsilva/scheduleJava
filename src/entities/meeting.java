package entities;

public class meeting {
    private String subject;
    private String local;
    private Integer startTime;
    private Integer endTime;
    private Integer presence;
    
    public meeting(String subject, String local, Integer startTime, Integer endTime, Integer presence) {
        this.subject = subject;
        this.local = local;
        this.startTime = startTime;
        this.endTime = endTime;
        this.presence = presence;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public String toString() {
        return "meeting [endTime=" + endTime + ", local=" + local + ", presence=" + presence + ", startTime="
                + startTime + ", subject=" + subject + "]";
    }
}
