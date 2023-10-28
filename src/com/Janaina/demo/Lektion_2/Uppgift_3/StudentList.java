package com.Janaina.demo.Lektion_2.Uppgift_3;

import com.Janaina.demo.Lektion_2.Uppgifter.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public void switchStudents() {
        List<Student> students = new ArrayList<>();

        Student benny = new Student("Benny", 20);
        Student frida = new Student("Frida", 22);

        students.add(benny);
        students.add(frida);

        System.out.println("Original List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Swap the positions of Benny and Frida
        int bennyIndex = students.indexOf(benny);
        int fridaIndex = students.indexOf(frida);
        if (bennyIndex != -1 && fridaIndex != -1) {
            students.set(bennyIndex, frida);
            students.set(fridaIndex, benny);
        }

        System.out.println("\nList After Swapping:");
        for (Student student : students) {
            System.out.println(student);
        }


    }
}
