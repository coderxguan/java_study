package com.itheima.objectDemo;

import java.util.StringJoiner;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/22 20:08
 */


public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;


    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "id = " + id + ", username = " + username + ", password = " + password + ", path = " + path + ", data = " + arrToString();
    }

    private String arrToString() {
        StringJoiner sj = new StringJoiner("," , "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }

        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 深拷贝
        int [] data = this.data;
        int [] newData = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        User u = (User) super.clone();
        u.data = newData;

        // 调用父类中的clone方法
        return u;
    }
}
