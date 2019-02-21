package entity;

import java.util.Date;

public class Task {

    public final static String TASK_SEPARATOR = "#";

    private Long userId;
    private Long taskId;
    private String taskName;
    private String taskDescription;
    private Date creationDate;
    private Boolean isDone;
    private Date completionDate;

    public Task(Long userId, Long taskId, String taskName, String taskDescription, Date creationDate, Boolean isDone) {
        this.userId = userId;
        this.taskId = userId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.creationDate = creationDate;
        this.isDone = isDone;
        this.completionDate = null;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Boolean getDone() {
        return isDone;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    @Override
    public String toString() {
        String completionDateString = "null";
        if (isDone) {
            completionDateString = completionDate.toString();
        }
        return userId + TASK_SEPARATOR + taskId + TASK_SEPARATOR + taskName+ TASK_SEPARATOR +taskDescription
                + TASK_SEPARATOR + creationDate.toString() + TASK_SEPARATOR + isDone + TASK_SEPARATOR + completionDateString;
    }

}
