package user;

import operation.*;

import java.util.Scanner;

public class Ordinary extends User {

    public Ordinary(String name) {
        super(name);
        this.operation = new IOperation[]{new ExiOperation(),new FinOperation(),new BorrOperation(),new RetOperation(),new DisOperation()};
    }

    @Override
    public int menu() {
        System.out.println("欢迎" + this.name + "同学进入图书管理系统！");
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("==============");
        int choice = sc.nextInt();
        return choice;
    }
}
