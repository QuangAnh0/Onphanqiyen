package com.example.ontapphanquyen.model;

import java.util.*;

public class Student   {
    private int id;
    private String name;
    private int age;
    private double GPA;

    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,"QA1",33,8.22));
        studentList.add(new Student(2,"QA2",29,8.44));
        studentList.add(new Student(3,"QA3",20,7.84));
        studentList.add(new Student(4,"QA4",21,7.03));
         Collections.sort(studentList, new Comparator<Student>() {
             @Override
             public int compare(Student o1, Student o2) {
                 return o1.getAge()-o2.getAge();
             }
         });
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));

        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }

    public Student(int id, String name, int age, double GPA) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }
//    @Override
//    public  int compare()
//    @Override
//    public int compareTo(Student student) {
//        return student.getAge()-this.getAge();
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
