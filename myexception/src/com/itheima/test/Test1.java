package com.itheima.test;

import java.util.Scanner;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/13 12:58
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GirlFriend gf = new GirlFriend();
        while (true) {
            try {
                System.out.println("input the name");
                String name = sc.nextLine();
                gf.setName(name);

                System.out.println("input the age");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);

                break;
            } catch (NumberFormatException e) {
                System.out.println("格式有误, 输入数字");
            }catch(NameFormatException e){
                e.printStackTrace();
            }catch (AgeOutOfBoundException e){
                e.printStackTrace();
            }
        }
        System.out.println(gf);
    }
}
