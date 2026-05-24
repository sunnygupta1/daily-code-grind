package javaFeature;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class JavaEleven {

    public static void main(String[] args)
            throws IOException, InterruptedException, URISyntaxException {

        /*
         * =========================================================
         * 1. var Keyword (Local Variable Type Inference)
         * =========================================================
         *
         * Before Java 10:
         *
         * String name = "Sunny";
         * int age = 26;
         * double salary = 24000.50;
         *
         * In Java 11:
         * We can use 'var' for local variables.
         * Compiler automatically decides datatype at compile time.
         *
         * Important:
         * - var works only for local variables
         * - Java is still strongly typed
         */

        System.out.println("========== var Keyword ==========");

        var name = "Sunny";
        var age = 26;
        var salary = 24000.50;

        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);



        /*
         * =========================================================
         * 2. String Methods Added in Java 11
         * =========================================================
         */

        System.out.println("\n========== String Methods ==========");

        String blankString = "   ";
        String emptyString = "";



        /*
         * ---------------------------------------------------------
         * 2.1 isEmpty()
         * ---------------------------------------------------------
         *
         * Checks if string length is 0
         */

        System.out.println("\n--- isEmpty() ---");

        System.out.println("emptyString.isEmpty() : "
                + emptyString.isEmpty());

        System.out.println("blankString.isEmpty() : "
                + blankString.isEmpty());



        /*
         * ---------------------------------------------------------
         * 2.2 isBlank()
         * ---------------------------------------------------------
         *
         * Added in Java 11
         *
         * Checks:
         * - empty string
         * - spaces
         * - tabs
         * - new lines
         */

        System.out.println("\n--- isBlank() ---");

        System.out.println("emptyString.isBlank() : "
                + emptyString.isBlank());

        System.out.println("blankString.isBlank() : "
                + blankString.isBlank());



        /*
         * ---------------------------------------------------------
         * 2.3 lines()
         * ---------------------------------------------------------
         *
         * Before Java 11:
         * We used split("\n")
         *
         * In Java 11:
         * lines() converts string into stream of lines
         */

        System.out.println("\n--- lines() ---");

        String technologies = "Java\nSpring Boot\nDocker";

        technologies.lines()
                .forEach(line -> System.out.println("Technology : " + line));



        /*
         * ---------------------------------------------------------
         * 2.4 repeat()
         * ---------------------------------------------------------
         *
         * Before Java 11:
         * We used loops or StringBuilder
         *
         * In Java 11:
         * repeat() repeats string multiple times
         */

        System.out.println("\n--- repeat() ---");

        String javaText = "Java ";

        System.out.println(javaText.repeat(3));



        /*
         * ---------------------------------------------------------
         * 2.5 strip()
         * ---------------------------------------------------------
         *
         * Before Java 11:
         * trim()
         *
         * In Java 11:
         * strip() is better because it handles Unicode spaces also
         */

        System.out.println("\n--- strip() ---");

        String text = "   Sunny   ";

        System.out.println("Before strip() : '" + text + "'");
        System.out.println("After strip()  : '" + text.strip() + "'");



        /*
         * =========================================================
         * 3. File Reading using Files.readString()
         * =========================================================
         *
         * Before Java 11:
         * We used:
         * - FileReader
         * - BufferedReader
         * - while loop
         *
         * In Java 11:
         * We can directly read file content using readString()
         */

        System.out.println("\n========== File Reading ==========");

        String filePath =
                "/Users/sunny/Desktop/code_practice/daily-code-grind/DailyPractice/src/javaElevenFeature/demo.txt";

        String fileContent = Files.readString(Path.of(filePath));

        System.out.println("File Content:");
        System.out.println(fileContent);



        /*
         * =========================================================
         * 4. HTTP Client API
         * =========================================================
         *
         * One of the biggest Java 11 features.
         *
         * Before Java 11:
         * We used:
         * - HttpURLConnection
         * - Third-party libraries
         *
         * In Java 11:
         * Java introduced official HTTP Client API
         */

        System.out.println("\n========== HTTP Client API ==========");



        /*
         * Step 1:
         * Create HttpClient object
         */

        HttpClient client = HttpClient.newHttpClient();



        /*
         * Step 2:
         * Build HTTP request
         */

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(
                        "https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();



        /*
         * Step 3:
         * Send request and receive response
         */

        HttpResponse<String> response =
                client.send(request,
                        HttpResponse.BodyHandlers.ofString());



        /*
         * Step 4:
         * Print response details
         */

        System.out.println("Response Status Code : "
                + response.statusCode());

        System.out.println("\nResponse Body:");
        System.out.println(response.body());



        /*
         * =========================================================
         * Program Completed
         * =========================================================
         */

        System.out.println("\n========== Java 11 Features Completed ==========");
    }
}