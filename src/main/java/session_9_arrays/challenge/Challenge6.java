package session_9_arrays.challenge;

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();

        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Charlie");
        studentList.add("David");
        studentList.add("Eve");
        studentList.add("Mary");

        System.out.println("Initial list of students: " + studentList);

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a student name to check: ");
        String studentName = scanner.nextLine();

        if (studentList.contains(studentName)){
            studentList.remove(studentName);
            System.out.println(studentName + " has been removed from the list");
        }else {
            System.out.println(studentName + " is not in the list.");

            scanner.close();
        }
    }
}
