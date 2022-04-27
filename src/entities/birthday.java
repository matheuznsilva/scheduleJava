package entities;

public class birthday {
    private String subject;
    private String name;
    private String local;
    private Integer startTime;
    private Integer endTime;
    private Integer presence;

    public birthday(String subject, String name, String local, Integer startTime, Integer endTime, Integer presence) {
        this.subject = subject;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "birthday [endTime=" + endTime + ", local=" + local + ", name=" + name + ", presence=" + presence
                + ", startTime=" + startTime + ", subject=" + subject + "]";
    }
    
}
