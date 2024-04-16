package com.itheima.studentsystem;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/13 21:42
 */
public class APP {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();

        while (true) {
            System.out.println("welcome to student manage system");
            System.out.println("please choose: 1. log in   2. register   3. forget password  4. exit");
            Scanner sc = new Scanner(System.in);
            String choice= sc.next();

            switch (choice){

                case "1" -> login(list);
                case "2" -> register(list);
                case "3" ->forgetPwd(list);
                case "4" -> {
                    System.out.println("thank for using , see you next time!!");
                    System.exit(0);
                }
                default -> System.out.println("no this choice");
            }
        }
    }


    public static void login(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("please input username:");
            String username = sc.next();
            // judge username whether exist
            boolean flag = contains(list, username);

            if(!flag){
                System.out.println("username: " + username + " not register, please register first");
                return;
            }

            System.out.println("please input password");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("the right code : " + rightCode);
                System.out.println("please input verification code: ");
                String code = sc.next();

                if(code.equalsIgnoreCase(rightCode)){
                    System.out.println("verification code is valid!");
                    break;
                }
                else{
                    System.out.println("verification code is invalid!!!!");
                }
            }


            User userinfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list, userinfo );

            if(result){
                System.out.println("login successfully , welcome to use student manage system!!!!");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            }else{
                System.out.println("login failed, have error with username or password");
                if(i == 2){
                    System.out.println("the current account is locked, please contact management:xxx-xxx");
                    return;
                }{
                    System.out.println("you have error with username or password, leave " + (2-i) + "times chance");
                }
            }
        }
    }

    private static boolean checkUserInfo(ArrayList<User> list,  User userinfo) {
        for (User user : list) {
            if(user.getUsername().equals(userinfo.getUsername())&&
            user.getPassword().equals(userinfo.getPassword())){
                return true;
            }
        }
        return false;

    }

    private static boolean checkUsername(String username) {
        int len = username.length();
        if(len< 3 || len > 15){
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9'))){
                return false;
            }
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')){
                return true;
            }
        }
        return false;
    }

    public static void register(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        String username;
        String password;
        String personID;
        String phoneNumber;

        // input username
        while (true) {
            System.out.println("please input username:");
            username = sc.next();

            boolean ret1 =  checkUsername(username);
            if(!ret1){
                System.out.println("the format of username is not valid, please input again:");
                continue;
            }

            boolean ret2 = contains(list, username);
            if(ret2){
                System.out.println("username: " + username+ "is exist , please input other:");
            }
            else{
                // input others info
                System.out.println("username: " + username+ "is available");
                break;
            }
        }

        //input pwd
        while (true) {

            System.out.println("please input the password:");
            password = sc.next();
            System.out.println("please input the password for ensuring");
            String againPassword = sc.next();
            if(!password.equals(againPassword)){
                System.out.println("twice input password are unconformity, please repeat inputting:");
            }
            else{
                break;
            }
        }

        // input id
        while (true) {
            System.out.println("please input personID");
            personID = sc.next();
            boolean ret = checkPersonID(personID);
            if(ret) {
                System.out.println("personID is available");
                break;
            }else{
                System.out.println("the format of personID is error, please input again!!");
            }
        }

        //input phoneNumber
        while (true) {
            System.out.println("please input phoneNumber:");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if(flag){
                System.out.println("the format of phoneNumber is valid");
                break;
            }else{
                System.out.println("the format of phoneNumber is invalid, please input again!!");
            }
        }

        User u = new User(username, password, personID, phoneNumber);
        list.add(u);
        System.out.println("register successfully");


        printList(list);



    }

    private static void printList(ArrayList<User> list) {
         for(User u : list){
             System.out.println(u.getUsername() + ", " + u.getPassword()+", "
             +u.getPersonID() + ", " + u.getPhoneNumber());


         }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 11){
             return false;
        }

        if(phoneNumber.startsWith("0")){
            return false;
        }

        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(!(c >= '0'&& c <= '9')){
                return false;
            }
        }
        return true;
    }

    private static boolean checkPersonID(String personID) {
        if(personID.length() !=18){
            return false;
        }

        if(personID.startsWith("0")){
            return false;
        }
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);

            if(!(c >='0'&& c <='9')){
                return false;
            }
        }

        char end = personID.charAt(personID.length() - 1);

        return (end >= '0' && end <= '9') || (end == 'x') || (end == 'X');

    }

    private static boolean contains(ArrayList<User> list, String username) {
        for (User user : list) {
            String rightUsername = user.getUsername();
            if (rightUsername.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public static void forgetPwd(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("please input username: ");
        String username = sc.next();
        boolean flag = contains(list, username);
        if(!flag){
            System.out.println("username: " + username + "not register, please register first");
            return ;
        }

        System.out.println("please input personID: ");
        String personID = sc.next();
        System.out.println("please input phoneNumber: ");
        String phoneNumber = sc.next();

        int index = findIndex(list, username);
        User user = list.get(index);
        if(!(user.getPersonID().equalsIgnoreCase(personID)&& user.getPhoneNumber().equals(phoneNumber))){
            System.out.println("personID or phoneNumber do not match , can not modify password");
            return;
        }


        while (true) {
            System.out.println("please input new password: ");
            String password = sc.next();
            System.out.println("please input new password again: ");
            String newPwd = sc.next();
            if(password.equals(newPwd)){
               user.setPassword(password);
                System.out.println("password modify successfully!!");
                break;
            }
            else{
                System.out.println("the twice input unconformity, please input again!!");
            }
        }

    }

    private static int findIndex(ArrayList<User> list, String username) {

        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getUsername().equals(username)){
                return i;

            }
        }
        return -1;
    }


    // generate a verification code
    private static String getCode(){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);

        }
        int number = r.nextInt(10);
        sb.append(number);

        char[] arr = sb.toString().toCharArray();

        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length-1];
        arr[arr.length -1] = temp;

        return new String(arr);
    }
}
