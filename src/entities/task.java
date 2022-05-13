package entities;

public class task extends commitment{
    
    private Integer effort;
    private Integer priority;

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
        return "Subject: " + getSubject() + " - Start/End: " + getStartTime() + "/" + getEndTime() + " - Priority: " + priority;
    }    
}
