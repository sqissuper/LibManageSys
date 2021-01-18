package user;

import operation.*;

import java.util.Scanner;

public class Administrator extends User{

    public Administrator(String name) {
        super(name);
        this.operation = new IOperation[]{new ExiOperation(),new FinOperation(),new AddOperation(),new DelOperation(),new DisOperation()};
    }

    @Override
    public int menu() {
        System.out.println("欢迎" + this.name + "进入图书管理系统！");
        Scanner sc = new Scanner(System.in);
        System.out.println("=============");
        System.out.println("1.查找图书");
        System.out.println("2.增加图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("=============");
        int choice = sc.nextInt();
        return choice;
    }
}
