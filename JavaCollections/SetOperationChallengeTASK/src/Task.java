

enum Priority { HIGH, LOW, MEDIUM};

enum Status {IN_QUEUE, ASSIGNED, IN_PROGRESS}

public class Task implements Comparable <Task> {

//Create a class that represents a Task. It should have an assignee, a project name, a task description, a status, a priority,
//High, Low or Medium. Each of these attributes should be editable.


    private String assignee;
    private String projectName;
    private String description;
    private Status status;
    private Priority priority;

    public Task(String projectName, String description, String assignee, Priority priority, Status status) {

        this.assignee = assignee;
        this.projectName = projectName;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Task(String projectName, String description, String assignee, Priority priority) {
        this(assignee, projectName, description, priority,
                assignee == null ? Status.IN_QUEUE : Status.ASSIGNED);
    }

    public Task(String projectName, String description, Priority priority) {
        this (projectName, description, null, priority);


    }

 //Each of the attributes should be editable.
    public String getAssignee() {
        return assignee;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }


    @Override
    public int compareTo(Task o) {

        int result = this.projectName.compareTo(o.projectName);
        if (result == 0) { // if result == 0 that means project is the same, then sort by task

            result = this.description.compareTo(o.description);

        }
        return result;

    }

    @Override
    public String toString() {
        return "%-20s %-25s %-10s %-10s %s".formatted(projectName, description, priority, assignee, status);
    }

  //A task should be uniquely identified by its project name and description.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (!getProjectName().equals(task.getProjectName())) return false;
        return getDescription().equals(task.getDescription());
    }

    @Override
    public int hashCode() {
        int result = getProjectName().hashCode();
        result = 31 * result + getDescription().hashCode();
        return result;
    }
}
