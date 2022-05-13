package entities;

public class commitment {
    
    private String subject;
    private Integer startTime;
    private Integer endTime;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public String toString() {
        return "Subject: " + subject + " - Start/End: " + startTime + "/" + endTime;
    }
    
}
