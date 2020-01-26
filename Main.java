package com.company;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Student S = new Student("6135512026","Jack",3.00);
        Student S1 = new Student("6135512025","Tang",3.00);
        Student S2 = new Student("6135512024","Panda",3.00);
        StudentList A = new StudentList();


        A.addStudent(S);
        A.addStudent(S1);
        A.addStudent(S2);

        A.showAllStudentInfo();
        System.out.println("<<<Befor Remove>>>");

        A.getNumberOfStudent();

        A.searchStudentBystCode("6135512025");
        A.removeStudentBystCode("6135512024");

        System.out.println("<<<After Remove>>>");
        A.showAllStudentInfo();
        System.out.println("------End Program--------");

    }
}
