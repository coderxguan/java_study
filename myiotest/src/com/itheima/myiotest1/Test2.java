package com.itheima.myiotest1;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;
import org.apache.commons.io.FileUtils;

import java.util.*;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/17 15:53
 */
public class Test2 {
    public static void main(String[] args) {
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

//        ArrayList<String> firstNameTemp = getData(firstName, "([[\\u4E00-\\u9FA5]]{4})(，|。)", 1);
//        ArrayList<String> boyNameTemp = getData(boyName, "([\\u4E00-\\u9FA5]{2})(。|、)", 1);
//        ArrayList<String> girlNameTemp = getData(girlName, "(.. ){4}..", 0);

        List<String> firstNameTemp = ReUtil.findAll("([\\u4E00-\\u9FA5]{4})(，|。)", familyNameStr, 1);
        List<String> boyNameTemp = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(。|、)", boyNameStr, 1);
        List<String> girlNameTemp = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

        System.out.println(firstNameTemp);
        System.out.println(boyNameTemp);
        System.out.println(girlNameTemp);

        //处理数据

        ArrayList<String> fName = new ArrayList<>();
        for (String str : firstNameTemp) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                fName.add(c + "");
            }
        }


        ArrayList<String> bName = new ArrayList<>();
        for (String str : boyNameTemp) {
            if(!bName.contains(str)){
                bName.add(str);
            }
        }

        ArrayList<String> gName = new ArrayList<>();
        for (String str : girlNameTemp) {
            for (String s : str.split(" ")) {
                gName.add(s);
            }
        }


        ArrayList<String> info = getInfo(fName, bName, gName, 70, 50);
        Collections.shuffle(info);


        FileUtil.writeLines(info, "names.txt", "utf-8");

    }

    public static ArrayList<String> getInfo(ArrayList<String> fName, ArrayList<String> bName, ArrayList<String> gName, int boyCount, int girlCount){
        HashSet<String> boyhs = new HashSet<>();
        while (true){
            if(boyhs.size() == boyCount){
                break;
            }
            Collections.shuffle(fName);
            Collections.shuffle(bName);

            boyhs.add(fName.get(0) + bName.get(0));
        }
        HashSet<String> girlhs = new HashSet<>();
        while (true){
            if(girlhs.size() == girlCount){
                break;
            }
            Collections.shuffle(fName);
            Collections.shuffle(gName);

            girlhs.add(fName.get(0) + gName.get(0));
        }

        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();


        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;
            list.add(boyName + "-男-" + age);
        }

        for (String girlName : girlhs) {
            int age = r.nextInt(10)  + 18;
            list.add(girlName + "-女-" + age);


        }
        return list;
    }
}
