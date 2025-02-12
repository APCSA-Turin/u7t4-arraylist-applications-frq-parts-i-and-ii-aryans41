package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0; i < list.size() - 1; i++) {
            int first = i; 
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(first).getLastName().compareTo(list.get(j).getLastName()) > 0) {
                    first = j; 
                } else if (list.get(first).getLastName().compareTo(list.get(j).getLastName()) == 0) {
                    if (list.get(first).getFirstName().compareTo(list.get(j).getFirstName()) > 0) {
                        first = j; 
                    } else if (list.get(first).getFirstName().compareTo(list.get(j).getFirstName()) == 0 && list.get(first).getGpa() < list.get(j).getGpa()) {
                        first = j;
                    }
                }
            } 
            list.add(i, list.get(first));  
            list.remove(first + 1);  
        }
    return list; 
    }
}