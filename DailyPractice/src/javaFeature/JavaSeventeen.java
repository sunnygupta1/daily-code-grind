package javaFeature;

/*
 * =========================================================
 * Java 17 Features
 * =========================================================
 *
 * Important Features Covered:
 *
 * 1. Text Blocks
 * 2. Records
 * 3. Switch Expression
 * 4. Pattern Matching for instanceof
 * 5. Sealed Classes
 *
 * Java 17 is an LTS (Long Term Support) version.
 */

public class JavaSeventeen {

    public static void main(String[] args) {

        /*
         * =========================================================
         * 1. Text Blocks
         * =========================================================
         *
         * Before Java 15/17:
         * We used:
         * - \n
         * - String concatenation
         *
         * Problem:
         * Hard to read large JSON/XML/SQL
         */

        System.out.println("========== Text Blocks ==========");

        String json = """
                {
                    "name": "Sunny",
                    "technology": "Java 17"
                }
                """;

        System.out.println(json);



        /*
         * =========================================================
         * 2. Records
         * =========================================================
         *
         * Before Java 17:
         * We manually created:
         * - fields
         * - constructor
         * - getter
         * - setter
         * - toString()
         * - equals()
         * - hashCode()
         *
         * In Java 17:
         * record automatically creates:
         * - constructor
         * - getter methods
         * - toString()
         * - equals()
         * - hashCode()
         */

        System.out.println("\n========== Records ==========");

        Employee employee = new Employee(101, "Sunny");

        System.out.println("Employee ID   : " + employee.id());
        System.out.println("Employee Name : " + employee.name());

        System.out.println("Record Output : " + employee);



        /*
         * =========================================================
         * 3. Switch Expression
         * =========================================================
         *
         * Before Java 17:
         * We used:
         * - break statements
         * - multiple lines
         *
         * In Java 17:
         * Cleaner syntax using ->
         */

        System.out.println("\n========== Switch Expression ==========");

        String day = "MONDAY";

        String result = switch (day) {

            case "MONDAY" -> "Week Started";

            case "SUNDAY" -> "Holiday";

            default -> "Normal Day";
        };

        System.out.println("Day Result : " + result);



        /*
         * =========================================================
         * 4. Pattern Matching for instanceof
         * =========================================================
         *
         * Before Java 17:
         *
         * if(obj instanceof String) {
         *     String s = (String) obj;
         * }
         *
         * In Java 17:
         * No manual casting needed
         */

        System.out.println("\n========== Pattern Matching ==========");

        Object obj = "Learning Java 17";

        if (obj instanceof String data) {

            System.out.println("String Length : " + data.length());

            System.out.println("String Value  : " + data);
        }



        /*
         * =========================================================
         * 5. Sealed Classes
         * =========================================================
         *
         * Before Java 17:
         * Any class could extend parent class
         *
         * In Java 17:
         * We can control inheritance
         */

        System.out.println("\n========== Sealed Classes ==========");

        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bike();

        vehicle1.start();
        vehicle2.start();



        /*
         * =========================================================
         * Program Completed
         * =========================================================
         */

        System.out.println("\n========== Java 17 Features Completed ==========");
    }
}



/*
 * =========================================================
 * Record Example
 * =========================================================
 */

record Employee(int id, String name) {

}



/*
 * =========================================================
 * Sealed Class Example
 * =========================================================
 */

sealed class Vehicle permits Car, Bike {

    public void start() {

        System.out.println("Vehicle Started");
    }
}



/*
 * =========================================================
 * Allowed Child Class 1
 * =========================================================
 */

final class Car extends Vehicle {

    @Override
    public void start() {

        System.out.println("Car Started");
    }
}



/*
 * =========================================================
 * Allowed Child Class 2
 * =========================================================
 */

final class Bike extends Vehicle {

    @Override
    public void start() {

        System.out.println("Bike Started");
    }
}