package labnine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * This class represents a todo list that adheres to the "todo.txt" format. You
 * can learn more about this format by visiting http://todotxt.org/. It
 * provides all of the variables and methods needed to represent a complete
 * in a todo list, furnishing methods for searching and task done marking.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Gregory M. Kapfhammer
 */

public class TodoList {

  // TODO: Add comments that describe all of the class's variables

  // TODO: Add comments that describe all of the class's methods

  private ArrayList<TodoListItem> todoItems;

  private static final String TODOFILE = "input/todo.txt";

  public TodoList() {
    todoItems = new ArrayList<TodoListItem>();
  }

  public void addTodoItem(TodoListItem todoItem) {
    todoItems.add(todoItem);
  }

  public Iterator<TodoListItem> getTodoItems() {
    return todoItems.iterator();
  }

  public void readTodoItemsFromFile() throws IOException {
    Scanner fileScanner = new Scanner(new File(TODOFILE));
    // iteratively read all of the items from the file
    while (fileScanner.hasNext()) {
      String todoItemLine = fileScanner.nextLine();
      Scanner todoScanner = new Scanner(todoItemLine);
      todoScanner.useDelimiter(",");
      // create the variables for a new item
      String priority;
      String category;
      String task;
      // read in the values for a new item
      priority = todoScanner.next();
      category = todoScanner.next();
      task = todoScanner.next();
      // construct a new item and add it to the TodoList
      TodoListItem todoItem = new TodoListItem(priority, category, task);
      todoItems.add(todoItem);
    }
  }

  /**
   * Mark a specified TodoListItem with an identifier as being done.
   *
   * @author Gregory M. Kapfhammer
   */
  public void markTaskAsDone(int toMarkId) {
    Iterator<TodoListItem> iterator = todoItems.iterator();
    // TODO: Add an implementation that searches for the task(s)
    // that have the toMarkId provided as a formal parameter.
    // Once you find a task, mark it as being done.
  }

  /**
   * Return an iterator of all tasks matching the requested priority.
   *
   * @author Gregory M. Kapfhammer
   */
  public Iterator<TodoListItem> findTasksOfPriority(String requestedPriority) {
    ArrayList<TodoListItem> itemsWithMatchingPriorityList = new ArrayList<TodoListItem>();
    Iterator<TodoListItem> iterator = todoItems.iterator();
    // TODO: Add an implementation that searches for the task(s)
    // that have the requestedPriority provided as a formal parameter.
    // Once you finnd the matching task, add it to a list and then
    // return an iterator of that list to the calling method
    return itemsWithMatchingPriorityList.iterator();
  }

  /**
   * Return an iterator of all tasks matching the requested category.
   *
   * @author Gregory M. Kapfhammer
   */
  public Iterator<TodoListItem> findTasksOfCategory(String requestedCategory) {
    ArrayList<TodoListItem> itemsWithMatchingCategoryList = new ArrayList<TodoListItem>();
    Iterator<TodoListItem> iterator = todoItems.iterator();
    // TODO: Add an implementation that searches for the task(s)
    // that have the requestedCategory provided as a formal parameter
    // Once you finnd the matching task, add it to a list and then
    // return an iterator of that list to the calling method
    return itemsWithMatchingCategoryList.iterator();
  }

  /**
   * Return a textual representation of the entire TodoList.
   *
   * @author Gregory M. Kapfhammer
   */
  public String toString() {
    StringBuffer buffer = new StringBuffer();
    Iterator<TodoListItem> iterator = todoItems.iterator();
    // iterate through all of the TodoListItems
    // in order to build a textual representation
    while (iterator.hasNext()) {
      buffer.append(iterator.next().toString());
      if (iterator.hasNext()) {
        buffer.append("\n");
      }
    }
    // create a String from the StringBuffer and return it
    return buffer.toString();
  }

}
