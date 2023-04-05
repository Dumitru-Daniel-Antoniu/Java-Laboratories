package com.mycompany.laboratory4;

import com.github.javafaker.Faker;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

//This is the homework part
public class Homework {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        System.out.println(name);
        Student s0 = new Student("S0",0);
        Student s1 = new Student("S1",1);
        Student s2 = new Student("S2",2);
        Project p0 = new Project("P0", 0);
        Project p1 = new Project("P1", 1);
        Project p2 = new Project("P2", 2);
        Map<Student, List<Project>> prefMap = new HashMap<>();
        Project[] projects = new Project[10];
        projects[0] = p0;
        projects[1] = p1;
        projects[2] = p2;
        List<Project> projectList = new ArrayList<>();
        projectList.add(projects[0]);
        projectList.add(projects[1]);
        projectList.add(projects[2]);
        prefMap.put(s0, projectList);
        prefMap.put(s1, Arrays.asList(projects[0], projects[1]));
        prefMap.put(s2, Arrays.asList(projects[0]));
        List <Student> listOfStudents = new LinkedList<>();
        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s0);
        Collections.sort(listOfStudents);
        listOfStudents.stream()
                .filter(s -> prefMap.get(s).contains(p0))
                .forEach(System.out::println);
        List<Project> target = Arrays.asList(p1, p2);
        /*List<Student> result = listOfStudents.stream()
                .filter(s -> prefMap.get(s).containsAll(target))
                .collect(Collectors.toList<>);*/
    }
}
