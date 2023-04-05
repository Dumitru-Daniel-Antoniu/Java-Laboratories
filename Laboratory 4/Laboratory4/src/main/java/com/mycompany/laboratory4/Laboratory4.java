package com.mycompany.laboratory4;

//import java.util.stream;
import java.util.List;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

//Here it is the compulsory part
public class Laboratory4 {
    public static void main(String[] args) {
        Student s0 = new Student("S0",0);
        Student s1 = new Student("S1",1);
        Student s2 = new Student("S2",2);
        Project p0 = new Project("P0", 0);
        Project p1 = new Project("P1", 1);
        Project p2 = new Project("P2", 2);
        List <Student> listOfStudents = new LinkedList<>();
        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s0);
        Collections.sort(listOfStudents);
        for(Student student : listOfStudents ) {
             System.out.println(student.getName());
        }
        Set <Project> treeOfProjects = new TreeSet<>();
        treeOfProjects.add(p1);
        treeOfProjects.add(p2);
        treeOfProjects.add(p0);
        for(Project project : treeOfProjects) {
            System.out.println(project.getName());
        }
    }
}
