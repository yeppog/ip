package duke.task;

/**
 * This class encapsulates a Task.
 * Contains the boolean logic to store if a task has been completed, as well as the task description.
 */

public class Task {
    /**
     * The description of the task.
     */
    protected String description;
    /**
     * The status of the task if it has been completed
     */
    protected boolean isDone;

    /**
     * Basic constructor to create a task.
     *
     * @param description The description of the task.
     */

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }


    /**
     * Constructor for a task, where the isDone condition can be set.
     * @param description The description of the task.
     * @param isDone The status of completion of the task.
     */
    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    /**
     * Gets the string representation of the status.
     *
     * @return X or empty string depending on the state of isDone
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    /**
     * Setter for isDone to true.
     */
    public void markAsDone() {
        this.isDone = true;
    }


    /**
     * Overriding method to print a duke.task.Task object.
     *
     * @return String representation of the task instance.
     */
    @Override
    public String toString() {
        return String.format("[%s] %s",
                this.getStatusIcon(),
                this.description);
    }


    /**
     * Gets the string of the save-friendly version of the object.
     *
     * @return The String of the save-friendly version of the object.
     */
    public String saveString() {
        return String.format("T|%s|%s",
                this.description,
                isDone ? "1" : "0");
    }

    /**
     * Getter to get the description of the task
     *
     * @return String of the description.
     */
    public String getDescription() {
        return this.description;
    }
}
