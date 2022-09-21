package com.main;

import com.beans.Student;
import com.util.InputUtil;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       int menu = InputUtil.requireNumber("What do you want to do?" +
               "\n1. Register Student" +
               "\n2. Show all students" +
               "\n3. Find student" +
               "\n4. Update Student");

        if (menu == 1) {

            int count = InputUtil.requireNumber("Nece telebe qeydiyyatdan kecireceksiz?");
            Config.students = new Student[count];

            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". Register");

                String name = InputUtil.requireText("enter name");
                String surname = InputUtil.requireText("enter surname");
                String className = InputUtil.requireText("enter class");
                int age = InputUtil.requireNumber("enter age");


                Student st = new Student(name, surname, age, className);
                Config.students[i] = st;
            }
            System.out.println("registration completed successfully");
            for (int i = 0; i < Config.students.length; i++) {
                Student st = Config.students[i];
                System.out.println(st.getName()+" "+ st.getSurname()+" "+ st.getAge()+" "+st.getClassName());
            }

        }


    }
}
