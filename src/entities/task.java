package entities;

public class task {
    private String subject;
    private String local;
    private Integer startTime;
    private Integer endTime;
    private Integer effort;
    private Integer priority;
    public task(String subject, String local, Integer startTime, Integer endTime, Integer effort, Integer priority) {
        this.subject = subject;
        this.local = local;
        this.startTime = startTime;
        this.endTime = endTime;
        this.effort = effort;
        this.priority = priority;
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
    public Integer getEffort() {
        return effort;
    }
    public void setEffort(Integer effort) {
        this.effort = effort;
    }
    public Integer getPriority() {
        return priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String toString() {
        return "task [effort=" + effort + ", endTime=" + endTime + ", local=" + local + ", priority=" + priority
                + ", startTime=" + startTime + ", subject=" + subject + "]";
    }
}
