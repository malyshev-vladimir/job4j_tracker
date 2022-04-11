package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan");
        student.setGroup("1234567890");
        student.setDateOfAdmission(new Date());

        System.out.println(student.getFullName() + " is in group " + student.getGroup() + " from " + student.getDateOfAdmission());
    }
}
