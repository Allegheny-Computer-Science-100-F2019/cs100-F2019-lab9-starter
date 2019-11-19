package labnine;

/**
 * This class represents a todo list item that adheres to the "todo.txt" format. You
 * can learn more about this format by visiting http://todotxt.org/. It
 * provides all of the variables and methods needed to represent a single item
 * in a todo list.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Gregory M. Kapfhammer
 */

public class TodoListItem {

  /** The identifier for a task. */
  private int id;

  /** The next identifier across all tasks. */
  private static int nextId = 0;

  /** The priority of the instance's task. */
  private String priority;

  /** The category of the instance's task. */
  private String category;

  /** The description of the task itself. */
  private String task;

  /** Whether or not the task has been completed. */
  private boolean done;

  /**
   * Construct an instance of the TodoListItem.
   *
   * @author Gregory M. Kapfhammer
   */
  public TodoListItem(String requestedPriority, String requestedCategory, String requestedTask) {
    // TODO: initialize the id and then increment the nextId
    // TODO: set the three variables provided by the constructor
    // TODO: indicate that the newly constructed task is not done
  }

  /**
   * Return the identifier for the TodoListItem.
   *
   * @author Gregory M. Kapfhammer
   */
  public int getId() {
    return id;
  }

  /**
   * Return the priority for the TodoListItem.
   *
   * @author Gregory M. Kapfhammer
   */
  public String getPriority() {
    return priority;
  }

  /**
   * Return the category for the TodoListItem.
   *
   * @author Gregory M. Kapfhammer
   */
  public String getCategory() {
    return category;
  }

  /**
   * Return the category for the TodoListItem.
   *
   * @author Gregory M. Kapfhammer
   */
  public String getTask() {
    return task;
  }

  /**
   * Indicate that the TodoListItem is done.
   *
   * @author Gregory M. Kapfhammer
   */
  public void markDone() {
    done = true;
  }

  /**
   * Determine whether or not the TodoListItem is done.
   *
   * @author Gregory M. Kapfhammer
   */
  public boolean isDone() {
    return done;
  }

  /**
   * Provide a textual representation of the TodoListItem.
   *
   * @author Gregory M. Kapfhammer
   */
  public String toString() {
    return new String(id + ", " + priority + ", " + category + ", " + task + ", done? " + done);
  }

}
