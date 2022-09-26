package com.hhfedu.pkg;

import java.util.Arrays;

//注意
//建议:我们需要使用哪个类就导入哪个类即可，不建议使用*导入
//import java.util.Scanner;//表示只会引用java.util 包下的Scanner
//import java.util.*;//表是将java.util包下的所有类都引入(导入)
public class import01 {
    public static void main(String[] args) {
        //使用系统提供的Array 完成数组排序
        int[] arr = {-1, 22, 13, 3};
        //比如对其进行排序
        //传统方法，自己编写排序（冒泡）
        //系统是提供了相关的类，可以方便完成 Arrays
        Arrays.sort(arr);
        //输出排序结果
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
