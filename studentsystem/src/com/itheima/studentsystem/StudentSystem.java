package com.itheima.studentsystem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/13 19:52
 */
public class StudentSystem {
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String MODIFY_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";






    public static void startStudentSystem() {

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("-------------welcome to the student manage system----------------");
            System.out.println("1：add student");
            System.out.println("2：delete student");
            System.out.println("3: modify student");
            System.out.println("4：query student");
            System.out.println("5：log out");
            System.out.println("please input your choice:");

            Scanner sc = new Scanner(System.in);

            String choice = sc.next();
            switch (choice){
                case ADD_STUDENT -> addStudent(students);
                case DELETE_STUDENT -> deleteStudent(students);
                case MODIFY_STUDENT -> modifyStudent(students);
                case QUERY_STUDENT -> queryStudent(students);
                case EXIT -> {
                    System.out.println("log out successfully");
                    System.exit(0);
                }
                default-> System.out.println("no this choice");
            }
        }


    }


    // add student
    public static void addStudent(ArrayList<Student> students){
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("please input the student's id:");
            id = sc.next();

            Student s = checkid(students, id);
            if(s != null){
                System.out.println("the id is repeat, please input again!");
            }else{
               break;
            }
        }

        System.out.println("please input the student's name:");
        String name = sc.next();
        System.out.println("please input the student's age:");
        int age = sc.nextInt();
        System.out.println("please input the student's address");
        String address = sc.next();

        stu.setId(id);
        stu.setName(name);
        stu.setAddress(address);
        stu.setAge(age);

        students.add(stu);
    }

    public static void deleteStudent(ArrayList<Student> students){

        while (true) {
            Student stu = new Student();
            Scanner sc = new Scanner(System.in);
            System.out.println("please input the id of the student you'd like to delete:");
            String id = sc.next();
            Student s = checkid(students, id);
            if(s != null){
                students.remove(s);
                System.out.println("delete successfully");
                break;
            }else{
                System.out.println("no such id of student");
            }
        }
    }

    public static void modifyStudent(ArrayList<Student> students){
        while (true) {

            System.out.println("please input the id of the student you'd like to modify:");
            Scanner sc = new Scanner(System.in);
            String id = sc.next();
            Student stu = checkid(students, id);
            if (stu != null) {
                while (true) {
                    System.out.println("please input the student's new id:");
                    id = sc.next();
                    Student s = checkid(students, id);

                    if (s != null) {
                        System.out.println("the id is repeat, please input again!");
                    } else {
                        break;
                    }
                }

                System.out.println("please input the student's new name:");
                String name = sc.next();
                System.out.println("please input the student's new age:");
                int age = sc.nextInt();
                System.out.println("please input the student's  new address");
                String address = sc.next();

                stu.setAge(age);
                stu.setName(name);
                stu.setId(id);
                stu.setAddress(address);

                System.out.println("modify successfully!!");
                break;
            } else {
                System.out.println("no such id of student!!");
            }

        }
    }

    public static void queryStudent(ArrayList<Student> students){
        if(students.size() == 0){
            System.out.println("no student information, please add ");
            return;
        }
        System.out.println("id\t\tname\tage\taddress");

        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            System.out.println(stu.getId()+"\t\t"+ stu.getName() +"\t" + stu.getAge()+"\t"+stu.getAddress());
        }




    }

    private static Student checkid(ArrayList<Student> students, String id) {
        int flag = 0;
        for(Student stu : students){
            if(stu.getId().equals(id)){
                return stu;
            }
        }
        return null;



    }

}
