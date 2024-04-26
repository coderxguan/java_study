package com.itheima.search;


/**
 * 功能:
 * 作者:
 * 日期:2024/04/25 19:17
 */
public class BlockSearch {
    public static void main(String[] args) {
        // 分块查找
        int [] arr = {16, 5, 9, 12, 21, 18,
                    32, 23, 37, 26, 45, 34,
                    50, 48, 61, 52, 73, 66};
        // 分为length^0.5
        // 创建块对象
        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blocks = {b1, b2, b3};

        int number = 21;

        int index = getIndex(blocks, arr, number);
        System.out.println(index);


    }

    private static int getIndex(Block[] blocks, int[] arr, int number) {
        int indexBlock = findIndexBlock(blocks, number);
        if(indexBlock == -1)
        {
            return -1;
        }
        int startIndex = blocks[indexBlock].getStartIndex();
        int endIndex = blocks[indexBlock].getEndIndex();

        for(int i = startIndex; i <= endIndex; i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int findIndexBlock(Block[] blocks, int number){
        for (int i = 0; i < blocks.length; i++) {
            if(number <= blocks[i].getMax()){
                return i;
            }
        }

        return -1;
    }
}
