package src;

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




For Set Operation:
Let's say that you're a new manager of a team that consists of three team members working under you, Ann, Bob, and Carol.
Each of these developers is working on a set of tasks.
You've asked your developers to submit what they're working on to you.
You also have a master set of tasks, which your boss sent to you.

You'll be using that data to answer the following questions.
What is the full task list? This is the list of all tasks described by your manager, and any additional tasks the
employees have, that may not be on that list.
Which tasks are assigned to at least one of your 3 team members?
Which tasks still need to be assigned?
Which tasks are assigned to multiple employees?
To do some of this work, create three methods on your Main class.


Be sure the Sets you pass to these methods don't mutate in these methods. In other words, return a new Set.
Create a getUnion method, that takes a List of Sets and will return the union of all the Sets.
Create a getIntersect method, that takes two Sets and returns the intersection of the Sets.
Create a getDifference method, that takes two Sets and removes the second argument's Set from the first.

 */

    public static void main(String[] args) {

        Set<Task> tasks = TaskData.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annsTasks = TaskData.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks,sortByPriority);


        Set<Task> bobsTasks = TaskData.getTasks("Bob");
        Set<Task> carolsTasks = TaskData.getTasks("Carol");
        List<Set<Task>> sets = List.of(annsTasks,bobsTasks,carolsTasks);


        Set<Task> assignedTask = getUnion(sets);
        sortAndPrint("Assigned Tasks", assignedTask);

        //What is the full task list? This is the list of all tasks described by your manager, and any additional tasks
        //employees have, that may not be on that list.

        Set<Task> everyTask = getUnion(List.of(tasks, assignedTask));
        sortAndPrint("The True Task List", everyTask);


        //missing tasks
        Set<Task> missingTasks = getDifference(everyTask, tasks);
        sortAndPrint("The Missing Tasks", missingTasks);


        Set<Task> unassignedTasks = getDifference(tasks, assignedTask);
        sortAndPrint("The Unassigned Tasks", unassignedTasks);


        Set<Task> overlap = getUnion(List.of(
                getIntersection(annsTasks, bobsTasks),
                getIntersection(carolsTasks,bobsTasks),
                getDifference(annsTasks, carolsTasks)
        ));

        sortAndPrint("Assigned to Multiples", overlap, sortByPriority);

        List<Task> overlapping = new ArrayList<>();
        for (Set<Task> set : sets) {
            Set<Task> dupes = getIntersection(set, overlap);
            overlapping.addAll(dupes);

        }

        Comparator<Task> priorityNatural = sortByPriority.thenComparing(
                Comparator.naturalOrder());


        sortAndPrint("Overlapping", overlapping, priorityNatural);













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

    private static Set<Task> getUnion(List<Set<Task>> sets) {

        Set<Task> union = new HashSet<>();

        for (var task : sets) {
            union.addAll(task);
        }
        return union;

    }

    private static Set<Task> getIntersection (Set<Task> a, Set<Task> b) {

        Set<Task> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        return intersection;
    }

    private static Set<Task> getDifference (Set<Task> a, Set<Task> b) {

        Set<Task> result = new HashSet<>(a);
        result.removeAll(b);

        return result;
    }


}
