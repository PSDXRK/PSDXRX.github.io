//package 的作用是声明当前类所在的包，需要放在类(或者文件)的最上面，
// 一个类中最多只有一句 package
package com.hhfedu.pkg;//pkg是项目模块名

//import 指令 位置放在 package 的下面，在类定义前面,可以有多句且没有顺序要求
import java.util.Arrays;
import java.util.Scanner;

//类定义
public class PkgDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, -1, 12, 33};
        Arrays.sort(arr);
    }
}
