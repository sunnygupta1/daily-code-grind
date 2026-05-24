package javaFeature;

/*
 * =========================================================
 * Java 21 Features
 * =========================================================
 *
 * Important Features Covered:
 *
 * 1. String Templates (Preview Concept)
 * 2. Sequenced Collections
 * 3. Virtual Threads
 * 4. Record Patterns
 * 5. Pattern Matching for switch
 *
 * Java 21 is an LTS (Long Term Support) version.
 */

import java.util.ArrayList;
import java.util.List;

public class JavaTwentyOne {

    public static void main(String[] args) throws InterruptedException {

        /*
         * =========================================================
         * 1. String Templates (Preview Feature)
         * =========================================================
         *
         * Before:
         * We used:
         * - String concatenation
         * - String.format()
         *
         * Example:
         *
         * String msg = "Hello " + name;
         *
         * Java 21 introduced String Templates as preview feature.
         *
         * NOTE:
         * Preview feature needs special JVM enable flag.
         * So here we are only understanding concept.
         */

        System.out.println("========== String Template Concept ==========");

        String name = "Sunny";

        String oldWay = "Hello " + name;

        System.out.println("Old Style Output : " + oldWay);



        /*
         * =========================================================
         * 2. Sequenced Collections
         * =========================================================
         *
         * Java 21 added methods like:
         * - getFirst()
         * - getLast()
         * - addFirst()
         * - addLast()
         */

        System.out.println("\n========== Sequenced Collection ==========");

        List<String> technologies = new ArrayList<>();

        technologies.add("Java");
        technologies.add("Spring Boot");
        technologies.add("Docker");

        System.out.println("First Element : "
                + technologies.getFirst());

        System.out.println("Last Element  : "
                + technologies.getLast());



        /*
         * =========================================================
         * 3. Virtual Threads
         * =========================================================
         *
         * Biggest Java 21 Feature
         *
         * Before Java 21:
         * Platform threads were heavy.
         *
         * Problem:
         * Large number of threads consumed huge memory.
         *
         * Java 21:
         * Virtual threads are lightweight threads.
         *
         * We can create thousands/millions of threads.
         */

        System.out.println("\n========== Virtual Threads ==========");

        Thread virtualThread = Thread.startVirtualThread(() -> {

            System.out.println("Running inside Virtual Thread");

            System.out.println("Thread Name : "
                    + Thread.currentThread());
        });

        virtualThread.join();



        /*
         * =========================================================
         * 4. Record Pattern
         * =========================================================
         *
         * Helps extract record data directly.
         */

        System.out.println("\n========== Record Pattern ==========");

        Employee employee = new Employee(101, "Sunny");

        if (employee instanceof Employee(int id, String empName)) {

            System.out.println("Employee ID   : " + id);

            System.out.println("Employee Name : " + empName);
        }



        /*
         * =========================================================
         * 5. Pattern Matching for switch
         * =========================================================
         *
         * Cleaner type checking in switch.
         */

        System.out.println("\n========== Pattern Matching Switch ==========");

        Object obj = 100;

        String result = switch (obj) {

            case Integer i -> "Integer Value : " + i;

            case String s -> "String Value : " + s;

            default -> "Unknown Type";
        };

        System.out.println(result);



        /*
         * =========================================================
         * Program Completed
         * =========================================================
         */

        System.out.println("\n========== Java 21 Features Completed ==========");
    }
}



/*
 * =========================================================
 * Record Example
 * =========================================================
 */
// Employee record is already present in seventeen so cant create here.