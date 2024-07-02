package session_9_arrays.challenge;

import java.util.ArrayList;

public class Challenge3 {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        studentList.add(" Mary");
        studentList.add("Jack");
        studentList.add("Hannah");
        studentList.add(" Eva");
        studentList.add(" Alice");
        studentList.add(" Maya");
        studentList.add("David");

        graduateStudentList.addAll(studentList);

        System.out.println("Graduated Students: ");
        for (String student : graduateStudentList){
            System.out.println(" " + student);
        }

    }
}
