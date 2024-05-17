package com.itheima.myiotest1;

import cn.hutool.core.text.StrBuilder;
import cn.hutool.crypto.SignUtil;

import javax.swing.text.StyledEditorKit;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 功能:
 * 作者:
 * 日期:2024/05/17 12:13
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        // 获取姓氏: https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
        // 男生名字: http://www.haoming8.cn/baobao/10881.html
        // 女生名字: http://www.haoming8.cn/baobao/7641.html



        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";


        String firstName = webCrawler(familyNameNet);
        String boyName = webCrawler(boyNameNet);
        String girlName = webCrawler(girlNameNet);


//        System.out.println(firstName);
//        System.out.println(boyName);
//        System.out.println(girlName);

        ArrayList<String> firstNameTemp = getData(firstName, "([[\\u4E00-\\u9FA5]]{4})(，|。)", 1);
        ArrayList<String> boyNameTemp = getData(boyName, "([\\u4E00-\\u9FA5]{2})(。|、)", 1);
        ArrayList<String> girlNameTemp = getData(girlName, "(.. ){4}..", 0);


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

        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest\\names.txt"));
        for (String s : info) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();



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

    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            list.add(matcher.group(index));
        }

        return list;
    }


    public static String webCrawler(String net) throws IOException {
        StrBuilder sb = new StrBuilder();

        URL url = new URL(net) ;

        URLConnection conn = url.openConnection();

        //读取数据

        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while((ch = isr.read()) != -1){
            sb.append((char)ch);
        }

        isr.close();

        return sb.toString();

    }
}
