package com.itheima.polymorphismDemo2.polymorphismDemo1;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/16 19:33
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("lisi");
        s.setAge(14);

        Teacher t = new Teacher();
        t.setName("david");
        t.setAge(30);

        Administrator a = new Administrator();
        a.setName("admin");
        a.setAge(44);


        register(s);

        register(t);

        register(a);

    }

    public static void register(Person person){
        person.show();
    }
}
