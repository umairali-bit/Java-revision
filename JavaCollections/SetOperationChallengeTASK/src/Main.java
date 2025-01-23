import java.util.*;

public class Main {
/*
Create a class that represents a Task. It should have an assignee, a project name, a task description, a status, a priority,
High, Low or Medium. Each of these attributes should be editable.

A task is uniquely identified by its project name and description. The task should implement Comparable, so that tasks
are sorted  by project name and description.



 */

    public static void main(String[] args) {

        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);




    }

    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header,collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task> collection, Comparator<Task> sorter) {


        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }


}
