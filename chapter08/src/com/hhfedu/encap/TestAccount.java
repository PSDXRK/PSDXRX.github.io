package com.hhfedu.encap;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("jacksmith");
        account.setBalance(10.0);
        account.setPwd("1234560");
        System.out.println(account.info());
        //如果我么们直接使用构造器指定属性
        System.out.println("=======直接构造器定义属性后的信息========\n");
        Account account1 = new Account("jack", 30.0, "123456");
        System.out.println(account1.info());
    }
}
