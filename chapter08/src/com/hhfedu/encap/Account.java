package com.hhfedu.encap;

/**
 * 创建程序,在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性。
 * Account 类要求具有属性：姓名（长度为 2 位 3 位或 4 位）、余额(必须>20)、
 * 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
 * 通过 setXxx 的方法给 Account 的属性赋值。
 * 在 AccountTest
 */
public class Account {
    //为了封装将三个属性设置为pravite
    private String name;
    private double balance;//余额
    private String pwd;//密码

    //提供两个构造器


    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名（长度为 2 位 3 位或 4 位）,默认值：无名");
            this.name = "无名氏";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额(必须>20) 默认为0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须为六位 默认密码为 000000");
            this.pwd = "000000";
        }
    }

    //显示所有信息
    public String info() {
        return "账号信息：姓名=" + name + " 余额=" + balance + " 密码=" + pwd;
//        if (mima.equals(password)) {
//            return "账号信息：姓名=" + name + " 余额=" + balance + " 密码=" + pwd;
//        } else {
//            System.out.println("您无访问权限！");
//        }
    }
}
