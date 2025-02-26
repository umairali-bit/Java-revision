package src.dev.lpa;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Main {

    private static Map<String, Purchase> purchases = new LinkedHashMap<>();
    private static NavigableMap<String, Student> students = new TreeMap<>();
    private static final AtomicInteger counter = new AtomicInteger(0);
    public static Supplier<Integer> generateSerialNumber = () -> counter.incrementAndGet();



    public static void main(String[] args) {

        Course jmc = new Course("jmc101", "Java Master Class", "Java");
        Course python = new Course ("pyt101", "Python Master Class", "Python");


        addPurchase("Marty Martin", jmc, 129.99);
        addPurchase("AndyMartin", jmc, 139.99);
        addPurchase("Marty Martin", python, 149.99);
        addPurchase("Joe Jones", jmc, 149.99);
        addPurchase("Bill Brown", python, 119.99);

        addPurchase("Chuck Cheese", python, 119.99);
        addPurchase("Dave Jones", jmc, 139.99);
        addPurchase("Eva East", python, 139.99);
        addPurchase("Fred Forker", jmc, 139.99);
        addPurchase("Greg Brady", python, 129.99);

        purchases.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("------------------");

        students.forEach((key, value) -> System.out.println(generateSerialNumber.get() + ". " + key + ": " + value));



        NavigableMap<LocalDate,List<Purchase>> datedPurchases = new TreeMap<>();

        for (Purchase p : purchases.values()) {
            datedPurchases.compute(p.purchaseDate(),
                    (pdate, plist) -> {
                        List<Purchase> list =
                                (plist == null) ? new ArrayList<>() : plist;
                        list.add(p);
                        return list;

                    });


        }
        datedPurchases.forEach((key, value) -> System.out.println(key + ": " + value));

        int currentYear = LocalDate.now().getYear();

        LocalDate firstDay = LocalDate.ofYearDay(currentYear, 1);
        LocalDate week1 = firstDay.plusDays(7);
        Map<LocalDate,List<Purchase>> week1Purchases = datedPurchases.headMap(week1);
        Map<LocalDate, List<Purchase>> week2Purchases = datedPurchases.tailMap(week1);

        System.out.println("-".repeat(50));
        week1Purchases.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("-".repeat(50));
        week2Purchases.forEach((key, value) -> System.out.println(key + ": " + value));


        displayStats(1, week1Purchases);
        displayStats(2, week2Purchases);



    }

    private static void addPurchase(String name, Course course, double price) {

        Student existingStudent = students.get(name);

        if (existingStudent == null) {
            existingStudent = new Student (name, course);
            students.put(name, existingStudent);
        } else {
            existingStudent.addCourse(course);
        }

        int day = new Random().nextInt(1,15);
        String key = course.courseId() + "_" + existingStudent.getId();
        int year = LocalDate.now().getYear();
        Purchase purchase = new Purchase(course.courseId(), existingStudent.getId(), price, year, day);
        purchases.put(key, purchase);

    }

    //how many of each course were sold for each week
    private static void displayStats (int period,
                                      Map<LocalDate, List<Purchase>> periodData) {

        System.out.println("-".repeat(50));

        Map<String, Integer> weeklyCounts = new TreeMap<>();
        periodData.forEach((key, value) -> {
            System.out.println(key + ": " + value);

            for (Purchase p : value) {
                weeklyCounts.merge(p.courseId(),1,(prev, current) -> {
                    return prev + current;
                });
            }

        });

        System.out.printf("Week %d Purchase = %s%n",period, weeklyCounts );




    }
}
