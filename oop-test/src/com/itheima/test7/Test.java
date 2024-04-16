package com.itheima.test7;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/11 14:04
 */
public class Test {
    public static void main(String[] args) {


        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "zhansan", 23);
        Student stu2 = new Student(2, "lisi", 24);
//        Student stu3 = new Student(3, "wangwu", 25);

        arr[0] = stu1;
        arr[1] = stu2;
//        arr[2] = stu3;
        Student stu4 = new Student(4, "zhaoliu", 26);

        boolean flag = contains(arr, stu4.getId());
        if(flag){
            // id 存在
            System.out.println("当前id重复， 请修改id");
        }else{
            int count = getCount(arr);
            if(count == arr.length){
                // 创建一个新数组
                Student[] newArr = createNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);

            }else{
                arr[count] = stu4;
                printArr(arr);
            }
        }
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println(arr[i].getId()+", " + arr[i].getName() + ", " + arr[i].getAge());
            }
        }
    }

    public static Student[] createNewArr(Student[] arr){
        Student [] newArr = new Student[arr.length +1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getCount(Student[] arr){
        int count= 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] != null)
           {
               if(arr[i].getId() == id){
                   return true;
               }
           }
        }
        return false;
    }
}
