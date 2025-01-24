import java.util.*;

public class Main {
/*
You'll need to create a class that represents a Task.
It should have
an assignee.
a project name.
a task description.
a status (assigned, in progress, or not yet assigned).
a priority, High, Low, or Medium.
Each of these attributes should be editable.

A task is uniquely identified by its project name and description.
The task should implement Comparable, so that tasks are sorted by project name and description.

The TaskData class will be used to set up and return some test data.
If you want to use my data, it can be found in a CSV file in the resources section of this video, and consists of the following:
All tasks identified by the manager.
Tasks identified by Ann, that she's working on or plans to work on.
Tasks which Bob says have been assigned to him.
Tasks Carol is doing, as reported by herself.
This class should have a getTasks method, that returns a Set of Task. This method should take a String, either the name of one of the employees to get a specific Set, or 'all' to get the full task Set.







 */

    public static void main(String[] args) {

        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks,sortByPriority);




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
