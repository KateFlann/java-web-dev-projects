//package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

//        Make a program similar to GradebookHashMap that does the following:
//            It takes in student names and ID numbers (as integers) instead of names and grades.
//            The keys should be the IDs and the values should be the names.
//            Modify the roster printing code accordingly.

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and IDs*
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                int newID = input.nextInt();
                students.put(newStudent, newID);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        int sum = 0;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }
//
//        double avg = sum / students.size();
//        System.out.println("Average grade: " + avg);

    }
    }
