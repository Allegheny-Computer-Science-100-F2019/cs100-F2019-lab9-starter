package labnine;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * This class manages a todo list that adheres to the "todo.txt" format. You
 * can learn more about this format by visiting http://todotxt.org/. It
 * leverages methods in the TodoList and TodoListItem classes.
 *
 * <p>Bugs: This program has no known bugs, but is missing source code
 *
 * @author Gregory M. Kapfhammer
 */
public class TodoListManager {

  /**
   * This is the main method that provides the user interface and calls all of
   * the necessary methods.
   *
   * <p>To run this program, please type: gradle -q --console plain run
   *
   * @author Gregory M. Kapfhammer
   */
  public static void main(String[] args) throws IOException {
    System.out.println("Welcome to the Todo List Manager.");
    System.out.println("What operation would you like to perform?");
    System.out.println("Available options: "
        + "read, priority-search, category-search, done, list, quit");

    // configure reading in values from the user through standard input
    Scanner scanner = new Scanner(System.in);
    TodoList todoList = new TodoList();

    // read in values from the user, process them, and then continue
    while (scanner.hasNext()) {
      String command = scanner.nextLine();
      if (command.equals("read")) {
        todoList.readTodoItemsFromFile();
      } else if (command.equals("list")) {
        System.out.println(todoList.toString());
      } else if (command.equals("priority-search")) {
        System.out.println("What is the priority?");
        String requestedPriority = scanner.nextLine();
        // TODO: call the findTasksOfCategory method with the
        // requestedCategory as an actual parameter.
        // Then, receive the Iterator as a returned result,
        // iterator through it, and print out the returned tasks
      } else if (command.equals("category-search")) {
        System.out.println("What is the category?");
        String requestedCategory = scanner.nextLine();
        // TODO: call the findTasksOfCategory method with the
        // requestedCategory as an actual parameter.
        // Then, receive the Iterator as a returned result,
        // iterator through it, and print out the returned tasks
      } else if (command.equals("done")) {
        System.out.println("What is the identifier of the task?");
        int chosenId = scanner.nextInt();
        todoList.markTaskAsDone(chosenId);
      } else if (command.equals("quit")) {
        System.out.println("Thank you for using the Todo List Manager.");
        // TODO: leave the iteration construct since the
        // user has selected the quit option in the user interface
      }
    }
  }

}
