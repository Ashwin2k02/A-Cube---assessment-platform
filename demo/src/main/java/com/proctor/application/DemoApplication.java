package com.proctor.application;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    static String username;
    static String email;
    static String password;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Candidate Process Flow - CLI Interface");
            System.out.println("---------------------------------------");
            System.out.println("1. Register or Login");
            System.out.println("2. Profile");
            System.out.println("3. Tutorials");
            System.out.println("4. Assessments");
            System.out.println("5. Practice");
            System.out.println("6. Courses");
            System.out.println("7. Report");
            System.out.println("Type 'exit' to quit.");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "register":
                case "login":
                    registerOrLogin();
                    break;
                case "profile":
                    Profile();
                    break;
                case "tutorials":
                    Tutorials();
                    break;
                case "assessments":
                    Assessments();
                    break;
                case "practice":
                    Practice();
                    break;
                case "courses":
                    Courses();
                    break;
                case "report":
                    Report();
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
        scanner.close();
        System.out.println("Exiting the Assessment Platform. Goodbye!");
    }

    static Scanner scanner = new Scanner(System.in);

    private static void Report() {
        System.out.println("Reports of " + username);
        System.out.println("---------------------------------------");
        System.out.println("Assessment Performance: Excellent");
        System.out.println("Practice Sessions: Completed 5/10");
        System.out.println("Detailed Performance Metrics:");
        System.out.println(" - Java Certification: 85%");
        System.out.println(" - Data Structures: 90%");
        System.out.println(" - Web Development: 75%");
    }

    private static void Courses() {
        System.out.println("Available Courses:");
        System.out.println("1. Java Programming");
        System.out.println("2. Data Structures");
        System.out.println("3. Web Development");
        System.out.println("Enroll in a course to enhance your skills!");
        System.out.print("Would you like to enroll in a course? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter Course Number to Enroll: ");
            int courseNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enrolled in Course Number: " + courseNumber);
        }
    }

    private static void Practice() {
        System.out.println("Practice Sessions:");
        System.out.println("1. Java Basics");
        System.out.println("2. Advanced Algorithms");
        System.out.println("3. Database Queries");
        System.out.println("Select a session to start practicing.");
        System.out.print("Enter Practice Session Number: ");
        int sessionNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Starting Practice Session: " + sessionNumber);
        // Simulate a practice session
        System.out.println("Practice session in progress...");
    }

    private static void Assessments() {
        System.out.println("Available Assessments:");
        System.out.println("1. Java Certification Test");
        System.out.println("2. Data Structures Exam");
        System.out.println("3. Web Development Quiz");
        System.out.print("Choose an assessment to start: ");
        int assessmentNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Starting Assessment: " + assessmentNumber);
        // Simulate an assessment
        System.out.println("Assessment in progress...");
    }

    private static void Tutorials() {
        System.out.println("Tutorials:");
        System.out.println("1. Introduction to Java");
        System.out.println("2. Understanding Data Structures");
        System.out.println("3. Building Web Applications");
        System.out.println("Watch tutorials to learn new concepts.");
        System.out.print("Enter Tutorial Number to Watch: ");
        int tutorialNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Playing Tutorial: " + tutorialNumber);
        // Simulate watching a tutorial
        System.out.println("Tutorial in progress...");
    }

    private static void Profile() {
        System.out.println("Profile : " + username);
        System.out.println("---------------------------------");
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.print("Would you like to update your profile? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter new Email: ");
            email = scanner.nextLine();
            System.out.print("Enter new Password: ");
            password = scanner.nextLine();
            System.out.println("Profile updated successfully.");
        }
    }

    private static void registerOrLogin() {
        System.out.println("Register : - Enter your details below.");

        System.out.print("Username: ");
        username = scanner.nextLine();

        System.out.print("Email: ");
        email = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();

        System.out.println("Registration/Login successful for user: " + username);
    }
}
