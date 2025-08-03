package org.cquinto;

import java.util.Comparator;

/**
 * Cristian Ezequiel Quinto
 */
public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public static Comparator<Student> byGrade() {
        return new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getGrade(), s2.getGrade());
            }
        };
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student s) {
        String studentName = s.getName();

        return this.getName().compareTo(studentName);
    }

    @Override
    public String toString() {
        return String.format("{%s,%d}", name, grade);
    }

}
