package com.itheima.test3;

/**
 * 功能:
 * 作者:
 * 日期:2024/04/10 21:29
 */
public class GoodsTest {
    public static void main(String[] args) {
        // init an array
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001", "华为P40", 5999.0, 100);
        Goods g2 = new Goods("002", "保温杯", 277, 50);
        Goods g3 = new Goods("003", "枸杞", 12.7, 70);

        // add goods to array
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " +goods.getName()+", " +goods.getPrice()+", "+goods.getCount());

        }
    }


}
